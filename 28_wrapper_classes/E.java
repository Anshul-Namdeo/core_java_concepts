class E 
{
    public static void main(String args[])
    {
        Byte x = Byte.valueOf(2);

        System.out.println(x);
    }
}

// D:\javaprac\28_wrapper_classes>javac E.java
// E.java:5: error: no suitable method found for valueOf(int)
//         Byte x = Byte.valueOf(2);
//                      ^
//     method Byte.valueOf(byte) is not applicable
//       (argument mismatch; possible lossy conversion from int to byte)
//     method Byte.valueOf(String) is not applicable
//       (argument mismatch; int cannot be converted to String)
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error