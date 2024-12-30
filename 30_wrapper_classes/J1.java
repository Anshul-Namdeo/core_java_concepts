class J1
{
    public static void main(String[] args) {
        
        Integer a = Integer.valueOf( 2);
        Integer b = Integer.valueOf(2);
        Integer c = Integer.valueOf(2);

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
    }
}


// D:\javaprac\30_wrapper_classes>javac J1.java

// D:\javaprac\30_wrapper_classes>java J1
// true
// true
// true