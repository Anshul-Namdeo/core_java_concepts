// Ques : WAP to print Minimum element of the given array.

class Z {
    public static void  main(String args[]){

            int[] x = {12,52,1,99,25,39,19,0,123,78};

            int min = x[0];

            for(int i=0; i < x.length ; i++){

                    if(x[i] < min ){

                            min = x[i];
                    }
            }
            System.out.println("thi minimum value is :"+ min);
    }
}