import java.util.Scanner;

class circle{

    private float r;
    private float pi;
    private float area;

    public void acceptinginput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        r=sc.nextFloat();
        pi=3.14f;
    }

    public void calculatearea(){
         area=pi*r*r;
    }
    public void dispalyarea(){
        System.out.println("Area of circle is: "+area);
    }

}

class area{
    public static void main(String[]args){
        circle c=new circle();
        c.acceptinginput();
        c.calculatearea();
        c.dispalyarea();
    }
}