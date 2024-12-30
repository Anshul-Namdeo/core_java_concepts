import java.util.regex.Pattern;
import java.util.regex.Matcher;

class U 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("0[xX][0-9a-f]");
        Matcher m = p.matcher("Y_#0xt9j _0x2a7c9j_ 0Xfab4Ynjk _Uws0x7a85gk*_  0xQtpy");

        while(m.find())
        {
            System.out.println("Match: " + m.group() + " start: " + m.start() + " end: " + m.end());  
        }
    }
}


// D:\javaprac\50_pattern_matcher>javac U.java

// D:\javaprac\50_pattern_matcher>java U
// Match: 0x2 start: 10 end: 13
// Match: 0Xf start: 20 end: 23
// Match: 0x7 start: 35 end: 38