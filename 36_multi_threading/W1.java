class DThread extends Thread
{
    public void run()
    {
        EThread t = new EThread();
        t.setName("Bholu");
        t.setDaemon(false);
        t.start();
    }
}
class EThread extends Thread
{
    public void run()
    {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + " - " + t.isDaemon());
    }
}

class W1 
{
    public static void main(String args[])
    {
        DThread x = new DThread();
        x.setName("Golu");
        x.setDaemon(true);
        x.start();

        Thread t = Thread.currentThread();
        for(int i=0; i<30; i++)
        {
            System.out.println(t.getName() + " - " + i);
        }
    }
}

// D:\javaprac\36_multi_threading>javac W1.java

// D:\javaprac\36_multi_threading>java W1
// Bholu - false
// main - 0
// main - 1
// main - 2
// main - 3
// main - 4
// main - 5
// main - 6
// main - 7
// main - 8
// main - 9
// main - 10
// main - 11
// main - 12
// main - 13
// main - 14
// main - 15
// main - 16
// main - 17
// main - 18
// main - 19
// main - 20
// main - 21
// main - 22
// main - 23
// main - 24
// main - 25
// main - 26
// main - 27
// main - 28
// main - 29