import java.util.Date;
import java.util.Random;
public class maxsubsum {

	private int maxSubSum1(int array[]){
		
		int maxSum=0;
		for(int i=0;i<array.length;i++){
			for(int j=i;j<array.length;j++){
				int thisSum=0;
				for(int k=i;k<j;k++){
					thisSum+=array[k];
					if(thisSum>maxSum) maxSum=thisSum;
				}
			}
		}
		return maxSum;
	}
	private int maxSubSum2(int array[]){
		int maxSum=0;
		for(int i=0;i<array.length;i++){
			int thisSum=0;
			for(int j=i;j<array.length;j++){
				thisSum+=array[j];
				if(thisSum>maxSum)maxSum=thisSum;
			}
		}
		return maxSum;
	}
	
	public static void main(String[] args) {
		Random r=new Random();
		int dizi_boyutlari[]={10,100,1000};
		for(int boyut=0;boyut<3;boyut++){
			int[] array=new int[dizi_boyutlari[boyut]];
			for(int i=0;i<array.length;i++){
				array[i]=r.nextInt(array.length)+1;
			}
			int maxSum=new maxsubsum().maxSubSum1(array);
			System.out.println(dizi_boyutlari[boyut]+" un maxSum1 is:"+maxSum);
			
			int maxSum1=new maxsubsum().maxSubSum2(array);
			System.out.println(dizi_boyutlari[boyut]+" un maxSum2 is:"+maxSum1);
		}
	}	
}