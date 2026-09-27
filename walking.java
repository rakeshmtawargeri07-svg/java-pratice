import java.util.Scanner;

public class walking{

    public static int waalk(int arr[],int k){

        int walkwidth=0;

        for(int i=0;i<=arr.length;i++){
            if(arr[i]<=k){
                walkwidth=walkwidth+1;

            }
            else{
                walkwidth=walkwidth+2;
            }

        }
        return walkwidth;



    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int k=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int b=waalk(arr,k);
        System.out.println(b);

    }

}