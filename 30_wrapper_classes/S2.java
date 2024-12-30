class S2
{
    public static void main(String[] args) {
        
        short x = Short.parseShort("32a23");

        System.out.println(x);
    }
}

// D:\javaprac\30_wrapper_classes>javac S2.java

// D:\javaprac\30_wrapper_classes>java S2
// Exception in thread "main" java.lang.NumberFormatException: For input string: "32a23"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:668)
//         at java.base/java.lang.Short.parseShort(Short.java:137)
//         at java.base/java.lang.Short.parseShort(Short.java:163)
//         at S2.main(S2.java:5)
