class M1
{
    public static void main(String[] args) {
        
        Double a = Double.valueOf( 2.3);
        Double b = Double.valueOf(2.3);
        Double c = Double.valueOf(2.3);

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
    }
}

// D:\javaprac\30_wrapper_classes>javac M1.java

// D:\javaprac\30_wrapper_classes>java M1
// false
// false
// false