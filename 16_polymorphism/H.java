class H {
    public static void main(String[] args){

            Object x = new Sportscar();

            if(x instanceof Object){
                System.out.println("Sportscar IS-A object");
            }else{
                System.out.println("Sportscar IS-not-A object");
            }
    }
}