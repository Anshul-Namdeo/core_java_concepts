class N 
{
    public static void main(String[] args) {
        
        System.out.println(1);

        try{
            System.out.println(2);
        } catch(ArithmeticException e)
        {
            e.printStackTrace();
        }

        System.out.println(3);
    }
}

// D:\javaprac\33_exception_handling>javac N.java

// D:\javaprac\33_exception_handling>java N
// 1
// 2
// 3
