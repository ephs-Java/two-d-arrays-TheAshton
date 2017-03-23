import java.util.Random;

public class TwoDArrayBasics {

	public static void main(String[] args) {
		// Create a 3 x 5 array of ints
		int[][] nu = new int[3][5];
		int[] b = {1,2,9,5,7,6,2,72,3,56,99};
		nu = fillRandom(nu,1,100);
	printArray(nu);

		System.out.println(sumRow(nu,1));
		printString(rowSums(nu));
		System.out.println(checker(b));
		System.out.println(target(b,3));
		System.out.println(min2(nu));
		System.out.println(max2(nu));
		//int [][] nums = new int[3][5];
		// Fill the array with random numbers using fillRandom
	//	printArray(fillRandom(nums,1,100));
		
		// test each method you create below.
		//printString(rowSums(fillRandom(nums,1,100)));
	
	//int a = sumRow(fillRandom(nums,1,5), 1);
	//System.out.println(a);
	
	}
	/*
	 * given the lower and upper bounds of the random numbers
	 * fill an array of random numbers 
	 */
	public static int[][] fillRandom(int[][] a, int low, int high){
		for(int row = 0;row < a.length;row++){

		Random random = new Random();
		for(int col = 0;col < a[0].length;col++){
			a[row][col] = random.nextInt(high) + low;
		}
		}return a;
	}
	/*
	 * create a method that prints a 2D array
	 */
	public static void printArray(int[][] nums){
		
		Random random = new Random();
		for(int row = 0;row < nums.length;row++){

			
			for(int col = 0;col < nums[0].length;col++){
				System.out.print(nums[row][col] + " ");
			}
			System.out.println("");
			}
		
	}
	
	/*
	 * return the sum of a row (r) in a 2D array (nums)
	 */
	public static int sumRow(int[][] nums, int row){
		int sum = 0;
		for(int col = 0; col < nums[0].length;col++){
			sum +=nums[row][col]; 
		}
		return sum;
	}

	
	/*
	 * return an array of row sums of a 2D array (nums)
	 */
	public static int[] rowSums(int[][] nums){
		
		int[] sums = new int[nums.length];
		for(int r = 0; r < nums.length;r++){
			sums[r] = sumRow(nums,r);
		}
		return sums;
	}
	public static void printString(int[] n){
		for(int r = 0;r < n.length;r++){
			System.out.println(n[r]);
		}
	}

	
	
	/*
	 * check an 1D array for repeats, return true if all 
	 * elements of the array are unique
	 */
	public static boolean checker(int[] a){
		for(int row = 0;row < a.length;row++){


		for(int col = 0;col < a.length;col++){
			if(a[row] == a[col] && row != col){
				return false;
			}
		}
		}return true;
	}
	

	
	
	/*
	 * given an array
	 * return the index of the target value, 
	 * return -1 if it is not found
	 */
	 
	public static int target(int[] a, int target){
	
		for(int row = 0;row < a.length;row++){

			if(target == a[row]){
				return row;
			}
		
		} return -1;
	}
	
	

	
	
	/*
	 * return the min value in a 2D array
	 */
public static int min2(int[][] nums){
		int min = nums[0][0];
		
		for(int row = 0;row < nums.length;row++){

			
			for(int col = 0;col < nums[0].length;col++){
				min = Math.min(min, nums[row][col]);
			}
			
			
			}
		return min;
		
	}

	
	
	
	/*
	 * return the max value in a 2D array
	 */
	
public static int max2(int[][] nums){
	int max = nums[0][0];
	
	for(int row = 0;row < nums.length;row++){

		
		for(int col = 0;col < nums[0].length;col++){
			max = Math.max(max, nums[row][col]);
		}
		
		
		}
	return max;
	
}
	
	
	
}
