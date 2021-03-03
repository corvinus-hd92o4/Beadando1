package ht;

import java.io.*;
import java.util.*;

public class Titkosito {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		PrintWriter pw = new PrintWriter("Output.txt");

		String line = br.readLine();
		int ascii = 0;
		char ujkarakter; // tudom, hogy nincs megadva kezdoertek, de kesobb adok neki

		while (line != null) {
			StringTokenizer st = new StringTokenizer(line);

			char[] karakter = new char[line.length()];

			// szoveg karakterekke konvertalasa
			for (int i = 0; i < line.length(); i++) {
				karakter[i] = line.charAt(i);
			}

			for (char c : karakter) {
				ascii = c; // a java tudja kezelni ezt az atalakitast

				if (ascii != 32) { // a space kodja 32
					ascii = ascii + 1;
					ujkarakter = (char) ascii;
					pw.print(ujkarakter);
				} else {
					pw.print(" ");
				}

			}
/*	
			for(int j = 0;j<karakter.length;j++) {
				ascii=karakter[j];
				
				if (ascii != 32) { // a space kodja 32
					ascii = ascii + 1;
					ujkarakter = (char) ascii;
					pw.print(ujkarakter);
				} else {
					pw.print(" ");
				}
			}
*/
			pw.print("\n");
			line = br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();

	}

}
