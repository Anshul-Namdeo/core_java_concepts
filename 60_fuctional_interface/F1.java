@FunctionalInterface 
interface X5 
{
    void pro();
}

class Y1 implements X5 
{
    public void pro()
    {
        System.out.println("helllo");
    }
}

class F1 
{
    public static void main(String args[])
    {
        X5  x = new Y1();

        x.pro();
    }
}


// D:\javaprac\60_fuctional_interface>javac F1.java

// D:\javaprac\60_fuctional_interface>java F1
// helllo