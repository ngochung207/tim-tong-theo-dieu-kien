public class sumTotal {

    public static void main(String[] args) {
        int[] array = {385454,129506769,517477,1370000,897000,960000,29328690};
        int value = 31084144;
        System.out.println(getSumTotal(array,value));
    }

    public static String getSumTotal(int[] array,int value) {
        String str = "";
        int number = 0;
        // Kiểm tra tổng các số trong dẫy với số đưa vào
        if (value > sumTotal(array)){
            return "Không có nghiệm";
        }
        if (value < minArray(array)){
            return "Không có nghiệm";
        }

        int[] newArray = sortArray(array);
        for (int i = 0; i < newArray.length; i++) {
            str = "";
            number = value;
            for (int j = i; j < newArray.length; j++) {
                str += String.valueOf(newArray[j]) + '\t';

                int delta = number - newArray[j];
                if (delta >= 0) {
//                    int[] arr = cropArray(newArray, i);
                    int index = binarySearch(newArray, delta);
                    if (index == -1) {
                        number = delta;
                        continue;
                    } else {
                        str += String.valueOf(newArray[index]);
                    }
                } else {
                    continue;
                }
                System.out.println(str);
                str = "";
                number = value;
                break;
            }
        }
        return "Done";
    }

    public static int binarySearch(int arr[], int number) {
        int uBound = 0;
        int lBound = arr.length - 1;

        while (uBound <= lBound) {
            int index = uBound + (lBound - uBound) / 2;

            if (arr[index] == number) {
                return index;
            }
            if (arr[index] < number) {
                uBound = index + 1;
            } else {
                lBound = index - 1;
            }

        }
        return -1;
    }

    public static int searchValueInArray(int arr[],int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                return i;
            }
        }
        return -1;
    }

    public static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int temp = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (temp > array[j]) {
                    array[i] = array[j];
                    array[j] = temp;
                    temp = array[i];
                }
            }
        }
        return array;
    }

    public static int[] cropArray(int[] array, int index){
        int size = array.length;
        int result[] = new int[size-index-1];
        for (int i = 0; i < (size-index-1); i++) {
            result[i] = array[index+1+i];
        }
        return result;
    }

    public static int sumTotal(int[] array){
        int sum = 0;
        for(int i: array){
            sum += i;
        }
        return sum;
    }

    public static int minArray(int[] array){
        int result = array[0];
        for (int i: array){
            result = i;
        }
        return result;
    }

}
