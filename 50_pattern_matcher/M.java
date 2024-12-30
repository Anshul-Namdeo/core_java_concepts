import java.util.regex.Pattern;
import java.util.regex.Matcher;

class M 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("\\w");
        Matcher m = p.matcher("#@ %^a.)AL}0%&_");

        while(m.find())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }
}

// D:\javaprac\50_pattern_matcher>javac M.java

// D:\javaprac\50_pattern_matcher>java M
// match: a start: 5 end: 6
// match: A start: 8 end: 9
// match: L start: 9 end: 10
// match: 0 start: 11 end: 12
// match: _ start: 14 end: 15