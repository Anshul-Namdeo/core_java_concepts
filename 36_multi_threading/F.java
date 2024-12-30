class  Transaction implements Runnable 
{
    public void run()
    {
        Thread x = Thread.currentThread();
        for(int i=0; i<5; i++)
        {
            System.out.println(x.getName() + " is going to withdraw RS 10");
            F.ac.withdraw(10);

            System.out.println(x.getName() + "after withdrwal.. the balance is Rs " + F.ac.getBalance());
        }
    }
}


class F 
{
    static Account3 ac = new Account3();

    public static void main(String[] args) {
        
        Transaction t = new Transaction();
        Thread a = new Thread(t,"mohan");
        Thread b = new Thread(t,"sohan");

        a.start();
        b.start();

    }
}

// D:\javaprac\36_multi_threading>java F
// sohan is going to withdraw RS 10
// mohan is going to withdraw RS 10
// sohanafter withdrwal.. the balance is Rs 40
// sohan is going to withdraw RS 10
// mohanafter withdrwal.. the balance is Rs 30
// mohan is going to withdraw RS 10
// sohanafter withdrwal.. the balance is Rs 20
// sohan is going to withdraw RS 10
// mohanafter withdrwal.. the balance is Rs 10
// mohan is going to withdraw RS 10
// mohanafter withdrwal.. the balance is Rs 0
// mohan is going to withdraw RS 10
// mohanafter withdrwal.. the balance is Rs 0
// mohan is going to withdraw RS 10
// sohanafter withdrwal.. the balance is Rs 0
// sohan is going to withdraw RS 10
// mohanafter withdrwal.. the balance is Rs 0
// sohanafter withdrwal.. the balance is Rs 0
// sohan is going to withdraw RS 10
// sohanafter withdrwal.. the balance is Rs 0