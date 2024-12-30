 

    //********** Anonymous Inner class examples are here N3.java ***********//

interface ZZ1 
{
    void pro();
}

// class YY1 implements ZZ1 
// {
//     public void pro()
//     {
//         System.out.println("hii");
//     }
// }

class N3 
{
    // static ZZ1 z = new YY();

    // Anonymous Inner class

    static ZZ1 z = new ZZ1()  /*start */ {
        public void pro()
        {
            System.out.println("hii");
        }
    } /* end */ ;

    public static void main(String args[])
    {
        z.pro();
    }

}



// D:\javaprac\49_inner_classes>javac N3.java

// D:\javaprac\49_inner_classes>java N3
// hii