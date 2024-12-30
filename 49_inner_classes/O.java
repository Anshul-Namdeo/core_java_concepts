interface T1 
{
    void pro();
}

class O 
{
    // Anonymous Inner class

    static T1 z = new T1() {
        public void pro()
        {
            System.out.println("hi");
        }
    } ;

    static T1 x = new T1() {
        public void pro()
        {
            System.out.println("hi");
        }
    } ;

    public static void main (String args[])
    {
        z.pro();
        x.pro();
    }
}


// D:\javaprac\49_inner_classes>javac O.java

// D:\javaprac\49_inner_classes>java O
// hi
// hi