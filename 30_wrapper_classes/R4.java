class R4
{
    public static void main(String[] args) {
     
        byte x = Byte.parseByte("121",2);

        System.out.println(x);
    }
}

// D:\javaprac\30_wrapper_classes>javac R4.java

// D:\javaprac\30_wrapper_classes>java R4
// Exception in thread "main" java.lang.NumberFormatException: For input string: "121" under radix 2
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:668)
//         at java.base/java.lang.Byte.parseByte(Byte.java:193)
//         at R4.main(R4.java:5)