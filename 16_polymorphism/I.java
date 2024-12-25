class I {
    public static void main(String[] args){

            Object x = new Bus();

            if(x instanceof Sportscar){
                System.out.println("Bus IS-A Sportscar");
            }else{
                System.out.println("bus IS-not-A Sportscar");
            }
    }
}