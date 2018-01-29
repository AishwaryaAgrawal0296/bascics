package neebal;
class Car{
	   public Car()
	   {
		System.out.println("Class Car");
	   }
	   public void vehicleType()
	   {
		System.out.println("Vehicle Type: Car");
	   }
}	
class Maruti extends Car{
	   public Maruti()
	   {
		System.out.println("Class Maruti");
	   }
	   public void brand()
	   {
		System.out.println("Brand: Maruti");
	   }
	   public void speed()
	   {
		System.out.println("Max: 90Kmph");
	   }
	}
	
 class Shinchan extends Maruti{
	 void shi()
	{
		System.out.println("hiii");
	}
}
   class Cow extends Shinchan{
	 void shii()
	{
		System.out.println("hiii9");
	}
}

   
   
class Doremon extends Cow
{
	public void time() 
	{
		System.out.println("time:2.00 Am");
	}
}
public class Multi extends Doremon{

	   public Multi()
	   {
		System.out.println("Maruti Model: 800");
	   }
	   public void speed()
	   {
		System.out.println("Max: 80Kmph");
	   }
	   public static void main(String args[])
	   {
		 Multi obj=new Multi();
		 obj.vehicleType();
		 obj.brand();
		 obj.speed();
		 obj.speed();
		 obj.time();
		 obj.shi();
		 obj.shii();
	   }
	}

