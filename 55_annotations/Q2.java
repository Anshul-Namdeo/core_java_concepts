@interface College 
{
    String name();
    int age();
}
@College
class Student 
{
    String name;
    int age ;
}


// D:\javaprac\55_annotations>javac Q2.java
// Q2.java:6: error: annotation @College is missing default values for elements name,age
// @College
// ^
// 1 error