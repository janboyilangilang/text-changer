package com.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URL;

public class MainClass {
	
	private static final String FILE_TO_READ = "fileToRead.txt";
	private static final String FILE_TO_WRITE = "fileToWrite.txt";
	
	public static void main(String[] args) {
		
		URL fileToReadPath = MainClass.class.getResource(FILE_TO_READ);
		URL fileToWritePath = MainClass.class.getResource(FILE_TO_WRITE);
		
		File fileToRead = new File(fileToReadPath.getFile());
		File fileToWrite = new File(fileToWritePath.getFile());
		
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileToRead));
				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileToWrite))) {
			
			TextChanger textChanger = new TextChanger();
			String currentLine = "";
			
			while ((currentLine = bufferedReader.readLine()) != null) {
				bufferedWriter.write(textChanger.changeText(currentLine));
				bufferedWriter.newLine();
			}
			
			System.out.println("The text has been successfully changed.");
			
		} catch (Exception e) {
			System.out.println("Something went wrong.");
			e.printStackTrace();
		}
		
	}
}
