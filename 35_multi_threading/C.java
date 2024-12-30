class MyThread extends Thread 
{
    public void run()
    {
        System.out.println("MyThread run() method ");
    }
}


class C 
{
    public static void main(String[] args) {
        
        MyThread x = new MyThread();
        x.start();

        System.out.println("Default Thread main() method");
    }
}


// D:\javaprac\35_multi_threading>javac C.java

// D:\javaprac\35_multi_threading>java C
// Default Thread main() method
// MyThread run() method