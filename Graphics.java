package neebal;

 class Graphics {
	
	   static double[] sines, cosines;
	   static
	   {
	      sines = new double[360];
	      cosines = new double[360];
	      for (int i = 0; i < sines.length; i++)
	      {
	         sines[i] = Math.sin(Math.toRadians(i));
	         cosines[i] = Math.cos(Math.toRadians(i));
	        // public static void  main (String[] args) {
	        	 
	         }
	      }
	   }
	//}



 