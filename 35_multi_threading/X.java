class CRunnable implements Runnable
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
class X 
{
    public static void main(String[] args) {
        
        // ***********[1st way]**********
        // CRunnable r = new CRunnable();
        // Thread x = new Thread(r);
        // x.setName("yamraj");
        // x.start();

        // ***********[2nd way]**********
        // Thread x = new Thread(new CRunnable());
        // x.setName("yamraj");
        // x.start();

        // ***********[3rd way]**********
        // Thread x = new Thread(new CRunnable(),"yamraj");
        // x.start();

        // ***********[4th way]**********

        new Thread(new CRunnable(),"yamraj").start();

        Thread t = Thread.currentThread();

        for(int i=0; i<30; i++)
        {
                if(i>15)
                    Thread.yield();

            System.out.println(t.getName() + " - " + i);
        }
    }
}

// D:\javaprac\35_multi_threading>java X
// yamraj - 0
// yamraj - 1
// main - 0
// main - 1
// yamraj - 2
// yamraj - 3
// main - 2
// main - 3
// yamraj - 4
// main - 4
// main - 5
// yamraj - 5
// main - 6
// yamraj - 6
// yamraj - 7
// yamraj - 8
// main - 7
// main - 8
// main - 9
// main - 10
// main - 11
// main - 12
// main - 13
// yamraj - 9
// main - 14
// yamraj - 10
// yamraj - 11
// main - 15
// yamraj - 12
// yamraj - 13
// yamraj - 14
// yamraj - 15
// yamraj - 16
// main - 16
// main - 17
// yamraj - 17
// main - 18
// main - 19
// yamraj - 18
// yamraj - 19
// yamraj - 20
// yamraj - 21
// yamraj - 22
// main - 20
// main - 21
// yamraj - 23
// yamraj - 24
// yamraj - 25
// yamraj - 26
// yamraj - 27
// main - 22
// main - 23
// main - 24
// yamraj - 28
// yamraj - 29
// main - 25
// main - 26
// main - 27
// main - 28
// main - 29