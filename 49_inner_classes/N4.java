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

class N4
{
    // static ZZ1 z = new YY();

   

    public static void main(String args[])
    {
         // method local Anonymous Inner class

         ZZ1 z = new ZZ1()  /*start */ {
        public void pro()
        {
            System.out.println("hii");
        }
    } /* end */ ;

           z.pro();
    }

}


// D:\javaprac\49_inner_classes>javac N4.java

// D:\javaprac\49_inner_classes>java N4
// hii