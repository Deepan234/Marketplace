import java.util.Scanner;
import java.util.concurrent.Callable;


public class bubbleSort implements Callable<int[]>
{
	 private int[] parameter;
     public bubbleSort(int[] parameter) {
        this.parameter = parameter;
     }

	@Override
	public int[] call() throws Exception {
		// TODO Auto-generated method stub
		 System.out.println("Sort Thread is started");
		 int n = parameter.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(parameter[j-1] > parameter[j]){   
	                                 temp = parameter[j-1];  
	                                 parameter[j-1] = parameter[j];  
	                                 parameter[j] = temp;  
	                         }  
	                          
	                 }  
	         }
	         System.out.println("Thread sort is executed"); 
		return parameter;
	}
}