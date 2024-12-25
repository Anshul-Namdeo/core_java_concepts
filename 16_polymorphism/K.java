class K {
    public static void main(String[] args){

            Car x = new Sportscar();

            if(x instanceof Bus){
                System.out.println("Sportscar IS-A Bus");
            }else{
                System.out.println("Sportscar IS-not-A Bus");
            }
    }
}

// K.java:6: error: incompatible types: Car cannot be converted to Bus
//             if(x instanceof Bus){
//                ^
// 1 error