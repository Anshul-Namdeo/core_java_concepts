class AThread extends Thread 
{
    public void run()
    {
        B.aaa();
    }
}

class BThread extends Thread 
{
    public void run()
    {
        B.bbb();
    }
}

class CThread extends Thread
{
    public void run()
    {
        B.ccc();
    }
}

class B 
{

    static void aaa()
    {
        for(int i=0; i<30; i++)
        {
            System.out.println("aaa()" + i);
        }
    }

    static void bbb()
    {
        for(int i=0; i<30; i++)
        {
            System.out.println("bbb()" + i);
        }
    }

    static void ccc()
    {
        for(int i=0; i<30; i++)
        {
            System.out.println("ccc()" + i);
        }
    }

    public static void main(String[] args) {
        
        AThread x = new AThread();
        x.start();

        BThread y = new BThread();
        y.start();

        CThread z = new CThread();
        z.start();

    }
}


// D:\javaprac\35_multi_threading>javac B.java

// D:\javaprac\35_multi_threading>java B
// ccc()0
// ccc()1
// ccc()2
// bbb()0
// aaa()0
// aaa()1
// bbb()1
// ccc()3
// bbb()2
// aaa()2
// bbb()3
// bbb()4
// bbb()5
// bbb()6
// bbb()7
// bbb()8
// bbb()9
// bbb()10
// bbb()11
// ccc()4
// bbb()12
// aaa()3
// aaa()4
// bbb()13
// ccc()5
// bbb()14
// aaa()5
// bbb()15
// ccc()6
// bbb()16
// aaa()6
// bbb()17
// ccc()7
// bbb()18
// aaa()7
// bbb()19
// ccc()8
// ccc()9
// ccc()10
// ccc()11
// bbb()20
// aaa()8
// aaa()9
// aaa()10
// aaa()11
// bbb()21
// bbb()22
// bbb()23
// bbb()24
// bbb()25
// bbb()26
// bbb()27
// ccc()12
// ccc()13
// ccc()14
// ccc()15
// ccc()16
// bbb()28
// bbb()29
// aaa()12
// aaa()13
// aaa()14
// aaa()15
// aaa()16
// aaa()17
// ccc()17
// aaa()18
// ccc()18
// aaa()19
// ccc()19
// aaa()20
// ccc()20
// aaa()21
// ccc()21
// aaa()22
// ccc()22
// aaa()23
// ccc()23
// ccc()24
// aaa()24
// aaa()25
// aaa()26
// aaa()27
// ccc()25
// aaa()28
// ccc()26
// aaa()29
// ccc()27
// ccc()28
// ccc()29