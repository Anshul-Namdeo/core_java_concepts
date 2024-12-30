class U2
{
   public static void main(String[] args) {
    
        long x = Long.parseLong("10102",2);

        System.out.println(x);
   }
    
}

// D:\javaprac\30_wrapper_classes>javac U2.java

// D:\javaprac\30_wrapper_classes>java U2
// Exception in thread "main" java.lang.NumberFormatException: For input string: "10102" under radix 2
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Long.parseLong(Long.java:711)
//         at U2.main(U2.java:5)