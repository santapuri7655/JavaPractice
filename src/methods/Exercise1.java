package methods;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printMegaBytesAndKiloBytes(1024);

	}
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
	      
	      int megaBytes = kiloBytes/1024;
	      int remainingKiloBytes = kiloBytes % 1024;
	      if(kiloBytes > 0) {
	      System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
	      }
	      else if (kiloBytes < 0) {
	          System.out.println("Invalid Value");
	      }
	  }

}
