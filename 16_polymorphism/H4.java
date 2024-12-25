class H4{
    public static void main(String[] args){

            Object x = new Sportscar();

            if(x instanceof Sportscar){
                System.out.println("Sportscar IS-A Sportscar");
            }else{
                System.out.println("Sportscar IS-not-A Sportscar");
            }
    }
}