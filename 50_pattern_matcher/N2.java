import java.util.regex.Pattern;
import java.util.regex.Matcher;

class N2
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("\\D");
        Matcher m = p.matcher("^{[2,4,%6llmn0");

        while(m.find())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }
}

// D:\javaprac\50_pattern_matcher>javac N2.java

// D:\javaprac\50_pattern_matcher>java N2
// match: ^ start: 0 end: 1
// match: { start: 1 end: 2
// match: [ start: 2 end: 3
// match: , start: 4 end: 5
// match: , start: 6 end: 7
// match: % start: 7 end: 8
// match: l start: 9 end: 10
// match: l start: 10 end: 11
// match: m start: 11 end: 12
// match: n start: 12 end: 13