class F1 
{
    public static void main(String[] args) {
        
        Thread x = Thread.currentThread();

        x.setName("Default Thread");

        System.out.println(x);
    }
}

// D:\javaprac\35_multi_threading>javac F1.java

// D:\javaprac\35_multi_threading>java F1
// Thread[Default Thread,5,main]