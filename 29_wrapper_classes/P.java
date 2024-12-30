class P

{
     public static void main(String args[])
     {
        Byte a = 54;

        pro(54);
     }

     static void pro(byte x){
        System.out.println(x);
     }
}


// D:\javaprac\29_wrapper_classes>javac P.java
// P.java:8: error: incompatible types: possible lossy conversion from int to byte
//         pro(54);
//             ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error