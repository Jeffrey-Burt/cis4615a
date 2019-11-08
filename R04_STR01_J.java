public class R04_STR01_J {
    
    public static String trim(String string) {
      int ch;
      int i;
      for (i = 0; i < string.length(); i += Character.charCount(ch)) {
        ch = string.codePointAt(i);
        if (!Character.isLetter(ch)) {
          break;
        }
      }
      return string.substring(i);
    }

    public static void main(String[] args) {
        String withoutExclamation = "HelloWorld";
        String withExclamation = "!HelloWorld";
        System.out.println(trim(withoutExclamation));
        System.out.println(trim(withExclamation));
    }
}