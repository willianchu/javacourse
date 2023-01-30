// a username is considered valid if all the following constraints are satisfied:

// The username consists of 8 to 30 characters inclusive. If the username consists of less than 8 or 30 greater than  characters, then it is an invalid username.
// The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting of lowercase characters [a-z], uppercase characters [A-Z], and digits [0-9].
// The first character of the username must be an alphabetic character, i.e., either lowercase [a-z] character  or uppercase character [A-Z].

import java.util.Scanner;
class UsernameValidator {
    
    // final means that the variable cannot be changed
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
    // ^ matches the beginning of the line
    // [a-zA-Z] matches a single character in the range between a (index 97) and z (index 122) or A (index 65) and Z (index 90) (case sensitive)
    // [a-zA-Z0-9_] matches a single character in the list a-zA-Z0-9_ (case sensitive)
    // {7,29} matches the previous token between 7 and 29 times, as many times as possible, giving back as needed (greedy)
    // $ matches the end of the line
}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}