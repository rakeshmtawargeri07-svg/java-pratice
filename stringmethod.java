public class stringmethod {
    public static void main(String[] args) {

        String name1 = "tony";
        String lastname = "stark";
        String fullname = name1 + lastname;

        System.out.println(fullname.length());

        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }

    }
}