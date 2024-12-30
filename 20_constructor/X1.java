class X1 {
    X1(int x){

    }

    X1(){
        this(2);
        super();
    }
}
// D:\javaprac\20_constructor>javac X1.java
// X1.java:8: error: call to super must be first statement in constructor
//         super();
//              ^
// 1 error