import java.util.ArrayList;

class X1 
{
    public static void main(String args[])
    {
        // Note : agar declaration side mai <?> element type mai sirf (?) Question_mark single likha hai to instansiation side mai <> element type mai kuch bhi likh sakte hai ....
        ArrayList <?> x1 = new ArrayList <Anshul> ();
        ArrayList <?> x2 = new ArrayList <Car> ();
        ArrayList <?> x3 = new ArrayList <AAA> ();
        ArrayList <?> x4 = new ArrayList <Object> ();
        ArrayList <?> x5 = new ArrayList <Integer> ();

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x5);
    }
}

class Anshul { }
class Car { }

interface AAA { }


// D:\javaprac\42_generics>javac X1.java

// D:\javaprac\42_generics>java X1
// []
// []
// []
// []
// []
