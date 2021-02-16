package ad;

class Algorithms{

	public static void main(String[] arg){
		InsertSort is = new InsertSort(
			new int[] {5,2,4,6,1,3}
		);
		is.search(6);
		System.out.println("\n");

		Counting counting = new Counting(4);
		counting.counting_1();
		System.out.println("\n");
		counting.counting_2();
		System.out.println("\n");
		counting.counting_3();
	} 
}
