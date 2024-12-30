class C1 
{
    public static void main(String args[])
    {
        @SuppressWarnings("deprecation")
        Integer x = new Integer(12);

        System.out.println(x);
    }
}

// D:\javaprac\55_annotations>javac C1.java
// C1.java:6: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//         Integer x = new Integer(12);
//                     ^
// 1 warning

// D:\javaprac\55_annotations>java C1
// 12