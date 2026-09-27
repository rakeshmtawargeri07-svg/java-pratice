class test1{
    static int a,b;
    //int x,y;
    static{
        System.out.println("Static block executed");
        a=10;
        b=20;
    }

    static void function(){
        System.out.println("Static function executed");
    }

    int x,y;

    {
        System.out.println("Instance block executed");
    }

    public void function2(){
        System.out.println("Instance function executed");
    }

    test1(){
        System.out.println("inside Constructor ");
        int x=20;
        int y=30;
    }
}


class test2{
    public static void main(String[] args){
        test1.function();
        test1 t=new test1();
        t.function2();
    }
}