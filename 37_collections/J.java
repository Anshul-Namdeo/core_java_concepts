import java.util.ArrayList;

class J 
{
    public static void main(String[] args) {
        
        ArrayList x = new ArrayList();

        x.add(51);
        x.add(2);
        x.add(5);
        x.add(3);
        x.add(9);

        System.out.println(x);

        System.out.println(x.remove(2));

        System.out.println(x);
    }
}


// D:\javaprac\37_collections>javac J.java
// Note: J.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\37_collections>java J
// [51, 2, 5, 3, 9]
// 5
// [51, 2, 3, 9]