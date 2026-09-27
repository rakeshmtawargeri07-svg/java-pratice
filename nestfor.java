public class bubble {

    public static void printArray(int[] arr) {
        for (int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        for(int k=1;k<=5;k++){
            for(int l=1;l<=k;l++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}

