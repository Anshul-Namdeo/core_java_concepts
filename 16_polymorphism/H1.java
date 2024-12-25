class H1{
    public static void main(String[] args){

            Object x = new Sportscar();

            if(x instanceof Vehicle){
                System.out.println("Sportscar IS-A Vehicle");
            }else{
                System.out.println("Sportscar IS-not-A Vehicle");
            }
    }
}