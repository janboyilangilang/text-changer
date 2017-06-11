package com.main;

public class TextChanger {
	
	public String changeText(String textToChange) {	
		char[] textToChangeCharArray = textToChange.toCharArray();
		for (int i = 0; i < textToChangeCharArray.length; i++) {
			char currentChar = textToChangeCharArray[i];
			if(currentChar == 65 || currentChar == 97) {
				char nextChar = textToChangeCharArray[i + 1];
				if((nextChar == 65 || nextChar == 97)) {
					for (int j = i + 1; j < textToChangeCharArray.length; j++) {
						if(textToChangeCharArray[j] == 65 || textToChangeCharArray[j] == 97) {
							textToChangeCharArray[j] = 36;
						} else {
							break;
						}
					}
				} else {
					textToChangeCharArray[i] = 35;
				}
			}
		}
		return String.valueOf(textToChangeCharArray);
	}
}
