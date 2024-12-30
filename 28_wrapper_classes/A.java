class A 
{
    public static void main(String agrs[])
    {
        Integer x = new Integer(12);

        System.out.println(x);
    }
}

// D:\javaprac\28_wrapper_classes>javac A.java
// A.java:5: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer x = new Integer(12);
//                     ^
// 1 warning

// D:\javaprac\28_wrapper_classes>java A
// 12
