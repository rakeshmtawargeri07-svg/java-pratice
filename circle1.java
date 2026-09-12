import java.util.Scanner;

class circle{

    private float r;
    private static float pi;
    //as u can see we made it static so that it can be used by all the objects of the class circle and not waste memory by intializing it again and again in instances of objects 
    private float area;

    static{
        pi=3.142f;
    }

    public void acceptinginput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        r=sc.nextFloat();
    }

    public void calculatearea(){
         area=pi*r*r;
    }
    public void dispalyarea(){
        System.out.println("Area of circle is: "+area);
    }

}

class circle1{
    public static void main(String[]args){
        circle c=new circle();
        c.acceptinginput();
        c.calculatearea();
        c.dispalyarea();
    }
}