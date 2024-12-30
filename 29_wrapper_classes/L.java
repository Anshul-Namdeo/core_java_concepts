class L 
{
    public static void main(String args[])
    {
        int a = 56;

        Byte x = (byte) a;
        Short y = (short) a;
        Character z = (char) a;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}

// D:\javaprac\29_wrapper_classes>javac L.java

// D:\javaprac\29_wrapper_classes>java L
// 56
// 56
// 8
