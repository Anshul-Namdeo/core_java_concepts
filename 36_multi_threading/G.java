class Transaction implements Runnable 
{
    public void run()
    {
        G.ac.withdraw(10);
    }
}

class Transaction2 implements Runnable 
{
    public void run()
    {
        Thread x = Thread.currentThread();
        System.out.println(G.ac.getAccNum());
    }
}

class G 
{
    static Acoount4 ac = new Acoount4();

     public static void main(String[] args) throws InterruptedException {
        
           Thread a = new Thread (new Transaction(),"mohan");
           Thread b = new Thread (new Transaction2(),"sohan");

           a.start();
           Thread.sleep(50);
           b.start();
     }
}

// D:\javaprac\36_multi_threading>java G
// mohan~~~~~~~~~~~~~~~~~~~~~~~~~~
// 4567
// mohan~~~~~~~~~~~~~~~~~~~~~~~~~~~~
