class D1 {

        D1(int y){

                System.out.println(y);
        }
}

class Y extends D1 {

        int t = 9;

        Y(){
            super(t);
        }

        public static void main(String args[]){

                Y q = new Y();

                System.out.println(q.t);
        }
}

// Y.java:14: error: cannot reference t before supertype constructor has been called
//             super(t);
//                   ^
// 1 error