class W 
{
    public static void main(String[] args) throws InterruptedException {
        
        Thread.currentThread().join();

        Thread t = Thread.currentThread();

        for(int i=0; i<30; i++)
        {
            System.out.println(t.getName() + " - " + i);
        }
    }
}

// Deadlock condition create