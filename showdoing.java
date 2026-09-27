class showdoing {

    private int cid;
    private String cname;
    private long cnumber;

    public void setdata(int cid,String cname,long cnumber){

        this.cid=cid;
        this.cname=cname;
        this.cnumber=cnumber;
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


    class sh{

        public static void main (String [] args){

            showdoing c=new showdoing();
            c.setdata(001,"rakesh",9876543L);
            System.out.println(c.getid() + " " +c.getname() + " " +c.getnumber());

        }
    }
}