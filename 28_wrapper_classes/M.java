class M 
{
    public static void main(String[] args) {
        
        Integer x = Integer.valueOf("453",2);

        System.out.println(x);

    }
}

// D:\javaprac\28_wrapper_classes>javac M.java

// D:\javaprac\28_wrapper_classes>java M
// Exception in thread "main" java.lang.NumberFormatException: For input string: "453" under radix 2
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:668)
//         at java.base/java.lang.Integer.valueOf(Integer.java:973)
//         at M.main(M.java:5)