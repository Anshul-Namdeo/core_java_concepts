// warpper class objects are immutable...

// here in this case we are modifying the reference variable not the wrapper class value....

// a ftesh new object of wrapper class interger will be created and assingned to the same variable....

class A 
{
    public static void main(String args[])
    {
        Integer x = Integer.valueOf(12);

        System.out.println(x);

        x = Integer.valueOf(22);

        System.out.println(x);
    }
}



// D:\javaprac\58_immutable_class>javac A.java

// D:\javaprac\58_immutable_class>java A
// 12
// 22
