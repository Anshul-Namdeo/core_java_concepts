import java.util.regex.Pattern;
import java.util.regex.Matcher;

class G 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("mohan");
        Matcher m = p.matcher("mohan is a good boy and mohan is my best friend and mohan scored 90 oyt of 100");

        while(m.find())
        {
            System.out.println(m);
        }
    }
}


// D:\javaprac\50_pattern_matcher>javac G.java

// D:\javaprac\50_pattern_matcher>java G
// java.util.regex.Matcher[pattern=mohan region=0,78 lastmatch=mohan]
// java.util.regex.Matcher[pattern=mohan region=0,78 lastmatch=mohan]
// java.util.regex.Matcher[pattern=mohan region=0,78 lastmatch=mohan]
