import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Z5
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("mohan");
        Matcher m = p.matcher(" is mohan my best friend");

        if(m.lookingAt())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }else{
            System.out.println("NO match");
        }
    }
}

// D:\javaprac\50_pattern_matcher>javac Z5.java

// D:\javaprac\50_pattern_matcher>java Z5
// NO match