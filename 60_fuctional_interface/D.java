@FunctionalInterface
interface X2 {
    void pro();
}

@FunctionalInterface
interface D extends X2 
{
    void info();
}


// D:\javaprac\60_fuctional_interface>javac D.java
// D.java:6: error: Unexpected @FunctionalInterface annotation
// @FunctionalInterface
// ^
//   D is not a functional interface
//     multiple non-overriding abstract methods found in interface D
// 1 error