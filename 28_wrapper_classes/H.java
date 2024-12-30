class H
{
    public static void main(String args[])
    {
        Short x = Short.valueOf(12);

        System.out.println(x);
    }
}

// D:\javaprac\28_wrapper_classes>javac H.java
// H.java:5: error: no suitable method found for valueOf(int)
//         Short x = Short.valueOf(12);
//                        ^
//     method Short.valueOf(String) is not applicable
//       (argument mismatch; int cannot be converted to String)
//     method Short.valueOf(short) is not applicable
//       (argument mismatch; possible lossy conversion from int to short)
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error