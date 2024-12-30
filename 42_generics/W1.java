import java.util.ArrayList;

class W1
{
    public static void main(String args[])
    {
        ArrayList <? extends CharSequence> x1 = new ArrayList <CharSequence> ();
        ArrayList <? extends CharSequence> x2 = new ArrayList <String> ();
        ArrayList <? extends CharSequence> x3 = new ArrayList <StringBuilder> ();
        ArrayList <? extends CharSequence> x4 = new ArrayList <StringBuffer> ();

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
    }   
}

// D:\javaprac\42_generics>javac W1.java

// D:\javaprac\42_generics>java W1
// []
// []
// []
// []