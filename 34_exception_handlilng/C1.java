class C1 
{
    public static void main(String args[])
    {
        if(args.length == 0)
        {
            try
            {
                throw new NocommandLineargumentException("Command Line Argument is Missing... Sorry!!!!");
            }
            catch(NocommandLineargumentException e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            System.out.println(args[0]);
        }
    }
}

class NocommandLineargumentException extends Exception 
{
    NocommandLineargumentException()
    {

    }

    NocommandLineargumentException(String message)
    {
        super(message);
    }
}


// D:\javaprac\34_exception_handlilng>javac C1.java

// D:\javaprac\34_exception_handlilng>java C1
// NocommandLineargumentException: Command Line Argument is Missing... Sorry!!!!
//         at C1.main(C1.java:9)