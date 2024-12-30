// @FunctionalInterface
interface M2 
{
    void pro();
    void info();
}

// D:\javaprac\55_annotations>javac M2.java
// M2.java:1: error: Unexpected @FunctionalInterface annotation
// @FunctionalInterface
// ^
//   M2 is not a functional interface
//     multiple non-overriding abstract methods found in interface M2
// 1 error


// Note : Functional interface mai exactly one Declared method hi bana sakte hai. agr apne ek se jyada declared method banai to error aa jayega..