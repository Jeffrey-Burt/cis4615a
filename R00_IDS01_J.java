
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class R00_IDS01_J {
    
    public static void main(String[] args)
    {
        String s = "\uFE64" + "script" + "\uFE65";
 
        // Normalize
        s = Normalizer.normalize(s, Form.NFKC);

        // Validate
        Pattern pattern = Pattern.compile("[<>]");
        Matcher matcher = pattern.matcher(s);
        if (matcher.find()) {
          System.out.println("Found a blacklisted tag. Malicious input.");
          throw new IllegalStateException();
        } else {
          System.out.println("Successfully normalized the string.");
        }
    }
}