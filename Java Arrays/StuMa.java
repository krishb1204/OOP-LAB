public class StuMa{
	public static void main(String[] args){
		int[] arr={80,50,60,100};
		
		int total=0;
		int max=0;
		
		for(int i=0; i<arr.length;i++){
			
			total=total+arr[i];
			
			if(max<arr[i]){
				max=arr[i];
			}
		}
		double average=(total/arr.length);
		
		System.out.println("Total" + total);
		System.out.println("Average" + average);
		System.out.println("Max" + max);
	}
}
	