class customer1{

    private int cid;
    private String cname;
    private long cnumber;



    // Parameterized constructor
    public customer1(int cid, String cname, long cnumber) {
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

class cust1 {
    public static void main(String[] args) {

        //using non paramatralised constructor
        customer1 c = new customer1();
        System.out.println(c.getid() + " " + c.getname() + " " + c.getnumber());

        // Object created directly with parameterized constructor
        customer1 c1 = new customer1(1, "rakesh", 9876543L);
        System.out.println(c1.getid() + " " + c1.getname() + " " + c1.getnumber());
    }
}
