public class palendrome {

    public static String reverseString(String str){
        String revese="";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            revese=revese+ch;
            
        }
        return revese;
    }

    public static void main(String [] args){
        String first="NOON";
        String second=reverseString(first);
        if(first.equals(second)){
            System.out.println("The string is a palindrome");
        }
        else{
            System.out.println("The string is not a palindrome");
        }
    }

   
}