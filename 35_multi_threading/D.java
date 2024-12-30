class XThread extends Thread
{
    public void run()
    {
        System.out.println("getId - " + getId());
        System.out.println("getName - " + getName());
        System.out.println("getPriority - " + getPriority());
    }
} 

class D 
{
    public static void main(String[] args) {
        
        XThread x = new XThread();
        x.start();
        System.out.println("Default Thread main method ");
    }
}


// D:\javaprac\35_multi_threading>javac D.java

// D:\javaprac\35_multi_threading>java D
// Default Thread main method
// getId - 15
// getName - Thread-0
// getPriority - 5