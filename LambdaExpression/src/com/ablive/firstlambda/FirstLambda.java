package com.ablive.firstlambda;

import java.io.File;
import java.io.FileFilter;

public class FirstLambda {

	public static void main(String[] args) {
		
		//	Below is example of defining a filter by traditional anonymous class 
		/*FileFilter filter = new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				
				return pathname.getName().endsWith(".mp4");
			}
		};*/
		
		FileFilter filterLambda = (File pathname) -> pathname.getName().endsWith(".mp4"); 
		
		File dir = new File("E:/WWEMatchesandVideos");
		
		//	We are using the newly written filter here
		//	File[] files = dir.listFiles(filter);
		File[] files = dir.listFiles(filterLambda);
		
		for (File file : files) {
			System.out.println(file);
		}
	}
	
}