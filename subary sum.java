import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                }
                if (sum % 2 == 0) {
                    count++;
                    for (int l = i; l <= j; l++) {
                        System.out.print(arr[l] + " ");
                    }
                    System.out.println();
                }
            }
        }
        
        if (count == 0) {
            System.out.println("None");
        }
    }
}
