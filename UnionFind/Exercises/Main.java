package unionfind;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeightedUnionFind A = new WeightedUnionFind(10);
		
		//9-7 2-5 4-8 5-1 3-5 6-5 9-4 7-5 7-0 for programming exercise 2
		A.union(9,7);
		A.union(2, 5);
		A.union(4, 8);
		A.union(5, 1);
		A.union(3, 5);
		A.union(6, 5);
		A.union(9, 4);
		A.union(7, 5);
		A.union(7, 0);
		A.display();

	}

}
