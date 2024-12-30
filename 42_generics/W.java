import java.util.ArrayList;

class W 
{
    public static void main(String args[])
    {
        ArrayList <? extends CharSequence> x1 = new ArrayList <CharSequence> ();
        ArrayList <? extends CharSequence> x2 = new ArrayList <String> ();
        ArrayList <? extends CharSequence> x3 = new ArrayList <StringBuilder> ();
        ArrayList <? extends CharSequence> x4 = new ArrayList <StringBuffer> ();
    }   
}

 // happily compile and run