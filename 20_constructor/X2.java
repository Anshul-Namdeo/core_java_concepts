class X2 {
    X2(int x){

    }

    X2(){
        this(2); super();
       
    }
}

// X2.java:7: error: call to super must be first statement in constructor
//         this(2); super();
//                       ^
// 1 error