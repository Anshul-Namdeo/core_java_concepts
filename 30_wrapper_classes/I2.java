class I2
{
    public static void main(String[] args) {
        
        Short a = new Short((short)2);
        Short b = new Short((short)2);
        Short c = new Short((short)2);

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(b.equals(c));

    }
}

// 3 warnings

// D:\javaprac\30_wrapper_classes>java I2
// false
// false
// false
// ~~~~~~~~~~~~~~~~~~~~~~~~
// true
// true
// true