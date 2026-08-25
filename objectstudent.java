public class objectstudent{

    public static void main(String[]args){

//here we create a new object in which we pass the values to the object i.e objectstudent 
        student bro=new student(23,34,"c","neha","rakesh");
        System.out.println(bro.name);
        System.out.println(bro.GF);
        // System.out.println(bro.gfname);thic code would be working if another public function used to accesss the gfname gets uncommented
        bro.eating();
        bro.chatting();


    }
}