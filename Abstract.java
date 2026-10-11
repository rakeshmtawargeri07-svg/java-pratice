import java.util.Scanner;

abstract class shape{

    float area;

    abstract void acceptinput();
    abstract void calarea();

    public void area(){
        System.out.println("area of shape is: "+area);
    }
}

class square extends shape{

    float side;
    void acceptinput(){
        Scanner sc=new Scanner(System.in);
        side=sc.nextInt();
    }

    void calarea(){
        area=side*side;
    }
}

class rectangle extends shape{

    float length;
    float bredth;

    void acceptinput(){
        Scanner sc=new Scanner(System.in);
        length=sc.nextInt();
        bredth=sc.nextInt();
    }
    void calarea(){
        area=length*bredth;
    }

}

class circleee extends shape{
    
    float radius;

    void acceptinput(){
        Scanner sc=new Scanner(System.in);
        radius=sc.nextInt();
    }

    void calarea(){
        area=3.14f*radius*radius;
    }
}

class geometry{

    static void perm(shape ref){
        ref.acceptinput();
        ref.calarea();
        ref.area();
    }
}

class Abstract {
    public static void main(String[] args) {

        square s=new square();
        rectangle r=new rectangle();
        circleee c=new circleee();

        geometry.perm(s);
    

    
    }
}