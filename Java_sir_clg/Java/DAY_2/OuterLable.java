class OuterLable
{
	public static void main(String args[])
	{
	outer:	
	for (int i = 0; i < 10; i++) {
  	  for (int j = 0; j < 10; j++) {
      	  if (j == 1)
          	  break outer;
        	System.out.println(" value of j = " + j);
   	 }
	}
             }
   }
