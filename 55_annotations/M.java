@FunctionalInterface 
interface M 
{

}

// D:\javaprac\55_annotations> javac M.java
// M.java:1: error: Unexpected @FunctionalInterface annotation
// @FunctionalInterface
// ^
//   M is not a functional interface
//     no abstract method found in interface M
// 1 error


// NOTE : functional interface mai exactly one abstract(Declared) method honi chahiye .