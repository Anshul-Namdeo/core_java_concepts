class X {

        X(int x){


        }
        X(){
            super();
            this(2);
        }
}

// X.java:9: error: call to this must be first statement in constructor
//             this(2);
//                 ^
// 1 error