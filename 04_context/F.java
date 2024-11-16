class F {

        int y = 90;

        public static void main(String[] args){

            showInfo();

        }

        void showInfo(){

            System.out.println(y);
        }
}


// java:7: error: non-static method showInfo() cannot be referenced from a static context
//             showInfo();
//             ^
// 1 error