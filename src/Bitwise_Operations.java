public class Bitwise_Operations {
    Bitwise_Operations(){
        byte val1 = 12;    //0000 1100 ==> 8 bit
        byte val2 = 10;    //0000 1010 ==> 8 bit
        byte res;

        res = (byte) ~val1; //Complement (NOT)  //1111 0011 ==> 8 bit using 1s complement & 2s complement
        System.out.println("The Result is "+res);

        res = (byte) (val1 & val2); //AND
        System.out.println("The Result is "+res);

        res = (byte) (val1 | val2); //OR
        System.out.println("The Result is "+res);

        res = (byte) (val1 ^ val2); //XOR
        System.out.println("The Result is "+res);

        //0000 1100 << 2 ==> 0011 0000 ==> 32+16=48
        res = (byte) (val1 << 2); //Shits 2 bits to the left
        System.out.println("The Result is "+res);

        //0000 1100 >> 2 ==> 0000 0011 ==> 1+2=3
        res = (byte) (val1 >> 2); //Shits 2 bits to the left
        System.out.println("The Result is "+res);
    }
}
