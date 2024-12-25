class Host{

        public static void main(String [] args){

                Singer a = new Singer();
                Actor x = new Actor();
                Player y = new Player();

                    inviteForDinner(a);
                    inviteForDinner(x);
                    inviteForDinner(y);

        } 

        static void inviteForDinner(Guest bablu){

                System.out.println(" wlecome geust");
                System.out.println("serve food");
        }

        // static void inviteForDinner(Singer s){

        //         System.out.println("welcome guest");
        //         System.out.println("serve food");
        // }

        // static void inviteForDinne(Actor v){

        //         System.out.println("wlecome guest");
        //         System.out.println("serve food");
        // }     

        // static void inviteForDinne(Player r){

        //     System.out.println("welcome guest");
        //     System.out.println("serve food");
        // }
        
}

