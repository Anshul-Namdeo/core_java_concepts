class L 
{
    int e = 112;

    static void pro()
    {
        class A 
        {
            void info()
            {
                System.out.println(e);
            }
        }

        A a = new A();
        a.info();
    }

    public static void main(String args[])
    {
        L l = new L();
        l.pro(); 

        // Note : pro() method ek static method hai jb hum usa ko L class ke instance level variable (l) ke throw access karenge to (internally) ek process hogi jiss mai jo instance level variable (l) hai. wo (l) se badl kar (L) ho jayega kyoki hum static method ko call kar rahe hai isliye eaisa ho raha .
                           // after compile
        // note :  l.pro()   --------------->    L.pro()
    } 
}


// D:\javaprac\49_inner_classes>javac L.java
// L.java:11: error: non-static variable e cannot be referenced from a static context
//                 System.out.println(e);
//                                    ^
// 1 error
