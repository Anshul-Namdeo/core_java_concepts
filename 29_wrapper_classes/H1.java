class H1 
{

        static String str = "moh\ran";
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
                        Thread.sleep(2000);
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

// D:\javaprac\29_wrapper_classes>javac H1.java

// D:\javaprac\29_wrapper_classes>java H1
// anh