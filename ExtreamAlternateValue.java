import java.util.Scanner;

class extream{

    public static void main(String [] args){

        scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int i=0;
        int j=n-1;

        while(i<=j){

            System.out.print(arr[i]);
            i++;
            System.out.print(arr[j]);
            j--;

            if(i==j){
                System.out.print(arr[i]);
                break;
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}