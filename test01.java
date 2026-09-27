class test {
    public int x,y;

    public test(){
        x=500;
        y=90;
    }

    public test(int x,int y){
        this.x=x;
        this.y=y;
    }

}

public class test01 extends test {

    public int a,b;

    public test01(){
        this(99,9);//here this key word is used because to show local chaining as the control will go to the 
        a=100;//paramatrized test01(inta,intb) the 99 =a and 9=b
        b=500;
    }

    public test01(int a,int b){
        //super(a,b); this does the constructor chaining like gives control to parent class  constructor having paramaters
        
        this.a=a;
        this.b=b;
    }

    public void display(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
    }

}

class maintest{

    public static void main (String [] args){

        test01 t01=new test01(10,20);

        t01.display();
    }
}
