class MethodOverWriting {
    
    public void displying(){
        System.out.println("this is normal without overwritten sentance");
    }
}

public class method extends MethodOverWriting{

    public void displying1(){ //dont change access modifier of method who is overwrtting 1st class method content or else increase the amont of accessbality
        //keep same or increase accessablity of accessmodifier
        System.out.println("this is  overwritten sentance");
    }

}

class master{
public static void main(String [] args){
method m=new method();
m.displying1();
}
}

//////////////rule 2

class MethodOverWriting {
    
    public void displying(){
        System.out.println("this is normal without overwritten sentance");
    }
}

public class method extends MethodOverWriting{

    public void displying1(){ //dont change the return type in both as both must be same or else it will give error
        System.out.println("this is  overwritten sentance");
    }

}

class master{
public static void main(String [] args){
method m=new method();
m.displying1();
}
}

/////////////rule 3

class plain{
}                                  ///is a relation between plain and cargoplane class as cargoplane is a child class of plain class

class cargoplane extends plain{

}

class MethodOverWriting{

    plane fun(){//this is a method which is returning plane class object we can use plane as it is what we returninng 
        System.out.println("this is normal without overwritten sentance");
        plane p=new plane();
        return p;//object return
    }
}

class method extends MethodOverWriting{
    cargoplane fun(){
        cargoplane cp=new cargoplane();
        return cp;
    }
}

