class snip{

    public static int y=0;

    class snippit{

        public static int x=100;

        public static void main(String [] args){

            snippit s=new snippit();
            s.x++;

            snippit s1=new snippit();
            s1.x++;

            s=new snippit();
            s.x++;

            snippit.x++;

            System.out.println(x);

            snip sn=new snip();
            sn.y++;

            snip sn1=new snip();
            sn1.y++;

            sn=new snip();
            sn.y++;

            System.out.println(snip.y);

        }
    }
}