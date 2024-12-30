class G1 
{
    public static void main(String[] args) {
        
        Character a = Character.valueOf('A');
        Character b = Character.valueOf('A');
        Character c = Character.valueOf('A');

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);

    }
}


// D:\javaprac\30_wrapper_classes>javac G1.java

// D:\javaprac\30_wrapper_classes>java G1
// true
// true
// true
