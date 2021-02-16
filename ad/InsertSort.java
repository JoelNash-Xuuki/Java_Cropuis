package ad;

class InsertSort{
	private int[] a;
	private int key;

	public InsertSort(int[] a){
		this.a = a;
	}	

	public InsertSort(int[] a, int x){
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

		for(int j = 0; j<a.length; j++){
			System.out.print(a[j] + " ");
		} 
	}
	
	public void search(int x){
		for(int n = 0; n < a.length; n++){
			if(x == a[n])	
				System.out.print("x matches with: " + a[n]);
		}
			
	}
}
