class Transaction implements Runnable 
{
    public void run()
    {
        Thread x = Thread.currentThread();
        for(int i=0; i<5; i++)
        {
            System.out.println(x.getName() + " is going to withdraw Rs 10 ");
            C.ac.withdraw(10);

            System.out.println(x.getName() + "After withdrwal... the balance is Rs " + C.ac.getBalance());
        }
    }
}

class C 
{
    static Account ac = new Account();

    public static void main(String[] args) {
        
       Transaction t = new Transaction();
       // new Thread(new Transaction(),"mohan").start();
       new Thread(t,"mohan").start();
       new Thread(t,"sohan").start();
    }
}


// D:\javaprac\36_multi_threading>java C
// sohan is going to withdraw Rs 10
// mohan is going to withdraw Rs 10
// sohanAfter withdrwal... the balance is Rs 40
// sohan is going to withdraw Rs 10
// sohanAfter withdrwal... the balance is Rs 20
// sohan is going to withdraw Rs 10
// mohanAfter withdrwal... the balance is Rs 30
// mohan is going to withdraw Rs 10
// sohanAfter withdrwal... the balance is Rs 10
// sohan is going to withdraw Rs 10
// mohanAfter withdrwal... the balance is Rs 0
// mohan is going to withdraw Rs 10
// sohanAfter withdrwal... the balance is Rs -10
// sohan is going to withdraw Rs 10
// mohanAfter withdrwal... the balance is Rs -20
// mohan is going to withdraw Rs 10
// sohanAfter withdrwal... the balance is Rs -30
// mohanAfter withdrwal... the balance is Rs -40
// mohan is going to withdraw Rs 10
// mohanAfter withdrwal... the balance is Rs -50