class car1{
    
    void carmailage(){
        System.out.println("Car mileage is different for different cars");
    }

    static void milestokms(){
        System.out.println("1 mile=1.60934 km");
    }
}

class car{
    public static void main(String[] args){

        car1.milestokms();
        car1 bmw=new car1();
        bmw.carmailage();

        
        
    }
}