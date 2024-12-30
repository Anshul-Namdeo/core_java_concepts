interface JJ 
{
    void info() ;
   
}

class R1 
{
    static JJ j = new JJ () {
        public void info()
        {
            System.out.println("Hello");
        }

        void pro() 
        {
            System.out.println("Hii");
        }
    };

    public static void main(String args[])
    {
        R1.j.info();
        R1.j.pro();
    }
}


// D:\javaprac\49_inner_classes>javac R1.java
// R1.java:24: error: cannot find symbol
//         R1.j.pro();
//             ^
//   symbol:   method pro()
//   location: variable j of type JJ
// 1 error

// NOTE : R1 ke ander jo (j) variable hai usa ka type (jj) type ka hai .ab (j) variable ke throw jiss method ko access kar hai wo method (jj) interface mai honi chahiye. lekin wo waha par hai nhi . to hum (j) variable ke throw usa method ko acces nhi kar payenge or error aa jayega....