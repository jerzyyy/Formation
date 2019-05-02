package tableau;

public class TestArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		for(int i=0; i<array.length;i++) {
		int result=array[i];
		System.out.print(result+" ");
		}
		System.out.println();
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		for(int i=array1.length-1; i>=0;i--) {
		int result=array[i];
		System.out.print(result+" ");
		
		}
		System.out.println();
		int[] array2 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		for (int i=0; i<array.length;i++)
		if(array[i] >3) {
			System.out.print(array[i]+" ");
			
		}
		System.out.println();
		int[] array3 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		for(int i=0; i<array.length; i++) {
			if(array[i]%2==0 & array[i]>0) {
				System.out.print(array[i]+" ");
			}
		}
		System.out.println();
		int[] array4 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int max=-10;
		for(int i=0; i<array.length; i++) {
			
			if(max<array[i]) {
				max = array[i];
			}	
		}
		System.out.print(max+" ");
		System.out.println();
		int[] array5 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int min=10;
		for(int i=0; i<array5.length;i++) {
			if(min>array[i]) {
				min=array[i];
			}
		}
		System.out.print(min+" ");
		
	}
	
}
