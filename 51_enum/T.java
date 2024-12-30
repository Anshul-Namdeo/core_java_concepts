enum BartanSize 
{
    BIG, HUGE, SMALL
}

enum GlassSize extends BartanSize 
{
    MEDIUM, LARGE
}


// D:\javaprac\51_enum>javac T.java
// T.java:6: error: '{' expected
// enum GlassSize extends BartanSize
//               ^
// T.java:6: error: enum constant expected here
// enum GlassSize extends BartanSize
//                ^
// T.java:8: error: <identifier> expected
//     MEDIUM, LARGE
//           ^
// T.java:8: error: ';' expected
//     MEDIUM, LARGE
//                  ^
// T.java:9: error: reached end of file while parsing
// }
//  ^
// 5 errors



// NOTE : hum enum ko extends nhi kr sakte hai...
