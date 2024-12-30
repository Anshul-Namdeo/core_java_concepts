class R2 
{
    public static void main(String[] args) {
        
        byte x = Byte.parseByte("1a2");

        System.out.println(x);
    }
}


// D:\javaprac\30_wrapper_classes>javac R2.java

// D:\javaprac\30_wrapper_classes>java R2
// Exception in thread "main" java.lang.NumberFormatException: For input string: "1a2"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:668)
//         at java.base/java.lang.Byte.parseByte(Byte.java:193)
//         at java.base/java.lang.Byte.parseByte(Byte.java:219)
//         at R2.main(R2.java:5)