class E 
{
    void pro()
    {
        class Y 
        {
           Y()
           {
             System.out.println("Hiiii");
           }
        }

        Y y = new Y();
    }

    public static void main(String args[])
    {
        E e = new E ();

        e.pro();
    }
}

// D:\javaprac\49_inner_classes>javac E.java

// D:\javaprac\49_inner_classes>java E
// Hiiii