package stringspack;

public class LowerLast {

	public static void main(String[] args) {

		String s = "HELLO HI HOW ARE YOU DOING TODAY";
		
		String arr[] = s.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i <arr.length; i++) {
			sb.append(arr[i].substring(0, arr[i].length()-1)).append(Character.toLowerCase(arr[i].charAt(arr[i].length()-1))).append(" ");
		}
		
		System.out.println(sb.toString().trim());

	}

}
