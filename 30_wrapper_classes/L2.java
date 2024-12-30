class L2
{
    public static void main(String[] args) {
        
        Float a = new Float(2.3f);
        Float b = new Float(2.3f);
        Float c = new Float(2.3f);

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(b.equals(c));

    }
  }

//   3 warnings

// D:\javaprac\30_wrapper_classes>java L2
// false
// false
// false
// ~~~~~~~~~~~~~~~~~~~~~~~~
// true
// true
// true