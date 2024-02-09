package com.raza.file;

import java.io.File;
import java.util.Arrays;

public class PrintFileAndFolder {

	public static void main(String[] args) {
		File f = new File("C://workspace");
		String[] names = f.list();
		Arrays.stream(names).forEach(System.out::println);
	}
}
