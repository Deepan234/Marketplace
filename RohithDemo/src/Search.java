import java.util.Scanner;
import java.util.concurrent.Callable;
public class Search implements Callable<Integer> {

	private int[] parameter;
	private int key;
    public Search(int[] parameter,int key) {
       this.parameter = parameter;
       this.key = key;
    }
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Search Thread is started");
		Integer a=0;
		 for(int i=0;i<parameter.length;i++){    
	            if(parameter[i] == key){    
	                a = i;    
	            }    
	        }    
	        return a; 
	}
		
}
