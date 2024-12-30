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


class V1 
{
    public static void main(String args[])
    {
        CThread x = new CThread();
        x.setName("golu");
        x.setDaemon(true);
        x.start();

        Thread t = Thread.currentThread();
        for(int i=0; i<10; i++)
        {
            System.out.println(t.getName() + " - " + i);
        }
    }
}
// D:\javaprac\36_multi_threading>java V1
// golu - 0
// golu - 1
// main - 0
// golu - 2
// golu - 3
// golu - 4
// golu - 5
// golu - 6
// golu - 7
// golu - 8
// golu - 9
// golu - 10
// main - 1
// golu - 11
// main - 2
// golu - 12
// main - 3
// main - 4
// golu - 13
// golu - 14
// main - 5
// golu - 15
// main - 6
// main - 7
// golu - 16
// golu - 17
// main - 8
// main - 9
// golu - 18
// golu - 19
// golu - 20