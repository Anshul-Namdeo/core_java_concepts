class CThread extends Thread
{
    public void run()
    {
        Thread t = Thread.currentThread();
        for(int i=0; i<30; i++)
        {
            System.out.println(t.getName() + " - " + i );
        }
    }
}


class V 
{
    public static void main(String args[])
    {
        CThread x = new CThread();
        x.setName("golu");
        //x.setDaemon(true);
        x.start();

        Thread t = Thread.currentThread();
        for(int i=0; i<30; i++)
        {
            System.out.println(t.getName() + " - " + i);
        }
    }
}

// D:\javaprac\36_multi_threading>javac V.java

// D:\javaprac\36_multi_threading>java V
// main - 0
// main - 1
// main - 2
// main - 3
// golu - 0
// golu - 1
// golu - 2
// golu - 3
// golu - 4
// golu - 5
// main - 4
// main - 5
// golu - 6
// golu - 7
// main - 6
// main - 7
// golu - 8
// golu - 9
// main - 8
// main - 9
// main - 10
// golu - 10
// golu - 11
// main - 11
// main - 12
// golu - 12
// main - 13
// main - 14
// main - 15
// main - 16
// main - 17
// main - 18
// golu - 13
// golu - 14
// main - 19
// main - 20
// golu - 15
// golu - 16
// main - 21
// main - 22
// golu - 17
// golu - 18
// golu - 19
// golu - 20
// main - 23
// main - 24
// main - 25
// main - 26
// golu - 21
// golu - 22
// golu - 23
// main - 27
// golu - 24
// main - 28
// golu - 25
// main - 29
// golu - 26
// golu - 27
// golu - 28
// golu - 29