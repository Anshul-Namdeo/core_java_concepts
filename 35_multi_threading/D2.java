class Your2Thread extends Thread{

    public void run()
    {
        System.out.println("getId - " + getId());
        System.out.println("getName - " + getName());
        System.out.println("getPriority - " + getPriority());
    }
}
class Your3Thread extends Thread{

    public void run()
    {
        System.out.println("getId1 - " + getId());
        System.out.println("getName1 - " + getName());
        System.out.println("getPriority1 - " + getPriority());
    }
}
class Your4Thread extends Thread{

    public void run()
    {
        System.out.println("getId2 - " + getId());
        System.out.println("getName2 - " + getName());
        System.out.println("getPriority2 - " + getPriority());
    }
}

class D2
{
    public static void main(String[] args) {
        
        Your2Thread x = new Your2Thread();
        x.start();

        Your3Thread y = new Your3Thread();
        y.start();

        Your4Thread z = new Your4Thread();
        z.start();

    }
}


// D:\javaprac\35_multi_threading>javac D2.java

// D:\javaprac\35_multi_threading>java D2
// getId1 - 16
// getId - 15
// getId2 - 17
// getName - Thread-0
// getName1 - Thread-1
// getName2 - Thread-2
// getPriority1 - 5
// getPriority2 - 5
// getPriority - 5