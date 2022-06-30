package com.company.lockers;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class LockedMe {
	
	static final String projectpath = "C:\\Users\\People\\Desktop\\Java phase 1 Final Project\\CompanyLockersProject\\LockedMe files";

	public static void main(String[] args) 
	
	{
		Scanner scan = new Scanner(System.in);
		int choice;
		do
			{
			displayMenu();
			System.out.println("Enter Your Choice");
			choice = Integer.parseInt(scan.nextLine());
			
			switch(choice)
			{
			case 1 :getAllFiles();
				break;
			case 2 :createFiles();
				break;
			case 3 :deleteFiles();
				break;
			case 4 :searchFiles();
				break;
			case 5 :System.exit(0);
			 	break;
			 default : System.out.println("Invalid option");
			}
		}
		while(choice>0);
	}
	 	
	public static void displayMenu() 
	{
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println("\tWELCOME TO COMPANY LOCKERS - LockedMe.com");
		System.out.println("\t\tDeveloper Name : Karthick K");
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println("\t1.Display all the files");
		System.out.println("\t2.Add fies to existing Directory");
		System.out.println("\t3.Delete a file");
		System.out.println("\t4.Search a files");
		System.out.println("\t5.Exit");
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");	
	}
	
	public static void getAllFiles() 
	{
			File[] listOfFiles = new File(projectpath).listFiles();
		if(listOfFiles.length==0)
			System.out.println("No Files in existing Folder");
		else 
		{
			for(File l:listOfFiles) 
			{
				System.out.println(l.getName());
			}
		}
			
	}
	
	public static void createFiles() 
	{
		try 
		{
			Scanner scan = new Scanner(System.in);
			String fileName;
			int linesCount;
			
			System.out.println("Enter the file Name:");
			fileName = scan.nextLine();	
			
			System.out.println("Entre How Many Lines you Want to add in file");
			linesCount=Integer.parseInt(scan.nextLine());
			
			FileWriter fw = new FileWriter(projectpath+"//"+fileName);
			
			for(int i=1;i<=linesCount;i++) 
			{
				System.out.println("Enter The File Content line:");
				fw.write(scan.nextLine()+"\n");
			}
			
			System.out.println("File created Succesfully");
			fw.close();
			
		}
		catch (Exception ex) 
		{
			System.out.println("Some Error Occured");
		}
	}
	
	public static void deleteFiles() 
	{
		Scanner scan = new Scanner(System.in);
		try 
		{
			String fileName;
			System.out.println("Enter the File Name to be deleted");
			fileName = scan.nextLine();
			
			File fl = new File(projectpath+"\\"+fileName);
			if (fl.exists()) 
			{
				fl.delete();
				System.out.println("File deleted Successfully");
			}
			else 
			{
				System.out.println("File does not Exists11");
			}
		}
		catch(Exception Ex) 
		{
			System.out.println("");
		}
	}
	
	public static void searchFiles() 
	{
		
		Scanner scan = new Scanner(System.in);
		try 
		{
			String fileName;
			System.out.println("Enter the File Name to be Search");
			fileName = scan.nextLine();
			
			File fl = new File(projectpath+"\\"+fileName);
			if (fl.exists()) 
			{
				System.out.println("File is avilable");
			}
			else 
			{
				System.out.println("File is not available");
			}
		}
		catch(Exception EX) 
		{
			System.out.println("");
		}
	}

}
