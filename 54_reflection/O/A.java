import java.lang.reflect.TypeVariable;

class A 
{
    public static void main(String args[])
    {
        TypeVariable[] vars = User.class.getDeclaredMethods()[0].getTypeParameters();

        for(TypeVariable var : vars) 
        {
            System.out.println(var.getName());
        }
    }
}

// D:\javaprac\54_reflection\O>javac A.java

// D:\javaprac\54_reflection\O>java A
// T
// E
// U
// X
