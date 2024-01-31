package PracticePrograms;

public class OnlyCharacters {

	public static void main(String[] args) {
		String str="ABCD@12$";
		String a=str.replaceAll("[a-zA-Z0-9]", "");
		System.out.println(a);

	}

}
