class E1 
{
    public static void main(String[] args) {
        
        Thread x = Thread.currentThread();

        System.out.println("---Default Thread Details---");

        x.setName("Default Thread ");

        System.out.println("Thread Name - " + x.getName());
        System.out.println("Thread Id - " + x.getId());
        System.out.println("Thread Priority - " + x.getPriority());
    }
}

// D:\javaprac\35_multi_threading>javac E1.java

// D:\javaprac\35_multi_threading>java E1
// ---Default Thread Details---
// Thread Name - Default Thread
// Thread Id - 1
// Thread Priority - 5