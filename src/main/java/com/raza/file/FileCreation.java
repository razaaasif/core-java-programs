package com.raza.file;

import java.io.File;
import java.io.IOException;;

public class FileCreation {
	public static void main(String[] args) {
		File f = new File("abc.txt");
		System.out.println(f.exists());
		try {
			f.createNewFile();
			System.out.println(f.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
