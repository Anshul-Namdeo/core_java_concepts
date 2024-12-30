class F1 
{
    public static void main(String args[])
    {
        Byte x = Byte.valueOf("a");

        System.out.println(x);
    }
}

// D:\javaprac\28_wrapper_classes>javac F1.java

// D:\javaprac\28_wrapper_classes>java F1
// Exception in thread "main" java.lang.NumberFormatException: For input string: "a"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:668)
//         at java.base/java.lang.Byte.parseByte(Byte.java:193)
//         at java.base/java.lang.Byte.valueOf(Byte.java:249)
//         at java.base/java.lang.Byte.valueOf(Byte.java:275)
//         at F1.main(F1.java:5)