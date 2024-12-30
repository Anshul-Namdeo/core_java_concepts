class F3 
{
    public static void main(String args[])
    {
        Byte x = Byte.valueOf("128");

        // Byte x = Byte.valueOf("127");
        



        System.out.println(x);
    }
}

// D:\javaprac\28_wrapper_classes>javac F3.java

// D:\javaprac\28_wrapper_classes>java F3
// Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"128" Radix:10
//         at java.base/java.lang.Byte.parseByte(Byte.java:195)
//         at java.base/java.lang.Byte.valueOf(Byte.java:249)
//         at java.base/java.lang.Byte.valueOf(Byte.java:275)
//         at F3.main(F3.java:5)