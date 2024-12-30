import java.util.regex.Pattern;
import java.util.regex.Matcher;

class P 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("[^abc5]");
        Matcher m = p.matcher("Ua yna567_b %Zc");

        while(m.find())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }
}

// D:\javaprac\50_pattern_matcher>javac P.java

// D:\javaprac\50_pattern_matcher>java P
// match: U start: 0 end: 1
// match:   start: 2 end: 3
// match: y start: 3 end: 4
// match: n start: 4 end: 5
// match: 6 start: 7 end: 8
// match: 7 start: 8 end: 9
// match: _ start: 9 end: 10
// match:   start: 11 end: 12
// match: % start: 12 end: 13
// match: Z start: 13 end: 14
