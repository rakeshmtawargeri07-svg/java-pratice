public class reverseingstring {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");

        for(int i=0;i<=str.length()/2;i++){
            int firstcharindex=i;
            int lastcharindex=str.length()-1-i;

            char firstchar=str.charAt(firstcharindex);
            char lastchar=str.charAt(lastcharindex);

            str.setCharAt(firstcharindex,lastchar);
            str.setCharAt(lastcharindex,firstchar);
        }
        System.out.println(str);
    }
}