class R1
{
    public static void main(String[] args) {
        
        try{
            String x = "mohan";
            System.out.println(x.charAt(100));

            int[] y = {12,45,76};
            System.out.println(y[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("----------------");
            e.printStackTrace();
        }catch(IndexOutOfBoundsException e){
            System.out.println("################");
            e.printStackTrace();
        }
    }
}


// D:\javaprac\33_exception_handling>javac R1.java

// D:\javaprac\33_exception_handling>java R1
// ################
// java.lang.StringIndexOutOfBoundsException: String index out of range: 100
//         at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
//         at java.base/java.lang.String.charAt(String.java:1519)
//         at R1.main(R1.java:7)