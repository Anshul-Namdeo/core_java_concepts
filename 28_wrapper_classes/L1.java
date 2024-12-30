class L1 
{
    public static void main(String args[])

    {
        Integer x = Integer.valueOf("2147483648");

        System.out.println(x);
    }
}

// D:\javaprac\28_wrapper_classes>javac L1.java

// D:\javaprac\28_wrapper_classes>java L1
// Exception in thread "main" java.lang.NumberFormatException: For input string: "2147483648"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:672)
//         at java.base/java.lang.Integer.valueOf(Integer.java:999)
//         at L1.main(L1.java:6)