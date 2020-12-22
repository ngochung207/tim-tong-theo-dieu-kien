public class lop_chu_nhat {
    double width;
    double height;

    public  lop_chu_nhat(){

    }
    public lop_chu_nhat(double _width, double _height){
        this.width = _width;
        this.height = _height;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return  (this.width + this.height) * 2;
    }

    public String display(){
        return "Rectangle{" + "width=" + this.width + ", height=" + this.height + "}";
    }
}
