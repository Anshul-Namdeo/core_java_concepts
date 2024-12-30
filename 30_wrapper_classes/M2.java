class M2
{
    public static void main(String[] args) {
        
        Double a = new Double(2.3);
        Double b = new Double(2.3);
        Double c = new Double(2.3);

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

// D:\javaprac\30_wrapper_classes>java M2
// false
// false
// false
// ~~~~~~~~~~~~~~~~~~~~~~~~
// true
// true
// true