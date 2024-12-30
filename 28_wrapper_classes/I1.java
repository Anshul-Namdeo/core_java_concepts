class I1 
{
    public static void main(String args[]){

        Short x = Short.valueOf("32768");

        // Short x = Short.valueOf("32767");


        System.out.println(x);
    }
}

// D:\javaprac\28_wrapper_classes>javac I1.java

// D:\javaprac\28_wrapper_classes>java I1
// Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"32768" Radix:10
//         at java.base/java.lang.Short.parseShort(Short.java:139)
//         at java.base/java.lang.Short.valueOf(Short.java:193)
//         at java.base/java.lang.Short.valueOf(Short.java:219)
//         at I1.main(I1.java:5)