class H1
{
    public static void main(String[] args) {
        
        Byte a = Byte.valueOf((byte) 2);
        Byte b = Byte.valueOf((byte)2);
        Byte c = Byte.valueOf((byte)2);

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
    }
}


// D:\javaprac\30_wrapper_classes>javac H1.java

// D:\javaprac\30_wrapper_classes>java H1
// true
// true
// true