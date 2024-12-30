class F2 
{
    public static void main(String args[])
    {
        Byte x = Byte.valueOf("12a2");

        System.out.println(x);
    }
}

// D:\javaprac\28_wrapper_classes>javac F2.java

// D:\javaprac\28_wrapper_classes>java F2
// Exception in thread "main" java.lang.NumberFormatException: For input string: "12a2"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:668)
//         at java.base/java.lang.Byte.parseByte(Byte.java:193)
//         at java.base/java.lang.Byte.valueOf(Byte.java:249)
//         at java.base/java.lang.Byte.valueOf(Byte.java:275)
//         at F2.main(F2.java:5)