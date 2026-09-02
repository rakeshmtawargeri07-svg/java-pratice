class diffbetweenconst {

    private int cid;
    private String cname;
    private long cnumber;



    // Parameterized constructor
    public  void diffbetweenconst(int cid, String cname, long cnumber) {
        this.cid = cid;
        this.cname = cname;
        this.cnumber = cnumber;
    }

    
    public int getid() {
        return cid;
    }

    public String getname() {
        return cname;
    }

    public long getnumber() {
        return cnumber;
    }
}

class Sh {
    public static void main(String[] args) {

        //using non paramatralised constructor
        diffbetweenconst c = new diffbetweenconst();
        System.out.println(c.getid() + " " + c.getname() + " " + c.getnumber());

        // Object created directly with parameterized constructor
        diffbetweenconst c1 = new diffbetweenconst(1, "rakesh", 9876543L);
        System.out.println(c1.getid() + " " + c1.getname() + " " + c1.getnumber());
    }
}