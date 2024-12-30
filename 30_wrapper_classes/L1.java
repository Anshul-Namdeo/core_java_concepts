class L1
{
    public static void main(String[] args) {
        
        Float a = Float.valueOf( 2.3f);
        Float b = Float.valueOf(2.3f);
        Float c = Float.valueOf(2.3f);

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
    }
}
// D:\javaprac\30_wrapper_classes>javac L1.java

// D:\javaprac\30_wrapper_classes>java L1
// false
// false
// false