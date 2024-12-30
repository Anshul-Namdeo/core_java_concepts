class Acoount4 
{
    private int balance = 50;
    private String accType = "savings";
    private String accNum = "4567";

    public String getAccType()
    {
        return accType;
    }

    public /*synchronized*/ String getAccNum()
     {
        return accNum;
     }

     public synchronized void withdraw(int amt)
     {
        Thread x = Thread.currentThread();
        if(balance >= amt)
        {
            System.out.println(x.getName() + "~~~~~~~~~~~~~~~~~~~~~~~~~~");
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            balance = balance - amt;
            System.out.println(x.getName() + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~" );
        }
     }

     public synchronized int getBalance()
     {
        return balance ;
     }
}


// D:\javaprac\36_multi_threading>javac G.java

// D:\javaprac\36_multi_threading>java G
// mohan~~~~~~~~~~~~~~~~~~~~~~~~~~
// 4567
// mohan~~~~~~~~~~~~~~~~~~~~~~~~~~~~