public class printingnumbers {

    public static void printNumbers(int n){
        int sum=0;
        int count=0;
        while(n!=0){
        int digit=n%10;
        System.out.println(digit);
        sum=sum+digit;
        n=n/10;
        count++;
       }
       System.out.println("the no of digits are   "   +   count);
       System.out.println("the sum of digits are   "   +   sum);
    }
    
    public static void main(String[] args) {
        int n = 114738;
        printNumbers(n);
    }
}