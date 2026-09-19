class data{

    private static int id;
    private static int count;

public data(){
    id=++count;
}   

public int getid(){
    return id;
}
}
class IdCounter {
    public static void main(String [] args){
        data d=new data();
        data d1=new data();

        System.out.println(d.getid() + "   " + d1.getid());
       
    }
}