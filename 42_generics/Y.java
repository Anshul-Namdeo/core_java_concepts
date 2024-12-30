import java.util.ArrayList;

class Y 
{
    public static void main(String args[])
    {
            ArrayList x = pro();
    }
               /* return type */
    static ArrayList<? extends Number> pro()
    {
        return new ArrayList<Integer>();
    }
}

// happily compike annd run ....