class E 
{
    // instance level member variable
    int x = 7;

    // instance level member method
    void pro()
    {

    }

    // instance level member class 
    class Y 
    {

    }

    public static void main(String args[])
    {
        E e = new E();

        System.out.println(e.x);
    }
}


// D:\javaprac\48_inner_classes>javac E.java

// D:\javaprac\48_inner_classes>java E
// 7