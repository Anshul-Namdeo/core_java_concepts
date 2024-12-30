interface GG 
{
    void pro();
}

class T 
{
    int z = 55;

    GG k = new GG () { 
        public void pro()
        {
            System.out.println(z);
        }
    } ;

    public static void main(String args[])
    {
        T t = new T();

        t.k.pro();
    }
}


// D:\javaprac\49_inner_classes>javac T.java

// D:\javaprac\49_inner_classes>java T
// 55
