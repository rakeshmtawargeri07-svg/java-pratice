import java.util.Scanner;

public class strings {

    public static void printCharArray(String str){
        char[] chars = str.toCharArray();

        for(int i = 0; i < chars.length; i++){
            System.out.println(chars[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        printCharArray(str);

        sc.close();
    }
}