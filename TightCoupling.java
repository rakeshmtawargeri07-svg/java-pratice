class plane{
    void fun(){
        System.out.println("flys in sky");
    }
}
class cargoplane extends plane{
    void fun(){
        System.out.println("flys in sky and carry goods");
    }
}

class passengerplane extends plane{
    void fun(){
        System.out.println("flys at medium hight");
    }
}

class fighterjet extends plane{
    void fun(){
        System.out.println("flys at high hight");
    }
}

class Tightcoupling{
    public static void main(String [] args){
        plane p=new plane();
        passengerplane pp=new passengerplane();
        cargoplane cp=new cargoplane();
        fighterjet fj=new fighterjet();

        // p.fun();
        // pp.fun();
        // cp.fun();
        // fj.fun();

        plane ref;//creating reference of plane class
        ref=cp;//assigning reference of cargoplane class to plane class reference(i.e parent class referance to child class object)
        ref.fun();//this will call the method of cargoplane class as it is assigned to cargoplane class object

        ref=pp;
        ref.fun();//this will call the method of passengerplane class as it is assigned to passengerplane class object

        ref=fj;
        ref.fun();//this will call the method of fighterjet class as it is assigned to fighterjet class object
    }
}
