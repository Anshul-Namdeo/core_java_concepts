import java.util.ArrayList;

class J1
{
    public static void main(String[] args) {
        
        ArrayList x = new ArrayList();

        x.add(51);
        x.add(2);
        x.add(5);
        x.add(3);
        x.add(9);

        System.out.println(x);

        Integer a = Integer.valueOf(2);
        //System.out.println(x.remove(2));
          System.out.println(x.remove(a));

        System.out.println(x);
    }
}

// D:\javaprac\37_collections>javac J1.java
// Note: J1.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\37_collections>java J1
// [51, 2, 5, 3, 9]
// true
// [51, 5, 3, 9]
