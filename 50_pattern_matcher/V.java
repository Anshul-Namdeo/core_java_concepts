import java.util.regex.Pattern;
import java.util.regex.Matcher;

class V 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("0[xX][0-9a-f]{2}"); 
        Matcher m = p.matcher("Y_#0xt9j _0x2a7c9j_ 0Xf8b4Ynjk _Uws0x7e85gk*_  0xQtpy");

        while(m.find())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }
}

// Note: [0-9a-f] ke liye {2} wo Quantifier hai. isa ka mtlb ye hai ki jo [0-9a-f] hai una ke do match milna chahiye...

// D:\javaprac\50_pattern_matcher>javac V.java

// D:\javaprac\50_pattern_matcher>java V
// match: 0x2a start: 10 end: 14
// match: 0Xf8 start: 20 end: 24
// match: 0x7e start: 35 end: 39