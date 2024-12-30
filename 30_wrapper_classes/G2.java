class G2 
{
    public static void main(String[] args) {
        
        Character a = new Character('A');
        Character b = new Character('A');
        Character c = new Character('A');

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");


        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(b.equals(c));
    }
}

// 3 warnings

// D:\javaprac\30_wrapper_classes>java G2
// false
// false
// false
// ~~~~~~~~~~~~~~~~~~~~~~~~~~
// true
// true
// true