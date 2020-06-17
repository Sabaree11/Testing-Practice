
public class Palidr {
public static void main(String[] args) {
		
		String name="madam";
		
		String res="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			char ch=name.charAt(i);
			res =res + ch;
		}
		if (name.equals(res)) {
			System.out.println("Pali");
			
		} else {
			System.out.println("Not pali");

		}
		
		
		
}

}
