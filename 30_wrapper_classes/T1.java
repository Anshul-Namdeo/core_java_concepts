class T1 
{
    public static void main(String[] args) {
        
        int x = Integer.parseInt("13as21");

        System.out.println(x);
    }
}


// D:\javaprac\30_wrapper_classes>javac T1.java

// D:\javaprac\30_wrapper_classes>java T1
// Exception in thread "main" java.lang.NumberFormatException: For input string: "13as21"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:668)
//         at java.base/java.lang.Integer.parseInt(Integer.java:786)
//         at T1.main(T1.java:5)