
class A 
{
    public static void main(String args[])
    {
        Class k1 = Student.class;
        
        Class[] ks = k1.getInterfaces();

        for(Class next : ks)
        {
            System.out.println(next.getName());
        }
    }
}


// D:\javaprac\53_reflection\G>javac A.java

// D:\javaprac\53_reflection\G>java A
// Smart
// Intelligent