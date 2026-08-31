class custemer{
    Character gender;
    String city;
    int cID;
    Long mobile;


    void setdetail(Character g)
    {
        gender=g;
    }

    void setdetail(String c)
    {
        city=c;
    }
    void setdetail( i)
    {
        cID=i;
    }
    void setdetail(int m)
    {
        mobile=m;
    }

}









public class methodoverloadinginreaksense{

    public static void main(String[]args){
        custemer c1=new custemer();
        c1.gender='m';
        c1.city="benglore";
        c1.cID=1234;
        c1.mobile=872897786;

        System.out.println(c1.gender);
        System.out.println(c1.city);
        System.out.println(c1.cID);
        System.out.println(c1.mobile);

        c1.setdetail("female");
        c1.setdetail("hyd");
        c1.setdetail(847847);
        c1.setdetail(63736787);

        System.out.println(c1.gender);
        System.out.println(c1.city);
        System.out.println(c1.cID);
        System.out.println(c1.mobile);
    }

}


