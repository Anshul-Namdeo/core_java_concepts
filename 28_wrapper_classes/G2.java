class G2
{
    public static void main (String args[])
    {

        Byte x = Byte.valueOf("78",8);

        System.out.println(x);
    }
}


// D:\javaprac\28_wrapper_classes>javac G2.java

// D:\javaprac\28_wrapper_classes>java G2
// Exception in thread "main" java.lang.NumberFormatException: For input string: "78" under radix 8
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:668)
//         at java.base/java.lang.Byte.parseByte(Byte.java:193)
//         at java.base/java.lang.Byte.valueOf(Byte.java:249)
//         at G2.main(G2.java:6)
