import java.util. Scanner;

public class Main {

public static void main (String[] args)

Scanner sc = new Scanner (System.in);

String input=sc.nextLine();

String [] words=input.split (" ");

String small=words [0];

for (int i=0;i<words.length;i++) {

if (words [i].length()<small.length())
{ 
  small=words[i];
}
}

System,out,print (small);
}
}
                                       
