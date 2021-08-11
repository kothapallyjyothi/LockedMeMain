package com.lockedme;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileOperations 
{
	/**
	 * This method will return the file names from the folder
	 * @param folderpath
	 * @return
	 */
	public static List<String> getAllFiles(String folderpath)
	{
		//creating File Object
		File f1 = new File(folderpath);
		//Getting all the files into FileArray
		File[] listOfFiles = f1.listFiles();
		
		//Declare a list to store file names
		List<String> fileNames = new ArrayList<String>();
		
		for(File f:listOfFiles)
			fileNames.add(f.getName());
		
		//return the List
			return fileNames;
		
	}
	/**
	 * This method will create or append content into the file specified
	 * @param folderpath
	 * @param fileName
	 * @param content
	 * @return boolean
	 */
	public static boolean createFiles(String folderpath,String fileName,List<String> content)
	{
		try
		{
			//created object of folderPath and fileName
			File f1 = new File(folderpath, fileName);
			FileWriter fw = new FileWriter(f1);
			
			for(String s:content)
			{
				fw.write(s+"\n");
			}
			fw.close();
			return true;
		}

		catch(Exception Ex)
		{
			return false;
		}
		}
		/**
		 * This method will delete the file name if it exists.
		 * @param folderpath
		 * @param fileName
		 * @return
		 */
		public static boolean deleteFile(String folderpath, String fileName)
		{
			//adding folderpath with file name and creating file object
			File file = new File(folderpath+"\\"+fileName);
			
			try
			{
				if(file.delete())
					return true;
				else
					return false;
			}
			catch (Exception Ex)
			{
			return false;	
			}
		}
		/**
		 * This method will search from the folder, whether searched file exists or not 
		 * @param folderpath
		 * @param fileName
		 * @return
		 */
		public static boolean searchFile(String folderpath, String fileName)
		{
			//adding folderpath with file name and creating file object
			File file = new File(folderpath+"\\"+fileName);
			
			if(file.exists())
				return true;
				else
					return false;
		}
}
