interface JJ 
{
    void info() ;
    void pro() ;
   
}

class R2 
{
    static JJ j = new JJ () {
        public void info()
        {
            System.out.println("Hello");
        }

       public void pro() 
        {
            System.out.println("Hii");
        }
    };

    public static void main(String args[])
    {
        R2.j.info();
        R2.j.pro();
    }
}


// D:\javaprac\49_inner_classes>javac R2.java

// D:\javaprac\49_inner_classes>java R2
// Hello
// Hii