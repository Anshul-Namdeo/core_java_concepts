class JRunnable implements Runnable 
{
    public void run()
    {
        Thread t = Thread.currentThread();

        for(int i=0; i<30; i++)
        {
            System.out.println(t.getName() + " - " + i);
        }
    }
}


class Y 
{
    public static void main(String[] args) {
        
        Thread a  = new Thread(new JRunnable(),"A");
        Thread b = new Thread ( new JRunnable(), "B");
        Thread c = new Thread(new JRunnable(),"C");

        a.setPriority(1);
        b.setPriority(7);
        c.setPriority(3);
        
        a.start();
        b.start();
        c.start();
    }
}

// D:\javaprac\35_multi_threading>java Y
// A - 0
// C - 0       // jaruri nhi hai ki jis ki jyada priority hai wahi sbse pahle run hoga .
// C - 1           
// B - 0
// B - 1
// B - 2
// B - 3
// B - 4
// B - 5
// C - 2
// A - 1
// C - 3
// B - 6
// C - 4
// A - 2
// C - 5
// B - 7
// C - 6
// A - 3
// C - 7
// B - 8
// C - 8
// A - 4
// C - 9
// B - 9
// C - 10
// A - 5
// C - 11
// B - 10
// B - 11
// C - 12
// A - 6
// C - 13
// B - 12
// C - 14
// C - 15
// C - 16
// C - 17
// A - 7
// A - 8
// A - 9
// A - 10
// C - 18
// C - 19
// C - 20
// C - 21
// C - 22
// C - 23
// B - 13
// B - 14
// B - 15
// B - 16
// B - 17
// B - 18
// B - 19
// C - 24
// C - 25
// C - 26
// C - 27
// C - 28
// A - 11
// A - 12
// A - 13
// A - 14
// A - 15
// A - 16
// A - 17
// A - 18
// A - 19
// A - 20
// A - 21
// A - 22
// A - 23
// A - 24
// A - 25
// A - 26
// A - 27
// A - 28
// A - 29
// C - 29
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