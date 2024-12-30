class YourThread extends Thread{

    public void run()
    {
        System.out.println("getId - " + getId());
        System.out.println("getName - " + getName());
        System.out.println("getPriority - " + getPriority());
    }
}
class Your1Thread extends Thread{

    public void run()
    {
        System.out.println("getId1 - " + getId());
        System.out.println("getName1 - " + getName());
        System.out.println("getPriority1 - " + getPriority());
    }
}

class D1 
{
    public static void main(String[] args) {
        
        YourThread x = new YourThread();
        x.start();

        Your1Thread y = new Your1Thread();
        y.start();

    }
}

// D:\javaprac\35_multi_threading>javac D1.java

// D:\javaprac\35_multi_threading>java D1
// getId - 15
// getId1 - 16
// getName1 - Thread-1
// getName - Thread-0
// getPriority1 - 5
// getPriority - 5