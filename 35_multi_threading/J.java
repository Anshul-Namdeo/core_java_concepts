class MThread extends Thread 
{
    public void run()
    {
        System.out.println("--------------------");
    }
}

class J 
{
    public static void main(String[] args) {
        
        MThread a = new MThread();
        MThread b = new MThread();
        MThread c = new MThread();

         System.out.println(a.getName() + "-" + a.getId() + "-" + a.getPriority());
         System.out.println(b.getName() + "-" + b.getId() + "-" + b.getPriority());
         System.out.println(c.getName() + "-" + c.getId() + "-" + c.getPriority());
    }
}

// D:\javaprac\35_multi_threading>javac J.java

// D:\javaprac\35_multi_threading>java J
// Thread-0-15-5
// Thread-1-16-5
// Thread-2-17-5 
