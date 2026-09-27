class custemer{
    String gender;
    String city;
    int cID;
    int mobile;


    void setgender(String g)
    {
        gender=g;
    }

    void setcity(String c)
    {
        city=c;
    }
    void setcID(int i)
    {
        cID=i;
    }
    void setmobile(int m)
    {
        mobile=m;
    }

}









public class methodoverloading{

    public static void main(String[]args){
        custemer c1=new custemer();
        c1.gender="male";
        c1.city="benglore";
        c1.cID=1234;
        c1.mobile=872897328;

        System.out.println(c1.gender);
        System.out.println(c1.city);
        System.out.println(c1.cID);
        System.out.println(c1.mobile);

        c1.setgender("female");
        c1.setcity("hyd");
        c1.setcID(847847);
        c1.setmobile(63736787);

        System.out.println(c1.gender);
        System.out.println(c1.city);
        System.out.println(c1.cID);
        System.out.println(c1.mobile);
    }

}


