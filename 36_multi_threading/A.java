class ARunnable implements Runnable 
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
}

class A 
{
    public static void main(String[] args) {
        
        Thread x = new Thread(new ARunnable(),"yamraj");

        x.setPriority(MIN_PRIORITY);

        System.out.println(Thread.currentThread().getName());
    }
}


// D:\javaprac\36_multi_threading>javac A.java
// A.java:15: error: cannot find symbol
//         x.setPriority(MIN_PRIORITY);
//                       ^
//   symbol:   variable MIN_PRIORITY
//   location: class A
// 1 error