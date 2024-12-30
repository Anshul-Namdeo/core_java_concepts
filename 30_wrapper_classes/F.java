class F 
{
    public static void main(String[] args) {
        
        Boolean a = new Boolean(true);
        Boolean b = new Boolean(true);
        Boolean c = new Boolean(true);

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(b.equals(c));
    }
}

// D:\javaprac\30_wrapper_classes>java F
// false
// false
// false
// ~~~~~~~~~~~~~~~~~~~~~
// true
// true
// true
