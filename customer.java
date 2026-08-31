class cust{

    private int cid;
    private String cname;
    private long cnumber;

    public void setdata(int x,String y,long z){

        cid=x;
        cname=y;
        cnumber=z;
    }

public int getid(){
    return cid;
}
public String getname(){
    return cname;
}

public long getnumber(){
    return cnumber;
}


    class customer{

        public static void main (String [] args){

            cust c=new cust();
            c.setdata(001,"rakesh",9876543L);
            System.out.println(c.getid() + " " +c.getname() + " " +c.getnumber());

                                      

        }
    }
}