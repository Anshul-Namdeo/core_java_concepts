class J2
{
    public static void main(String[] args) {
        
        Integer a = new Integer(2);
        Integer b = new Integer(2);
        Integer c = new Integer(2);

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

// D:\javaprac\30_wrapper_classes>java J2
// false
// false
// false
// ~~~~~~~~~~~~~~~~~~~~~~~~
// true
// true
// true
