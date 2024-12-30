// Ques : WAP to print Maximum element of the given array.

class Y {
    public static void main(String args[]){

            int[] x = {12,52,1,99,25,39,19,0,123,78};

            int max = x[0];

            for(int i=0 ; i < x.length ; i++){

                    if(x[i] > max ){

                            max = x[i];
                    }
            }

            System.out.println("the maximum value is :" + max);
    }
}