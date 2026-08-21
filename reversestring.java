public class reversestring {

    public static String reverse(String str){
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            reverse=reverse+ch;
        }
        return reverse;
    }
    public static void main(String[] args){
        String str="ramesh";
        System.out.println(reverse(str));

    }
}