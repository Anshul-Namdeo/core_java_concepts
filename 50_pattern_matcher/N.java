import java.util.regex.Pattern;
import java.util.regex.Matcher;

class N 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("\\s");
        Matcher m = p.matcher("# $\t)@\n^\rg");

        while(m.find())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }
}

// D:\javaprac\50_pattern_matcher>javac N.java

// D:\javaprac\50_pattern_matcher>java N
// match:   start: 1 end: 2
// match:   start: 3 end: 4
// match:
//  start: 6 end: 7
//  start: 8 end: 9