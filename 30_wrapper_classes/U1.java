class U1
{
   public static void main(String[] args) {
    
        long x = Long.parseLong("32423423423L");

        System.out.println(x);
   }
    
}

// D:\javaprac\30_wrapper_classes>javac U1.java

// D:\javaprac\30_wrapper_classes>java U1
// Exception in thread "main" java.lang.NumberFormatException: For input string: "32423423423L"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Long.parseLong(Long.java:711)
//         at java.base/java.lang.Long.parseLong(Long.java:836)
//         at U1.main(U1.java:5)
