class Transaction implements Runnable 
{
    public void run()
    {
        Thread x = Thread.currentThread();

        for(int i=0; i<5; i++)
        {
            if(E.ac.getBalance() >= 10)
            {
                System.out.println(x.getName() + " is going to withdraw Rs 10");
            
            try{Thread.sleep(500);}catch(InterruptedException e){e.printStackTrace();}

            E.ac.withdraw(10);
            System.out.println(x.getName() + "After withdrawal.. the balance is Rs" + E.ac.getBalance());
            }
        }
    }
}


class E 
{
    static Account2 ac = new Account2();

    public static void main(String[] args) {
        
        Transaction t = new Transaction();
        Thread a = new Thread(t,"mohan");
        Thread b = new Thread(t,"sohan");

        a.start();
        b.start();
    }
}
    

//     D:\javaprac\36_multi_threading>java E
// mohan is going to withdraw Rs 10
// sohan is going to withdraw Rs 10
// sohanAfter withdrawal.. the balance is Rs30
// sohan is going to withdraw Rs 10
// mohanAfter withdrawal.. the balance is Rs40
// mohan is going to withdraw Rs 10
// sohanAfter withdrawal.. the balance is Rs20
// sohan is going to withdraw Rs 10
// mohanAfter withdrawal.. the balance is Rs10
// mohan is going to withdraw Rs 10
// sohanAfter withdrawal.. the balance is Rs-10
// mohanAfter withdrawal.. the balance is Rs0
// mohanAfter withdrawal.. the balance is Rs-30
// sohanAfter withdrawal.. the balance is Rs-20
// mohanAfter withdrawal.. the balance is Rs-40
// sohanAfter withdrawal.. the balance is Rs-50