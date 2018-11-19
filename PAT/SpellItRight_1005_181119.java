import java.util.Scanner;

class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] cs = str.toCharArray();
		String[] spell = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		int res = 0;
		
		for (int i=0; i<cs.length; i++) {
			res += Integer.valueOf(cs[i])-48;
		}
		
		char[] cres = String.valueOf(res).toCharArray();
		
		System.out.print(spell[cres[0]-48]);
		for (int i=1; i<cres.length; i++)
			System.out.print(" "+(spell[cres[i]-48]));
		
	}

}