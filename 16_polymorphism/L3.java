class Host {

        public static void main(String args[]){

                Singer a = new Singer();
                Actor x = new Actor();
                Player y = new Player();

                    inviteForDinner(a);
                    inviteForDinner(x);
                    inviteForDinner(y);

        }

        static void inviteForDinner(Singer s){

                System.out.println(s);
        }

        static void inviteForDinner(Actor ac){

                System.out.println(ac);
        }

        static void inviteForDinner(Player p){

                System.out.println(p);
        }



}