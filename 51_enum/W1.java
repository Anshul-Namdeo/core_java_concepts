interface Golu 
{

}

class Bus 
{

}

class W1 
{
    public static void main(String args[])
    {
        Golu j = null;

        System.out.println(j instanceof Object);
        System.out.println(j instanceof Bus);
    }
}

// D:\javaprac\51_enum>javac W1.java

// D:\javaprac\51_enum>java W1
// false
// false
