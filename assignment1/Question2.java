package assignment1;

public class Question2 {
	public static void main(String[] args)
	{
		String s1 = "Java";
		String s2 = "Java";
		StringBuilder sb1 = new StringBuilder();
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		String s3 = sb1.toString();
		System.out.println(s3 == s1);
		//System.out.println(sb1.toString() == s1);
		System.out.println(sb1.toString().equals(s1));
	}
}
