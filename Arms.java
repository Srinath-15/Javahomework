class Arms
{
	
	public static void main(String[]aargs)
	{
		
		
		int a = 1634; 

        int b = a % 10;          
        int c = a / 10;         
        int d = c % 10;          
        int e = c / 10;          
        int h = e % 10;         
        int i = e / 10;          


        int f = (b*b*b*b) + (d*d*d*d) + (h*h*h*h) + (i*i*i*i);

        boolean g = (a == f);

        System.out.println("the original number: " + a + "    the given number is armstrong " + g);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}