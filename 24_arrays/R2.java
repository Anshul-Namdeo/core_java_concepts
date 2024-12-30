class R2 {
    public static void main(String args[]){

        int[][] x = new int[2][];

        for(int i=0; i<x.length ;i++){
            for(int j=0; j<x[i].length; j++){

                 System.out.print(x[i][j] + " ");
            }
           System.out.println(" ");
        }
    }
}

// Exception in thread "main" java.lang.NullPointerException: Cannot read the array length because "<local1>[<local2>]" is null
//         at R2.main(R2.java:7)
