class R1 
{
    public static void main(String[] args) {
        
        byte x = Byte.parseByte("128");

        System.out.println(x);
    }
}



// D:\javaprac\30_wrapper_classes>javac R1.java

// D:\javaprac\30_wrapper_classes>java R1
// Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"128" Radix:10
//         at java.base/java.lang.Byte.parseByte(Byte.java:195)
//         at java.base/java.lang.Byte.parseByte(Byte.java:219)
//         at R1.main(R1.java:5)