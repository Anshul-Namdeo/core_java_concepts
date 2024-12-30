class X1
{
    public static void main(String[] args) {
        
       // Integer x = Integer.valueOf("123");

       Integer x = Integer.valueOf("12a");


        System.out.println(x);
    }
}


// D:\javaprac\33_exception_handling>javac X1.java

// D:\javaprac\33_exception_handling>java X1
// Exception in thread "main" java.lang.NumberFormatException: For input string: "12a"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:668)
//         at java.base/java.lang.Integer.valueOf(Integer.java:999)
//         at X1.main(X1.java:7)
