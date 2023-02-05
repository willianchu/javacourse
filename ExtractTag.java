import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExtractTag{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	//html tag extractor
						boolean matchFound = false;
						Matcher m = Pattern.compile("<(.+)>([^<]+)</\\1>").matcher(line);
						// <(.+)> matches the opening tag, ([^<]+) matches the content, and </\\1> matches the closing tag. The \\1 in the closing tag matches whatever was matched in the opening tag.
						
						while (m.find()) { 
							System.out.println(m.group(2)); // group(2) is the content
							// while group(1) is the tag
							// and group(0) is the whole thing
							matchFound = true;
						}
						if (!matchFound) {
							System.out.println("None");
						}

			
			testCases--;
		}
	}
}



