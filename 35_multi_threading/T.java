class A1Thread extends Thread 
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

class A2Thread extends A1Thread
{
    public void run()
    {
        A3Thread x = new A3Thread();
        x.setName("Kaliya");
        x.start();

        try{
            x.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        Thread t = Thread.currentThread();

        for(int i=0; i<30; i++)
        {
            System.out.println(t.getName() + " - " + i);
        }
    }
}
class A3Thread extends Thread 
{
    public void run()
    {
        A1Thread x = new A1Thread();
        x.setName("chhotabheem");
        x.start();

        try{
            x.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        Thread t = Thread.currentThread();
        for(int i=0; i<30; i++)
        {
            System.out.println(t.getName() + " - " + i);
        }
    }
}

class T 
{
    public static void main(String[] args) {
        
        A2Thread x = new A2Thread();
        x.setName("Raju");
        x.start();

        try{
            x.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        Thread t = Thread.currentThread();

        for(int i=0; i<30; i++)
        {
            System.out.println(t.getName() + " - " + i);
        }
    }
}



//D:\javaprac\35_multi_threading>javac T.java

// D:\javaprac\35_multi_threading>java T
// chhotabheem - 0
// chhotabheem - 1
// chhotabheem - 2
// chhotabheem - 3
// chhotabheem - 4
// chhotabheem - 5
// chhotabheem - 6
// chhotabheem - 7
// chhotabheem - 8
// chhotabheem - 9
// chhotabheem - 10
// chhotabheem - 11
// chhotabheem - 12
// chhotabheem - 13
// chhotabheem - 14
// chhotabheem - 15
// chhotabheem - 16
// chhotabheem - 17
// chhotabheem - 18
// chhotabheem - 19
// chhotabheem - 20
// chhotabheem - 21
// chhotabheem - 22
// chhotabheem - 23
// chhotabheem - 24
// chhotabheem - 25
// chhotabheem - 26
// chhotabheem - 27
// chhotabheem - 28
// chhotabheem - 29
// Kaliya - 0
// Kaliya - 1
// Kaliya - 2
// Kaliya - 3
// Kaliya - 4
// Kaliya - 5
// Kaliya - 6
// Kaliya - 7
// Kaliya - 8
// Kaliya - 9
// Kaliya - 10
// Kaliya - 11
// Kaliya - 12
// Kaliya - 13
// Kaliya - 14
// Kaliya - 15
// Kaliya - 16
// Kaliya - 17
// Kaliya - 18
// Kaliya - 19
// Kaliya - 20
// Kaliya - 21
// Kaliya - 22
// Kaliya - 23
// Kaliya - 24
// Kaliya - 25
// Kaliya - 26
// Kaliya - 27
// Kaliya - 28
// Kaliya - 29
// Raju - 0
// Raju - 1
// Raju - 2
// Raju - 3
// Raju - 4
// Raju - 5
// Raju - 6
// Raju - 7
// Raju - 8
// Raju - 9
// Raju - 10
// Raju - 11
// Raju - 12
// Raju - 13
// Raju - 14
// Raju - 15
// Raju - 16
// Raju - 17
// Raju - 18
// Raju - 19
// Raju - 20
// Raju - 21
// Raju - 22
// Raju - 23
// Raju - 24
// Raju - 25
// Raju - 26
// Raju - 27
// Raju - 28
// Raju - 29
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