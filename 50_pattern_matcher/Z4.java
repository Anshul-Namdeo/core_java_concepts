import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Z4
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("mohan");
        Matcher m = p.matcher("mohan is my best friend");

        if(m.lookingAt())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }else{
            System.out.println("NO match");
        }
    }
}

// Note : lookingAt() ye cheak karta hai ki "tarketString" mai jo likha hai usa ki start jis word se ho rahi same wahi word se "pattern" mai bhi start honi chahiye


// D:\javaprac\50_pattern_matcher>javac Z4.java

// D:\javaprac\50_pattern_matcher>java Z4
// match: mohan start: 0 end: 5