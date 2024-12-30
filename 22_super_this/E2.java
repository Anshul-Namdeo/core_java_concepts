class X1 {
    X1(E2 s){

    }
}
class E2 extends X1 {
    E2(){
        super(this);
    }
}

// E2.java:8: error: cannot reference this before supertype constructor has been called
//         super(this);
//               ^
// 1 error