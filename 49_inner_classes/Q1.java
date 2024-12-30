class K2 
{
    void pro()
    {
        System.out.println("ABC");
    }
}

class Q1 
{
    static K2 t = new K2 () {

        // void pro()
        // {
        //     System.out.println("XYZ");
        // }
    };

    public static void main(String args[])
    {
        Q1.t.pro();
    }
}

// D:\javaprac\49_inner_classes>javac Q1.java

// D:\javaprac\49_inner_classes>java Q1
// ABC