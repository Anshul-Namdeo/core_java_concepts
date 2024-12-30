class S1
{
    public static void main(String[] args) {
        
        short x = Short.parseShort("32768");

        System.out.println(x);
    }
}

// D:\javaprac\30_wrapper_classes>javac S1.java

// D:\javaprac\30_wrapper_classes>java S1
// Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"32768" Radix:10
//         at java.base/java.lang.Short.parseShort(Short.java:139)
//         at java.base/java.lang.Short.parseShort(Short.java:163)
//         at S1.main(S1.java:5)