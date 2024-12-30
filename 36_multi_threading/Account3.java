class Account3 
{
    private int balance = 50;
    
    public synchronized void withdraw(int amt)
    {
        if(balance >= amt)
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

    public synchronized int getBalance()
    {
        return balance ;
    }
}
