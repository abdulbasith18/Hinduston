package Ajio;

public class Reverse {

	public static void main(String[]args) {
		String name = "mohamed Abdul basith";
		String reverse = "";
		
		for(int i=name.length()-1;i>=0;i--) {
			char a = name.charAt(i);
			reverse = reverse + a;
			
		}
		System.out.println(reverse);
		
	}
}
