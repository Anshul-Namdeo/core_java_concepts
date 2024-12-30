
enum GlassSize 
{
    SMALL, MEDIUM, LARGE
}

class V 
{
    void pro(GlassSize gs)
    {
        System.out.println(gs);
    }

    public static void main(String args[])
    {
        V v = new V();
        v.pro(GlassSize.SMALL);
    }
}


// D:\javaprac\51_enum>javac V.java

// D:\javaprac\51_enum>java V
// SMALL
