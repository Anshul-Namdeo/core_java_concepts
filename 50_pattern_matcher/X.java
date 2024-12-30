import java.util.regex.Pattern;
import java.util.regex.Matcher;

class X
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("0[Xx][0-9a-f]?");
        Matcher m = p.matcher("Y_#0xc91j _0x2a7c9j_ 0Xf8b4enjk _Uws0x7eh85gk* 0xbrj_  0xQtpy");

        while(m.find())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }
}

// Note : ? ka mtlb hai ya to 1 ya to 0 hona chahiye 
// ex..  [0x2] [0x] etc

// D:\javaprac\50_pattern_matcher>javac X.java

// D:\javaprac\50_pattern_matcher>java X
// match: 0xc start: 3 end: 6
// match: 0x2 start: 11 end: 14
// match: 0Xf start: 21 end: 24
// match: 0x7 start: 36 end: 39
// match: 0xb start: 47 end: 50
// match: 0x start: 55 end: 57