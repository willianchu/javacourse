import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";
        // \\b matches a word boundary
        // \\w+ matches one or more word characters
        // (\\b\\W+\\b\\1\\b)* matches zero or more repetitions of the following group:

        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        // Pattern.CASE_INSENSITIVE makes the regex case insensitive

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
                // replaceAll() replaces all occurrences of the regex with the replacement string
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}