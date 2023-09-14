package org.sam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testinngggg {
	public static void main(String[] args) {
		String S="Hi helllllo kHihe he he  656550 Hijk !@#%^&&**().    Hi";
		Pattern pat = Pattern.compile("\\bHi\\b");
		Matcher mat = pat.matcher(S);
		
		/*boolean find = mat.find();
		System.out.println(find);*/
		int count=0;
		//worldcup coming home
		//lworldcup coming home
		//worldcup coming home
		while(mat.find()) {
			count++;
			String group = mat.group();
			int start = mat.start();
			int end = mat.end();//it will add index plus one
			System.out.println("String value present ==> "+group);
		}
		System.out.println("Count of the word "+count);
		
	}
}
