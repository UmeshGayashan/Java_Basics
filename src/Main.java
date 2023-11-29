import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String str1 = "Heloo",str2 = "HELOO";
        System.out.println("The length of the string :"+str1+" is "+str1.length());
        //considering case sensitivity
        if(str1.equals(str2))
            System.out.println(str1 + " & " +str2 +" are same.");
        else
            System.out.println(str1 + " & " +str2 +" are not same.");


        //Ignoring case sensitivity
        if(str1.equalsIgnoreCase(str2))
            System.out.println(str1 + " & " +str2 +" are same.");
        else
            System.out.println(str1 + " & " +str2 +" are not same.");

        //Indexing using charAt
        System.out.println("The character at position 2 is "+ str1.charAt(2));

//        boolean functions
//                str1.startsWith("HEL")
//                str1.startsWith("llo")

//        location(indexing)
//                str1.indexOf("LO")
//                str1.lastIndexOf("LO")

//        Replace
//                str1.replace("LO","BY")

//        sub string
//                str1.substring(5,11)

//        splitting using
//        String[] splitArr = str1.split("-");



//        Char_Array CharArr = new Char_Array();
//        Addition add = new Addition();
//        Bitwise_Operations bit =new Bitwise_Operations();



    }
}