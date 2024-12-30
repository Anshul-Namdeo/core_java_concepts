class N1 
{
    public static void main(String args[])
    {
        Float f = Float.valueOf(5.26);

        // Float f = Float.valueOf((float)5.26);

        System.out.println(f);

    }
}

// D:\javaprac\28_wrapper_classes>javac N1.java
// N1.java:5: error: no suitable method found for valueOf(double)
//         Float f = Float.valueOf(5.26);
//                        ^
//     method Float.valueOf(String) is not applicable
//       (argument mismatch; double cannot be converted to String)
//     method Float.valueOf(float) is not applicable
//       (argument mismatch; possible lossy conversion from double to float)
// 1 error
