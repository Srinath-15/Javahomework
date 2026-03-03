
 class Pali
{




 public static void main(String[]args)
  
  
  
  
  
  {
  
   int a = 1221;

int b = a % 10;         
int c = a / 10;          
int d = c % 10;        
int e = c / 10;          
int h = e % 10;        
int i = e / 10;          
int reversed = (b * 1000) + (d * 100) + (h * 10) + i;
boolean g = (a == reversed);
System.out.println("the original number: " + a + "    is palindrome: " + g);

  
    
  
  
  
  
  }






















}