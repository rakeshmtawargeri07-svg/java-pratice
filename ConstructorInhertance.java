public class  ConstructorInhertance //here though there is not written extends but this 1st class written will also be inherted from object 
                                    // here it is written as ConstructorInhertance extends object(main and top class in java)
                                    //so constructor 1 also gets exectuded before even geting created 
{

    //private int x;

    public  ConstructorInhertance(){
        //super(); 
        // //this is called by default even if not written explicitly because it is method by which the controll from
        //current constructor class is passed to the parent constructor i.e is object
       
       // x=100;
       System.out.println("1st class gets executed after thsi second ");
    }
    
}

class ConstructorInhertance01 extends ConstructorInhertance {

    //private int y;

    public ConstructorInhertance01(){
        //super();
        //y=100;
        System.out.println("2nd got inhereted");
    }

}

class mainCode{
    public static void main(String [] args){


         //super(); //this is called by default even if not written explicitly because it is method by which the controll from
        //current constructor class is passed to the parent constructor i.e is ConstructorInhertance
              
       ConstructorInhertance01 c1=new ConstructorInhertance01();
        

    }
}