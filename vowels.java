
public class vowels {

    public static void printvovels(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                System.out.println(c);
                count++;

            }
        
        }
        System.out.println("Total vowels: " + count);
    }

    public static void main(String[] args) {
        String str="Rakesh tawargeri";
        printvovels(str);
    }
}
