class A {
    public static void main(String args[]){

        int[] x ={10,51,17,23,7};

        int[] y = new int[x.length];

        for(int i=0; i< y.length ; i++){
            System.out.println(y[i]);
        }

        for(int i=0; i< x.length ; i++){
            y[i] = x[i];
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for(int i=0; i<y.length ; i++){
            System.out.println(y[i]);
        }    }
}