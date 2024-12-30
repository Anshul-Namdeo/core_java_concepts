class K1 
{
    void pro()
    {
        System.out.println("ABC");
    }
}

class Q 
{
    static K1 t = new K1 () {

        void pro()
        {
            System.out.println("XYZ");
        }
    };

    public static void main(String args[])
    {
        Q.t.pro();
    }
}

// D:\javaprac\49_inner_classes>javac Q.java

// D:\javaprac\49_inner_classes>java Q
// XYZ