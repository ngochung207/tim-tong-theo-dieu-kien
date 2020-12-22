import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sumTotalTest {

    @Test
    @DisplayName("case search binary")
    void binarySearchTest() {
        int[] arr = {10, 5, 3, 13, 1, 1, 12, 100};
        int value = 10;
        int result = sumTotal.binarySearch(sumTotal.sortArray(arr), value);
        int expected = 4;
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("case search value in array")
    void searchValueInArrayTest() {
        int[] arr = {12,5,3,13,10,1,12,100};
        int value = 10;
        int result = sumTotal.searchValueInArray(arr,value);
        int expected = 4;
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("sum total")
    void getSumTotalTest() {
        int[] arr = {12,5,3,13,10,1,12,14,2,100};
        int value = 14;
        String result = sumTotal.getSumTotal(arr,value);
        String expected = "1 13" +
                "2 12";
        assertEquals(expected,result);
    }
}