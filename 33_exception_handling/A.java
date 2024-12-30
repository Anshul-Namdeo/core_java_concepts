class A 
{
    public static void main(String[] args) {
        
        System.out.println("A");

        try{
            System.out.println("A");
                try
                {
                    System.out.println("B");

                }catch(Exception e){
                    System.out.println("Exception");
                }finally{
                    System.out.println("C");
                }
        }catch(Exception e)
        {
            System.out.println("A");
            try
            {
                System.out.println("B");

            }catch(Exception e1){
                System.out.println("Exception");
            }finally{
                System.out.println("C");
            }
        }finally
        {
            System.out.println("A");
            try
            {
                System.out.println("B");

            }catch(Exception e){
                System.out.println("Exception");
            }finally{
                System.out.println("C");
            }
        }
    }
}

// D:\javaprac\33_exception_handling>javac A.java

// D:\javaprac\33_exception_handling>java A
// A
// A
// B
// C
// A
// B
// C