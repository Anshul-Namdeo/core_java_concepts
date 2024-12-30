class R {
    public static void main(String args[]){

        int[][] x = new int[2][];

        for(int i=0; i<x.length ;i++){
            System.out.print(x[i].length + " ");
        }
    }
}

// Exception in thread "main" java.lang.NullPointerException: Cannot read the array length because "<local1>[<local2>]" is null
//         at R.main(R1.java:7)
