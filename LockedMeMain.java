package com.lockedme;

import java.util.Scanner;

public class LockedMeMain {

	static final String folderpath="C:\\MyPhase1Project\\LockedMeFiles";
	public static void main(String[] args) 
	{
		//Code for searching a file
				String fileName;
				Scanner Sc = new Scanner(System.in);
				System.out.println("Enter file name to be searched:");
				fileName=Sc.nextLine();
				
				boolean isFound = FileOperations.searchFile(folderpath, fileName);
				if(isFound)
					System.out.println("File is present in the folder");
				else
					System.out.println("File is not present in the folder");
				
	}	

}
