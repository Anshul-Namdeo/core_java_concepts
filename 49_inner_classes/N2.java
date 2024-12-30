interface ZZ 
{
    void pro();
}

class YY implements ZZ 
{
    // Note public hame overriding ke rules ke hisab se likhna padha hai....
    public void pro()
    {
        System.out.println("hii");
    }
}

class N2 
{
     static ZZ z = new YY();

    public static void main(String args[])
    {
        z.pro();
    }
}

// D:\javaprac\49_inner_classes>javac N2.java

// D:\javaprac\49_inner_classes>java N2
// hii