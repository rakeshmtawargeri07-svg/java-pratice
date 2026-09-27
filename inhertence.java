class demo1{

    int a=10;

}

class demo2 extends demo1{

    public void display(){
        System.out.println("Value of a is: "+a);
    }

}

class demo{
    public static void main(String args[]){
        demo2 d = new demo2();
        d.display();    
    }
}