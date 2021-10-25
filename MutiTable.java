package learn;

public class MutiTable {
	public static void demo1(){
		
		for(int i=2; i<=10;i++) {
  			 System.out.println(" ");
  			 for(int j = 1; j<=10;j++) {
  				 System.out.println(i+"x"+j+"="+(i*j));
  			 }
		}
	}

	public static void main(String[] args) {
		demo1();

	}

}
