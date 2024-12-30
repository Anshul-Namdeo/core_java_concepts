class H 
{

        static String str = "moh\b\ban";
    public static void main(String args[])
    {
        new Thread(new Runnable()
        {
            public void run()
            {
                for(int i=0; i<str.length(); i++)
                {
                    System.out.print(str.charAt(i));
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        } ).start();
    }
}

// D:\javaprac\29_wrapper_classes>javac H.java

// D:\javaprac\29_wrapper_classes>java H
// man