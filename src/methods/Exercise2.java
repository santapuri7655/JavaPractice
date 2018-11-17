package methods;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean result = bark(true, 9);
		
		System.out.println(result);
		
	}
	
public static boolean bark(boolean barking, int hourOfTheDay) {
        
        if (barking == true && hourOfTheDay < 8) {
           System.out.println("dog is barking, we have to wake up");
                return true;
         }
        else if (barking == true && hourOfTheDay > 22){
        	System.out.println("dog is barking, we have to wake up");
            	return true;
         }
        else if (barking == false )
            
        }
		return barking;
		
	}

}
