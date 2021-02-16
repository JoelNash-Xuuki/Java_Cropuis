package ad;
public class Counting{

	private int n;
	private int sum;
	
	public Counting(int in){
		this.n = in;
	}
	
	public void counting_1(){
		sum=0;
		for(int r=0; r<n; r++){
			for(int c=0; c<n; c++){
				System.out.print("i ");
				sum = sum+1;
			}
			System.out.println();
		}
		System.out.println(sum);
	}

	public void counting_2(){
		sum=0;
		for(int r=0; r<n; r++){
			for(int c=0; c<n; c++){
				System.out.print("i ");
			}
			sum = sum+n;
			System.out.println();
		}
		System.out.println(sum);
	}

	public void counting_3(){
		sum=0;
		for(int r=0; r<n; r++){
			for(int c=0; c<n; c++){
				System.out.print("i ");
			}
			System.out.println();
		}
		System.out.println(n*n);
	}
}
