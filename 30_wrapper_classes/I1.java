class I1
{
    public static void main(String[] args) {
        
        Short a = Short.valueOf((short) 2);
        Short b = Short.valueOf((short)2);
        Short c = Short.valueOf((short)2);

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
    }
}


// D:\javaprac\30_wrapper_classes>javac I1.java

// D:\javaprac\30_wrapper_classes>java I1
// true
// true
// true