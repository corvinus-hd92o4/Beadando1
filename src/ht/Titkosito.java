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
		char ujkarakter; 

		while (line != null) {
			StringTokenizer st = new StringTokenizer(line);

			char[] karakter = new char[line.length()];

			// szoveg karakterekke konvertalasa
			for (int i = 0; i < line.length(); i++) {
				karakter[i] = line.charAt(i);
			}

			for (char c : karakter) {
				ascii = c; 

				if (ascii != 32) { // a space kodja 32
					ascii = ascii + 1;
					ujkarakter = (char) ascii;
					pw.print(ujkarakter);
				} else {
					pw.print(" ");
				}

			}

			pw.print("\n");
			line = br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();

	}

}
