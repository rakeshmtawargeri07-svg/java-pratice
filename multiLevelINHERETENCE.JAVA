class demo{

    int a=10;

    public void des(){
        System.out.println("this is demo class");
    }
    

}

class demo1 extends demo{

    int b=90;

    public void dis2(){
        System.out.println("this is demo1 class");
    }

}

class demo2 extends demo1{

    int c=100;

    public void dis3(){
        System.out.println("this is demo2 class");
    }

    public void displayall(){
        system.out.println("Value of a is: "+a);
        system.out.println("Value of b is: "+b);
        system.out.println("Value of c is: "+c);
    }
}
class demoMAIN{
    public static void main(String args[]){
        demo2 d = new demo2();
        d.dis3();
        d.dis2();
        d.des();
        d.displayall();

    }
}