import java.util.regex.Pattern;

class B 
{
    public static void main(String args[])
    {
        Pattern  p = new Pattern("",0);
    }
}


// D:\javaprac\50_pattern_matcher>javac B.java
// B.java:7: error: Pattern(String,int) has private access in Pattern
//         Pattern  p = new Pattern("",0);
//                      ^
// 1 error