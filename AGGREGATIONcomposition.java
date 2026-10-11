import java.util.*;

class bike {

    private String bike;
    private int milage;

    public bike(String bike,int  milage){
        this.bike=bike;
        this.milage=milage;
    }

    public String getbike(){
        return bike;
    }

    public int getmilage(){
        return milage;
    }
}

    class book{

        private String name;
        private String author;  

        public book(String name,String author){
            this.name=name;
            this.author=author;
        }

        public String getname(){
            return name;
        }

        public String getauthor(){
            return author;
        }
    }

        class heart{
            private int weight;
            private int beats;

            public heart(int weight,int beats){
                this.weight=weight;
                this.beats=beats;
            }

            public int getweight(){
                return weight;
            }

            public int getbeats(){
                return beats;
            }
        }

        class brain{

            private int weight;
            private String color;

            public brain(int weight,String color){
                this.weight=weight;
                this.color=color;
            }

            public int getweight(){
                return weight;
            }
            public String getcolor(){
                return color;
            }
        }

        class student {

            heart h=new heart(100,76);
            brain b=new brain(3,"gray");

            void hasa(bike b){
                System.out.println("bike name is: "+b.getbike());
                System.out.println("bike milage is: "+b.getmilage());

            }

            void hasa(book bk){
                System.out.println("book name is: "+bk.getname());
                System.out.println("book author is: "+bk.getauthor());
            }


        }
    


class AGGREGATIONcomposition {
    public static void main(String[] args) {
        
        bike b=new bike("pulsar",50);
        book bk=new book("java","james bond");
        student s=new student();

        System.out.println("heart weight is: "+s.h.getweight());
        System.out.println("heart beats is: "+s.h.getbeats()); 
        System.out.println(b.getbike());
        System.out.println(b.getmilage());
        s.hasa(b);
        s.hasa(bk);
    }
    
}
