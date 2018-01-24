package io.github.mahendrabagul.trywithresources;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		FileReader fileReader = new FileReader(new File("file.txt"));
		try (fileReader) {

		} catch (Exception e) {
		}
	}
}
