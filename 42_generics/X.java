import java.util.ArrayList;

class X 
{
    public static void main(String args[])
    {
        // Note : agar declaration side mai <?> element type mai sirf (?) Question_mark single likha hai to instansiation side mai <> element type mai kuch bhi likh sakte hai ....
        ArrayList <?> x1 = new ArrayList <Anshul> ();
        ArrayList <?> x2 = new ArrayList <Car> ();
        ArrayList <?> x3 = new ArrayList <AAA> ();
        ArrayList <?> x4 = new ArrayList <Object> ();
        ArrayList <?> x5 = new ArrayList <Integer> ();
    }
}

class Anshul { }
class Car { }

interface AAA { }


// happily comile and run...