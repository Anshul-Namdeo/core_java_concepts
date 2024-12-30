class R 
{
    public static void main(String[] args) {
        
        try{
            String x = "mohan";
            System.out.println(x.charAt(100));

            int[] y = {12,45,76};
            System.out.println(y[3]);
        }catch(IndexOutOfBoundsException e){
            e.printStackTrace();
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}

// D:\javaprac\33_exception_handling>javac R.java
// R.java:13: error: exception ArrayIndexOutOfBoundsException has already been caught
//         }catch(ArrayIndexOutOfBoundsException e){
//          ^
// 1 error