final class plane{
    void fily(){
        System.out.println("flys in sky");
    }
}

class cargoplane extends plane{
}

public class finalmethod{
    public static void main(String [] args){
        cargoplane cp=new cargoplane();
        cp.fily();//cannot be inherited because plane class has final and final class cannot be inhereted
    }
}