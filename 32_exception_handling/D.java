class D 
{
    public static void main(String[] args) {
        
        System.out.println(1);

        int x = Integer.parseInt("a");

        System.out.println(3);
    }
}

// D:\javaprac\32_exception_handling>javac D.java

// D:\javaprac\32_exception_handling>java D
// 1
// Exception in thread "main" java.lang.NumberFormatException: For input string: "a"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:668)
//         at java.base/java.lang.Integer.parseInt(Integer.java:786)
//         at D.main(D.java:7)