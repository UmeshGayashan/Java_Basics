import java.util.Scanner;

public class Char_Array {
    Char_Array() {
        char[] charString = {'S','T','R','I','N','G'}; //Character Array
        Scanner scanner = new Scanner(System.in);
        String str = new String(charString);
        System.out.println("The value of str is "+str);

        System.out.println("Enter string:");
        str = scanner.next(); //without space
        System.out.println("The value of str is "+str);

        str = "string"+" "+"Concatinate";//can use space
        System.out.println("The value of str is "+str);

        scanner.close();
    }
}
