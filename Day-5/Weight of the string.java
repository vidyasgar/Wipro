public class Main {

   // if ignore value is 0 then only ignore vowels
   public static int weightOfString(String string, int ignore) {

      if(string == null || string.isEmpty()) {
         return 0;
      }
      
      // convert string to lower-case
      string = string.toLowerCase();
      
      // variable to store weight of string
      int weight = 0;
      
      for (int i = 0; i < string.length(); i++) {
         char letter = string.charAt(i);
         if (ignore == 0) {
            if (letter == 'a' || letter == 'e' || letter == 'i' 
                || letter == 'o' || letter == 'u') {
               continue;
            }
         }
         if (letter >= 97 && letter <= 122) {
            weight += letter - 96;
         }
      }
      return weight;
   }

   public static void main(String[] args) {
      String string = "Know Program";
      
      // ignore vowels
      System.out.println("Weight of string ignoring vowels = "
                        + weightOfString(string, 0));
      
      // include vowels
      System.out.println("Weight of string including vowels = "
                        + weightOfString(string, 1));
   }

} 
