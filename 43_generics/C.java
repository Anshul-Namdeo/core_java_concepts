import java.util.ArrayList;

class C 
{
    public static void main(String args[])
    {
        // ArrayList<?> x1 = new ArrayList <Object>();
        // ArrayList<?> x2 = new ArrayList <Cat> ();
        // ArrayList<?> x3 = new ArrayList <BDog> ();
        // ArrayList<?> x4 = new ArrayList <Human> ();

        //  ArrayList<? extends Object> x1 = new ArrayList <Object>();
        // ArrayList<? extends Object> x2 = new ArrayList <Cat> ();
        // ArrayList<? extends Object> x3 = new ArrayList <BDog> ();
        // ArrayList<? extends Object> x4 = new ArrayList <Human> ();

        //  ArrayList<? super Object> x1 = new ArrayList <Object>(); // ok
        // ArrayList<? super Object> x2 = new ArrayList <Cat> ();
        // ArrayList<? super Object> x3 = new ArrayList <BDog> ();
        // ArrayList<? super Object> x4 = new ArrayList <Human> ();

        //   ArrayList< Object> x1 = new ArrayList <Object>(); // ok
        //  ArrayList< Object> x2 = new ArrayList <Cat> ();
        //  ArrayList< Object> x3 = new ArrayList <BDog> ();
        // ArrayList< Object> x4 = new ArrayList <Human> ();


    }
}