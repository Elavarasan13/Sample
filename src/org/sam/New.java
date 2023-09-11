package org.sam;

public class New {

	public static void main(String[] args) {
		
		String RowHouseArray[]  = {"Person A", "Person B", "Person C", "Person D", "Person E"}; 
		
	String	LettersFromPostman[] = {"Person B","Person J","Person I","Person ","Person E"};
		for (int i = 0; i < RowHouseArray.length; i++) {
			for (int j = 0; j < LettersFromPostman.length; j++) {
				if (RowHouseArray[i].equalsIgnoreCase(LettersFromPostman[j])) {
					System.out.println("Matched the address with the respective person "+RowHouseArray[i]+"  Matched with===>"+LettersFromPostman[j] );
				} else {
					System.out.println("Not Matched the address with the respective person "+RowHouseArray[i]+"  not Matched with===>"+LettersFromPostman[j]);
				}
			}
		}
	}
}
