class Host {

        public static void main(String args[]){

                Singer a = new Singer();
                Actor b = new Actor();
                Player c = new Player();

                    inviteForDinner(a);
                    inviteForDinner(b);
                    inviteForDinner(c);
        }

        static void inviteForDinner(Singer s){

                System.out.println("welcome guest");
                System.out.println("serve food");
        }

        static void inviteForDinne(Actor v){

                System.out.println("wlecome guest");
                System.out.println("serve food");
        }     

        static void inviteForDinne(Player r){

            System.out.println("welcome guest");
            System.out.println("serve food");
        }
        
        }