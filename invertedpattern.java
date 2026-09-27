public class invertedpattern{
    public static void main(String[]args){

        int n=4;

        for(int i=1;i<=4;i++){
            for(int j=1;j<=i-1;j++){
                System.out.println(" ");
            }
            for(int j=1;j=2*n-2*i+1;j++){
                System.out.println("*");
            }
        }

    }
}