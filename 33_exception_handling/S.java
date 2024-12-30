class S 
{
    public static void main(String[] args) {
        
        try{
            String x = "mohan";
            System.out.println(x.charAt(100));

            int[] y = {12,45,76};
            System.out.println(y[3]);
        }
        catch(IndexOutOfBoundsException|ArrayIndexOutOfBoundsException e){

            System.out.println("-----------------");

            e.printStackTrace();
        }
    }  
}

// D:\javaprac\33_exception_handling>javac S.java
// S.java:12: error: Alternatives in a multi-catch statement cannot be related by subclassing
//         catch(IndexOutOfBoundsException|ArrayIndexOutOfBoundsException e){
//                                         ^
//   Alternative ArrayIndexOutOfBoundsException is a subclass of alternative IndexOutOfBoundsException
// 1 error
