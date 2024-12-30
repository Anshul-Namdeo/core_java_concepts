class R 
{
    static BB x = new BB();
    static BB y = new BB();

    public static void main(String args[])
    {
        Thread t1 = new Thread(new G1Runnable(),"Doremon");
        Thread t2 = new Thread(new G2Runnable(),"Nobita");

        t1.start();
        t2.start();
    }
}
class G1Runnable implements Runnable
{
    public void run()
    {
        R.x.pro();
    }
}
class G2Runnable implements Runnable
{
    public void run()
    {
        R.y.Info();

    }
}
class BB 
{
    synchronized void pro()
    {
        Thread t = Thread.currentThread();
        for(int i=0; i<30; i++)
        {
            if(i == 15)
            {
                R.y.Info();
            }
            System.out.println(t.getName() + " -- " + i);
        }
    }

    synchronized void Info()
    {
        Thread t = Thread.currentThread();
        for(int i=0; i<30; i++)
        {
            if(i == 15)
            {
                R.x.pro();
            }
            System.out.println(t.getName() + " -- " + i);
        }
    }
}

// DeadLock Situation craete 

// D:\javaprac\36_multi_threading>javac R.java

// D:\javaprac\36_multi_threading>java R
// Nobita -- 0
// Nobita -- 1
// Nobita -- 2
// Nobita -- 3
// Doremon -- 0
// Doremon -- 1
// Doremon -- 2
// Doremon -- 3
// Doremon -- 4
// Doremon -- 5
// Doremon -- 6
// Nobita -- 4
// Doremon -- 7
// Doremon -- 8
// Doremon -- 9
// Doremon -- 10
// Doremon -- 11
// Doremon -- 12
// Doremon -- 13
// Nobita -- 5
// Nobita -- 6
// Nobita -- 7
// Nobita -- 8
// Nobita -- 9
// Nobita -- 10
// Doremon -- 14
// Nobita -- 11
// Nobita -- 12
// Nobita -- 13
// Nobita -- 14
