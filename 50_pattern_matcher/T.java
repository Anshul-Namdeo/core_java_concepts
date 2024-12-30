import java.util.regex.Pattern;
import java.util.regex.Matcher;

class T 

{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("0x[0-9a-f]"); // Hexadecimal mai likha hai
        Matcher m = p.matcher("Y_#0xt9j _0x2a7c9j_ 0Xfab4Ynjk _Uws0x7a85gk*_  0xQtpy");

        while(m.find())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }
}

// D:\javaprac\50_pattern_matcher>javac T.java

// D:\javaprac\50_pattern_matcher>java T
// match: 0x2 start: 10 end: 13
// match: 0x7 start: 35 end: 38
