class Account5 
{
    private int balance = 50;

    public /*synchronized*/ void withdraw(int amt)
    {
        synchronized(this)
        {
            if(balance >= 10)
            {
                try{
                    Thread.sleep(500);
                }catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                balance = balance - amt;
            }
        }
    }

    public synchronized int getBalance()
    {
        return balance;
    }
}