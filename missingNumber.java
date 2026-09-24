import java.util.Scanner;

class xor{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int xorsum=0;

        for(int i=0;i<n;i++){
            xorsum=xorsum^arr[i];
        }

        for(int i=1;i<=n+1;i++){
            xorsum=xorsum^i;
        }
        System.out.println(xorsum);
    }
}