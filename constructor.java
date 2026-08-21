public class Constructor {
    //attributes
    int age;
    int salary;
    String name;
    String companyname;


//paramatralize constructor
public Constructor(int age,int salary,String name,String companyname){
    this.age=age;
    this.salary=salary;
    this.name=name; 
    this.companyname=companyname;

}

//behAviours
public void sleep(){
    System.out.println(name+" is sleeping");
}
public void work(){
    
    System.out.println(name+" is working");
}
}
