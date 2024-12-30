

class K 
{   
    static AA x = new AA();
    public static void main(String[] args) {
        Thread a = new Thread(new C1Runnable(),"A");
        Thread b = new Thread(new C2Runnable(),"B");

        a.start();
        b.start();
    }    
}
class AA 
{
    /*synchronized */ void aaa()
    {
        Thread t = Thread.currentThread();
        for(int i=0; i<30; i++)
        {
            System.out.println(t.getName() + " - " + i);
        }
    }
     synchronized  void bbb()
     {
        Thread t = Thread.currentThread();
        for(int i=0; i<30; i++)
        {
            System.out.println(t.getName() + " - " + i);
        }
    }
}
class C1Runnable implements Runnable 
{
    public void run()
    {
        K.x.aaa();
    }
}
class C2Runnable implements Runnable 
{
    public void run()
    {
        K.x.bbb();
    }
}

// D:\javaprac\36_multi_threading>java K
// B - 0
// A - 0
// A - 1
// A - 2
// A - 3
// A - 4
// B - 1
// B - 2
// A - 5
// B - 3
// A - 6
// A - 7
// B - 4
// B - 5
// B - 6
// A - 8
// B - 7
// B - 8
// A - 9
// B - 9
// A - 10
// B - 10
// A - 11
// A - 12
// A - 13
// A - 14
// A - 15
// A - 16
// A - 17
// A - 18
// B - 11
// B - 12
// B - 13
// A - 19
// B - 14
// A - 20
// A - 21
// B - 15
// A - 22
// B - 16
// A - 23
// B - 17
// A - 24
// A - 25
// B - 18
// B - 19
// A - 26
// A - 27
// A - 28
// A - 29
// B - 20
// B - 21
// B - 22
// B - 23
// B - 24
// B - 25
// B - 26
// B - 27
// B - 28
// B - 29