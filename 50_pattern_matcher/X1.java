import java.util.regex.Pattern;
import java.util.regex.Matcher;

class X1
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("0[Xx][0-9a-f]+");
        Matcher m = p.matcher("Y_#0xc91j _0x2a7c9j_ 0Xf8b4enjk _Uws0x7eh85gk* 0xbrj_  0xQtpy");

        while(m.find())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }
}

//  Note : + ka mtlb hai ya to 1 ya to 1 se jyada hona chahiye  (1 or more)
// ex..  [0x2] [0xc34] [0xeb239] etc

// D:\javaprac\50_pattern_matcher>javac X1.java

// D:\javaprac\50_pattern_matcher>java X1
// match: 0xc91 start: 3 end: 8
// match: 0x2a7c9 start: 11 end: 18
// match: 0Xf8b4e start: 21 end: 28
// match: 0x7e start: 36 end: 40
// match: 0xb start: 47 end: 50