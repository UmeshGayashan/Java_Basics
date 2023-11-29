import java.util.Scanner;

public class Addition {
    Addition(){
        int a,b,result;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of a and b");
        //get values
        a = scanner.nextInt();
        b = scanner.nextInt();

        result = a+b;
        System.out.println("Results after addition : "+result);
    }
}
