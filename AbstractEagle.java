abstract class bird{
    abstract void eat();
    abstract void fly();
}

abstract class eagle extends bird{

    void fly(){
        System.out.println("eagle flies in sky");
    }
}

class baldeagle extends eagle{

    void eat(){
        System.out.println("idk actually");
    }

}

class serpanteagle extends eagle{

    void eat(){
        System.out.println("it eats serpant");
    }
}

class eagleee{
    public static void main(String [] args){
    serpanteagle se=new serpanteagle();
    se.fly();   
    se.eat();
    baldeagle be=new baldeagle();
    be.fly();
    be.eat();

    //if u give parent ref
    //bird b=new serpanteagle();
    //b.fly();
    //b.eat();

    }
}