public class RectangleArea {
    
    int length;
    int breadth;
    public RectangleArea(int length, int breadth) //parameterise
    {
        super();
        this.length = length;
        this.breadth = breadth;


    }
    public void area()
    {
        int a =length*breadth;
        System.out.println("Area=" + a);
    }
}
