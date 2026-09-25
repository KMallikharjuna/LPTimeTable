package staticex;

import java.io.InputStream;
import java.util.Scanner;

public class IO {
	public Scanner scan;
	public IO(InputStream inStream) {
		scan = new Scanner(inStream);
	}
	
	public int readInt() {
		return scan.nextInt();
	}
	
	public String readWord() {
		return scan.next();
	}
	
	public String readText() {
		return scan.nextLine();
	}
}
