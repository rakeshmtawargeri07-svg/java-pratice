public class student{
    public int age;
    public int rollno;
    public String sec;
    private String GF;
    public String name;
    private int count;



    //as u can see that the gf is private it cannot be accesed  directly but can be accessed indirectly 
    // by creating a public class after the student class in which u can return the private attribute  

    // public String gfname(){
    //     return this.GF;
    // }

    public void getcount(int a){
        this.count=count;
    }

    // constructor function is used to create a object with values of the student class

public student(int age,int rollno,String sec,String GF,String name,int count){
    
    this.age=age;
    this.rollno=rollno;  
    this.sec=sec;              //here we define attributes to the object which is created 
                                // using this class as blue print  
    this.GF=GF;
    this.name=name;
}


//setting behaviour of that student 
public void eating(){
    System.out.println("iam eating my name is" + name);
}

private void chatting(){
    System.out.println("why should i tell u what i talk to" + GF);
}
}