class J {
    public static void main(String[] args){

            Vehicle x = new Bus();

            if(x instanceof Car){
                System.out.println("Bus IS-A Car");
            }else{
                System.out.println("bus IS-not-A Car");
            }
    }
}