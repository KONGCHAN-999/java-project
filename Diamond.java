package learn;

public class Diamond {
	public static void Diamond(){
		int a =6;
		for (int b = 1; b<=a; b++) {
			for(int c = b; c<a; c++) {
				System.out.print(" ");
			}
			
			for(int d = 1; d<b*2; d++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int b = a-1; b>=1; b--) {
			for(int c = a; c>b; c--) {
				System.out.print(" ");
			}
			for(int d = 1; d<b*2; d++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

	public static void main(String[] args) {
		Diamond();

	}

}
