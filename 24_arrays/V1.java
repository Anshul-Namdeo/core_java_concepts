class V1 {
    public static void main(String args[]){

        int[][] x = new int[][] { {4,9,12,2}, {11,23}, {7,1,8,6,3} };

       // int[] x = new int[]{1,2,3,4,5,6};

        for(int[] w : x){
            for(int t : w){
                 System.out.print(t  + " ");
            }

            System.out.println(" ");
        }
        
    }
}

// 4 9 12 2
// 11 23
// 7 1 8 6 3