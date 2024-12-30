@FunctionalInterface
interface Y2 
{
    void aaa(int x, int y);
}

class U2 implements Y2 
{
    public void aaa(int x, int y)
    {
        System.out.println(x + " - " + y);
    }
}

class H 
{
    public static void main(String args[])
    {
        Y2  a = new U2();
        a.aaa(12 , 56);
    }
}


// D:\javaprac\60_fuctional_interface>javac H.java

// D:\javaprac\60_fuctional_interface>java H
// 12 - 56