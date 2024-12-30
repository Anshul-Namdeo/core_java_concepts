class J1 
{
    int pro1() 
    {
        return 1;
    }

    int[] pro2()
    {
        return null;
    }

    int...pro3() // var_args ko sirf parameter body mai likh sakte hai..
    {
        return null;
    }
}


// D:\javaprac\52_var_args>javac J1.java
// J1.java:13: error: <identifier> expected
//     int...pro3()
//        ^
// J1.java:13: error: invalid method declaration; return type required
//     int...pro3()
//           ^
// 2 errors
