public class Sal{
	public static void main(String[] args){
	int[] arr={100,300,200,345,643};
	
	int max=0;
	int min=0;
	
	for(int i=0;i<arr.length;i++){
		if(max<arr[i]){
			max=arr[i];
		}
		if(min>arr[i]){
			min=arr[i];
		}
		
	}
	System.out.println("Max" + "" + max);
	System.out.println("Min" + "" +min);
}
}