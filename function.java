import java.util.Scanner;

public class function{
    public static int multi(int a,int b){
        int multiplication=a*b;
        return multiplication;
    }

    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=multi(a,b);
        System.out.println("The multiplication of two numbers is: "+result);
    }
}