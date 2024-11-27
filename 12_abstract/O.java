abstract class Y {
    abstract void pro();
    abstract void info();
}

class O extends Y {
    void pro() {

    }
}


// O.java:6: error: O is not abstract and does not override abstract method info() in Y
// class O extends Y {
// ^
// 1 error