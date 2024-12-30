class K1 
{
    public static void main(String args[]){

        // Integer x = Integer.valueOf(2147483647);

        Integer x = Integer.valueOf(2147483648);

        // Integer x = Integer.valueOf((int)2147483648l);

        // Integer x = Integer.valueOf((int)2147483648);

        System.out.println(x);

    }
}


// D:\javaprac\28_wrapper_classes>javac K1.java
// K1.java:7: error: integer number too large
//         Integer x = Integer.valueOf(2147483648);
//                                     ^
// 1 error