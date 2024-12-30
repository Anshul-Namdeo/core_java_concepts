import java.util.ArrayList;

class Y2 
{
    public static void main(String args[])
    {
            ArrayList x = pro();
            System.out.println(x);
    }
               /* return type */
    static ArrayList<? extends Number> pro()
    {
        return new ArrayList<Number>();
    }
}


// D:\javaprac\42_generics>javac Y2.java

// D:\javaprac\42_generics>java Y2
// []
