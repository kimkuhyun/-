package basic;

public class Rect_02 {

    public int width;
    public int height;

    public Rect_02(){
    }
    public Rect_02(int w, int h) {
        width = w;
        height = h;
    }

    public int getRectArea(int a, int b){
        int area = width*height;
        return area;
    }

    public int getRectPerimeter(int a, int b){
        int perimeter = (width+height) * 2;
        return perimeter;
    }





}
