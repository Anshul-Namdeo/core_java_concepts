class E2
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
        Y() {
            System.out.println("Hiiiiiii......!!!!");
        }
    }

    public static void main(String args[])
    {
        E2 e = new E2();

       e.new Y();
    }
}


// D:\javaprac\48_inner_classes>javac E2.java

// D:\javaprac\48_inner_classes>java E2
// Hiiiiiii......!!!!