package ad;
public class Algorithms{

	private int n;
	private int sum;
	private int[] a = new int[10];
	private int key;

	//Contruct input size	
	public Algorithms(int in){
		this.n = in;
	}

	//Contructor for insertSort 
	public Algorithms(int[] a){
		this.a = a;
	}	

	//Contructor for insertSort
	public Algorithms(int[] a, int x){
		this.a = a;
	}

	public void insertSort(){
		int i;
		for(int j = 1; j<a.length; j++){
			key = a[j];
			//insert a[j] into the sorted sequence a[1...j-1].
			i = j - 1;
			while( i >= 0 && a[i] > key){
				a[i+1] = a[i];
				i = i - 1;
			}
		a[i+1] = key;
		}
	}

	public void getSortLength(){
		for(int j = 0; j<a.length; j++){
			System.out.print(a[j] + " ");
		}
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

	public void search(int x){
		for(int n = 0; n < a.length; n++){
			if(x == a[n])	
				System.out.print("x matches with: " + a[n]);
		}
	}
	public void max(){
		int max = 0;
		for(n = 0; n < a.length; n++){
			if(a[n] > max)
				max = a[n];
		}
		System.out.println(max);
	}
	//change to min
	public void max(int[] a){
		int max = 0;
		for(n = 0; n < a.length; n++){
			if(a[n] > max)
				max = a[n];
				System.out.println("Max value: " + max);
		}
	}
}















