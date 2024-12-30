class K2
{
    public static void main(String[] args) {
        
        Long a = new Long(2l);
        Long b = new Long(2l);
        Long c = new Long(2l);

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(b.equals(c));

    }
  }

//  3 warnings

// D:\javaprac\30_wrapper_classes>java K2
// false
// false
// false
// ~~~~~~~~~~~~~~~~~~~~~~~~
// true
// true
// true