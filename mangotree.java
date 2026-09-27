import java.util.Scanner;

public class mangotree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tree = sc.nextInt();
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        if (tree <= columns || tree % columns == 0) {
            System.out.println("mango tree");
        } else {
            System.out.println("not mango tree");
        }
    }
}