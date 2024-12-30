enum BBB 
{

}

class Y 
{
    public static void main(String args[])
    {
        BBB x = new BBB() {

        };
    }
}

// D:\javaprac\51_enum>javac Y.java
// Y.java:10: error: enum types may not be instantiated
//         BBB x = new BBB() {
//                 ^
// Y.java:10: error: cannot inherit from final BBB
//         BBB x = new BBB() {
//                     ^
// Y.java:10: error: enum types are not extensible
//         BBB x = new BBB() {
//                           ^
// 3 errors
