import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test {

	
	
	
	public static  int solutionint(int[] A) {
		  ArrayList<Integer> positiveArray = new ArrayList<Integer>();
		    int i = 1;
		    for (int b= 0; b<A.length; b++){
		        if (A[b]>0){
		            positiveArray.add(A[b]);
		        }
		    }
		    if(positiveArray.toArray().length == 0 )
		    {
		        return 1;
		    }

		    Collections.sort(positiveArray);
		    for (int p=0; p<positiveArray.toArray().length;p++){
		        
		        if (positiveArray.get(0) != 1 || positiveArray.toArray().length == 0){
		            return 1;
		        }
		            
		        if (positiveArray.get(p) != i)
		        {
		            
		            if(positiveArray.contains(i) == false) {
		            	return i;
		            }
		            i = positiveArray.get(p);
		        }
		        
		        if(positiveArray.get(p) == i)
		        {
		            i+=1;
		        }

		    }
		    return i;
	}
	
	
	public static int solution(int a) {
		
		
		
		int initialString = 0;
		int secondString;
		boolean foundOne = false;
		ArrayList<Integer> binGap = new ArrayList<Integer>();
		String b = Integer.toBinaryString(a);
		for (int i = 0; i < b.length(); i++){
		    char c = b.charAt(i);        
		    if(c == '1' && foundOne == false) {
		    	initialString = i;
		    	foundOne = true;
		    }
		    else if(c == '1' && foundOne == true) {
		    	secondString = i;
		    	binGap.add((secondString - initialString)-1);
		    	initialString = i;
		    	secondString = 0;
		    }
		}
		
		Collections.sort(binGap);
		Collections.reverse(binGap);
		System.out.println(b);
		if(binGap.isEmpty() == false) {
		System.out.println(binGap.toArray()[0]);
		return (int) binGap.toArray()[0];
		}
		else {
			return 0;	
		}
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//solution(1041);
		int a[] = {1,2,3,4,6};
		System.out.println(solutionint(a));
		
	}

	
	
	
}
