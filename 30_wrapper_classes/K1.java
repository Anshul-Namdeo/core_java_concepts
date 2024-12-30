class K1
{
    public static void main(String[] args) {
        
        Long a = Long.valueOf( 2l);
        Long b = Long.valueOf(2l);
        Long c = Long.valueOf(2l);

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
    }
}


// D:\javaprac\30_wrapper_classes>javac K1.java

// D:\javaprac\30_wrapper_classes>java K1
// true
// true
// true
