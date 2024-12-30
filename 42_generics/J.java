import java.util.ArrayList;

class J 
{
    public static void main(String args[])
    {

        // Note : Element Type <> mai Primitives are not allowed..

        ArrayList <boolean> x1 = new ArrayList <> ();
        ArrayList <char> x2 = new ArrayList <> ();
        ArrayList <byte> x3 = new ArrayList <> ();
        ArrayList <short> x4 = new ArrayList <> ();
        ArrayList <int> x5 = new ArrayList <> ();
        ArrayList <long> x6 = new ArrayList <> ();
        ArrayList <float> x7 = new ArrayList <> ();
        ArrayList <double> x8 = new ArrayList <> ();
    }
}

// D:\javaprac\42_generics>javac J.java
// J.java:10: error: unexpected type
//         ArrayList <boolean> x1 = new ArrayList <> ();
//                    ^
//   required: reference
//   found:    boolean
// J.java:11: error: unexpected type
//         ArrayList <char> x2 = new ArrayList <> ();
//                    ^
//   required: reference
//   found:    char
// J.java:12: error: unexpected type
//         ArrayList <byte> x3 = new ArrayList <> ();
//                    ^
//   required: reference
//   found:    byte
// J.java:13: error: unexpected type
//         ArrayList <short> x4 = new ArrayList <> ();
//                    ^
//   required: reference
//   found:    short
// J.java:14: error: unexpected type
//         ArrayList <int> x5 = new ArrayList <> ();
//                    ^
//   required: reference
//   found:    int
// J.java:15: error: unexpected type
//         ArrayList <long> x6 = new ArrayList <> ();
//                    ^
//   required: reference
//   found:    long
// J.java:16: error: unexpected type
//         ArrayList <float> x7 = new ArrayList <> ();
//                    ^
//   required: reference
//   found:    float
// J.java:17: error: unexpected type
//         ArrayList <double> x8 = new ArrayList <> ();
//                    ^
//   required: reference
//   found:    double
// 8 errors

// D:\javaprac\42_generics>