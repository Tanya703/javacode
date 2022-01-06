import java.util.Arrays;
public class Assignment6Driver{
	public static void main(String[] args) {
		int arr[][]={{1,2,3,4,5},{1,2,3,4,5}};
		int flag=2;
		
		System.out.println("Original Array via approach2: "+Arrays.deepToString(ArrShift2(arr,0)));
		System.out.println("Shifted Array via approach2: "+Arrays.deepToString(ArrShift2(arr,flag))+'\n');

		System.out.println("Original Array via approach1: "+Arrays.deepToString(ArrShift1(arr,0)));
		System.out.println("Shifted Array via approach1: "+Arrays.deepToString(ArrShift1(arr,flag)));

  }
  //approach 1
	public static int[][] ArrShift1 (int[][] A, int flag)
    {
		int[][] shiftedArr=new int[A.length][A[0].length];
		
		
		if (flag>0){
			
			for(int i=0; i<A.length;i++){
				for (int j=0; j<flag;j++){
					shiftRightbyOne(A[i]);
				}
				shiftedArr[i]=A[i];
			}
			return shiftedArr;
		}
		else if(flag<0){
			flag=Math.abs(flag);
			for(int i=0; i<A.length;i++){
				for (int j=0; j<flag;j++){
					shiftLeftbyOne(A[i]);
				}
				shiftedArr[i]=A[i];
		}
			return shiftedArr;
	}
		else{
			return A;
		}
		
	}
	///shift right by one
	public static int[] shiftRightbyOne(int[] B){
		
		int i, temp;
		temp=B[B.length-1];
		for(i=B.length-1;i>0; i--){
		B[i]=B[i-1];
		}
		B[i]=temp;
		return B;
	}
	
	//shift left by one
	
	public static int[] shiftLeftbyOne(int[] B){
		
		int i, temp;
		temp=B[0];
		for(i=0;i<B.length-1; i++){
		B[i]=B[i+1];
		
		}
		B[i]=temp;
		return B;
	}
	
	//approach 2
	public static int[][] ArrShift2 (int[][] A, int flag)
    {
		int[][] B = new int[A.length][A[0].length];
		if (flag>0){
			int n=flag;
			for (int i = 0; i < A.length; i++){
				for (int j = 0; j < A[0].length; j++){
					B[i][(j + n) % A[0].length] = A[i][j];
				}
			 }
			 return B;

		}
		
		else if (flag<0) {
			int n=Math.abs(flag);
			for (int i = 0; i < A.length; i++){
				for (int j = 0; j < A[0].length; j++){
					B[i][j] = A[i][(j + n) % A[0].length];
				}
			 }
				return B;		
				}
		else{
			return A;
		}
			}				
		}
	
