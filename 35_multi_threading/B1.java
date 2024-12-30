class A1Thread  extends Thread 
{
    public void run()
    {
        B1.aaa();
    }
}

class BBThread extends Thread 
{
    public void run()
    {
        B1.bbb();
    }
}

class C1Thread extends Thread 
{
    public void run()
    {
        B1.ccc();
    }
}


class B1
{
    static void aaa()
    {
        for(int i=0; i<10; i++)
        {
            System.out.println("aaa() Pratham " + i);
        }
    }

    static void bbb()
    {
        for(int i=0; i<11; i++)
        {
            System.out.println("bbb() Anshul " + i);
        }
    }

    static void ccc()
    {
        for(int i=0; i<12; i++)
        {
            System.out.println("ccc() aayansh " + i);
        }
    }

    public static void main(String[] args) {
        
        A1Thread x = new A1Thread();
        x.start();
        BBThread y = new BBThread();
        y.start();
        C1Thread z = new C1Thread();
        z.start();
    }
}


// D:\javaprac\35_multi_threading>javac B1.java

// D:\javaprac\35_multi_threading>java B1
// aaa() Pratham 0
// bbb() Anshul 0
// ccc() aayansh 0
// bbb() Anshul 1
// aaa() Pratham 1
// bbb() Anshul 2
// ccc() aayansh 1
// ccc() aayansh 2
// bbb() Anshul 3
// aaa() Pratham 2
// bbb() Anshul 4
// bbb() Anshul 5
// bbb() Anshul 6
// bbb() Anshul 7
// bbb() Anshul 8
// bbb() Anshul 9
// ccc() aayansh 3
// bbb() Anshul 10
// aaa() Pratham 3
// ccc() aayansh 4
// ccc() aayansh 5
// ccc() aayansh 6
// ccc() aayansh 7
// ccc() aayansh 8
// ccc() aayansh 9
// ccc() aayansh 10
// ccc() aayansh 11
// aaa() Pratham 4
// aaa() Pratham 5
// aaa() Pratham 6
// aaa() Pratham 7
// aaa() Pratham 8
// aaa() Pratham 9