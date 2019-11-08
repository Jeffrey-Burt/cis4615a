
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class R00_IDS03_J {
    
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());
        
        String username = "JeffreyBurt";
        String usernameSpace = "Jeffrey Burt";
        boolean loginSuccessful = true;
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + sanitizeUser(username));
            logger.severe("User login succeeded for: " + sanitizeUser(usernameSpace));
        } else {
        logger.severe("User login failed for: " + sanitizeUser(username));
        logger.severe("User login succeeded for: " + sanitizeUser(usernameSpace));
      }
    }
    
        
    public static String sanitizeUser(String username) {
        return (Pattern.matches("[A-Za-z0-9_]+", username)) ? username : "unauthorized user";
    }

}
