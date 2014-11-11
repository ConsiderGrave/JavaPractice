
public class Sparks {
	
  public static void main(String[]args) throws InterruptedException{
		
	int speed = 1;
		
		
	 do {
		
		 Thread.sleep(1000);
		 System.out.println("You are driving " + speed + " mph.");
		
		
		speed++;
		
		
		 if (speed <= 40){
			
			System.out.println("You are going under the minimum speed limit.");
		
		 }
	
		
		 if (speed < 60){
			
			System.out.println("You are going under the maximum speed limit.");
			
		 }
		
		 if (speed > 60){
			
			System.out.println("You are going over the speed limit.");
		
		 }
		
		 if (speed == 60){
			
			System.out.println("You are staying within the speed limit");
		
		 }
		 
		
	
	 } while(speed <= 100);
   

  }

}
