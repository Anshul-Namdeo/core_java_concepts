class C1Thread extends Thread 
{
    public void run()
    {
        Thread t = Thread.currentThread();

        try{
            V.y.join();
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        for(int i=0; i<30; i++)
        {
            System.out.println(t.getName() + " - " + i);
        }
    }
}
class C2Thread extends Thread 
{
    public void run()
    {
        Thread t = Thread.currentThread();

        try{
            V.x.join();
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        for(int i=0; i<30; i++)
        {
            System.out.println(t.getName() + " - " + i);
        }
    }
}


class V 
{
    static Thread x;
    static Thread y;
    public static void main(String[] args) {
        
        x = new C1Thread();
        y = new C2Thread();

        x.setName("Golu");
        y.setName("bablu");

        x.start();
        y.start();

    }
}


// Deadlock condition create