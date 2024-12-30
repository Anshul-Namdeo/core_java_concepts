import java.util.regex.Pattern;
import java.util.regex.Matcher;

class W 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("0[xX][0-9a-f]{2,4}");
        Matcher m = p.matcher("Y_#0xc9j _0x2a7c9j_ 0Xf8b4enjk _Uws0x7eh85gk* 0xbrj_  0xQtpy");
        
        while(m.find())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }
}

// D:\javaprac\50_pattern_matcher>javac W.java

// D:\javaprac\50_pattern_matcher>java W
// match: 0xc9 start: 3 end: 7
// match: 0x2a7c start: 10 end: 16
// match: 0Xf8b4 start: 20 end: 26
// match: 0x7e start: 35 end: 39