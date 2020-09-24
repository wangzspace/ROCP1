package regexpack;

import java.util.Scanner;

public class NumberValidate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String in = sc.next();
		
		System.out.println("Number is SSN: " + isSSN(in));
		System.out.println("Number is ZIP: " + isZIP(in));
		System.out.println("Number is TX DL#: " + isDN(in));
		System.out.println("Number is TX Plate: " + isDL(in));

	}

	public static boolean isSSN(String ssn) {
		if (ssn.matches("[0-9]{3}-[0-9]{3}-[0-9]{4}")) {
			return true;
		}
		else return false;
	}
	
	public static boolean isZIP(String zip) {
		if (zip.matches("[0-9]{5}")) {
			return true;
		}
		else return false;
	}
	
	public static boolean isDN(String dn) {
		if (dn.matches("[0-9]{8}")) {
			return true;
		}
		else return false;
	}
	
	public static boolean isDL(String dl) {
		if (dl.matches("[0-9]{3}-[B-Z&&[^AEIOU]]{4}") || dl.matches("[B-Z&&[^AEIOU]]{3}-[0-9]{4}")) {
			return true;
		}
		else return false;
	}
}
