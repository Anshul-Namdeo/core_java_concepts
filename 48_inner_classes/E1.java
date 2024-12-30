class E1 
{
    // instance level member variable
    int x = 7;

    // instance level member method
    void pro()
    {
        System.out.println("Hello....!!!!");
    }

    // instance level member class 
    class Y 
    {

    }

    public static void main(String args[])
    {
        E1 e = new E1();

       e.pro();
    }
}

// D:\javaprac\48_inner_classes>javac E1.java

// D:\javaprac\48_inner_classes>java E1
// Hello....!!!!
