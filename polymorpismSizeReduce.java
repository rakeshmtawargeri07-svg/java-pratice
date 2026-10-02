class plane01{
    void fun(){
        System.out.println("flys in sky");
    }
    void land(){
    System.out.println("plane is lading");
    }
    void takeoff(){
        System.out.println("plane taking off");
    }
}
class cargoplane01 extends plane01{
    void fun(){
        System.out.println("flys in sky and carry goods");
    }
    void land(){
        System.out.println("cargo plane is landing");
    }
    void takeoff(){
        System.out.println("cargo plane taking off");
    }
}

class passengerplane01 extends plane01{
    void fun(){
        System.out.println("flys at medium hight");
    }
    void land(){
        System.out.println("passenger plane is landing");
    }
    void takeoff(){
        System.out.println("passenger plane taking off");
    }

}

class fighterjet01 extends plane01{
    void fun(){
        System.out.println("flys at high hight");
    }
    void land(){
        System.out.println("fighter jet is landing");
    }
    void takeoff(){
        System.out.println("fighter jet taking off");
    }
}

class Hanger{
    static void permission( plane01 ref){
       ref.takeoff();
       ref.land();
       ref.fun();

    } 

}

class Tightcoupling{
    public static void main(String [] args){
        passengerplane01 p1=new passengerplane01();
        cargoplane01 c1=new cargoplane01();
        fighterjet01 f1=new fighterjet01();

        // plane01 ref;//creating reference of plane class
        // ref=c1;//assigning reference of cargoplane class to plane class reference(i.e  parent class referance to child class object)
        // ref.fun();//this will call the method of cargoplane class as it is assigned to cargoplane class object
        // ref.land();
        // ref.takeoff();
        
        // ref=p1;
        // ref.fun();//this will call the method of passengerplane class as it is assigned to passengerplane class object  
        // ref.land();
        // ref.takeoff();
        // ref=f1;
        // ref.fun();
        // ref.land();
        // ref.takeoff();
        Hanger.permission(f1);


    }
}
