@FunctionalInterface
interface Y3 {
    int bbb(int x, int y);
}

class U3 implements Y3 
{
    public int bbb(int a, int b)
    {
        return a+b;
    }
}

class I 
{
    public static void main(String args[])
    {
        Y3 a = new U3(); 
        int add = a.bbb(12,12);
        System.out.println(add);
    }
}


// D:\javaprac\60_fuctional_interface>javac I.java

// D:\javaprac\60_fuctional_interface>java I
// 24
