// Ques : WAP to print the total sum of the given arrays inputs..

class X {
    public static void main(String args[]){

            int[] x = new int[]{10,20,30,40,50,60};

            int sum = 0 ;

            for(int i=0 ; i < x.length ; i++){

                sum = sum + x[i];
            }

            System.out.println("the sum of the arrays is :"  + sum);

    }
}