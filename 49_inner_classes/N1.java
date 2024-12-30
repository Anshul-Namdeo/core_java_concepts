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

class N1 
{
    ZZ z = new YY();

    public static void main(String args[])
    {
        z.pro();
    }
}

// D:\javaprac\49_inner_classes>javac N1.java
// N1.java:21: error: non-static variable z cannot be referenced from a static context
//         z.pro();
//         ^
// 1 error
