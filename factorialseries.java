package javaprograms;

public class factorialseries {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	              int i=1,j=1;
	              int n=6;
	              double f=0f;
	              int fact=1;
	              
	              for(i=n;i>0;i--) {
	            	// System.out.println(i);
	            	  fact=1;
	            	  for(j=1;j<=i;j++)
	            	  {
	            	  fact=fact*j;
	            	  }
	            	  System.out.println(fact);
	            	  f=f+1f/fact;
	            	  
	              }
	              System.out.println(f);
		}

	


}
