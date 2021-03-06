package unionfind;

public class QuickFindUF {

	private int[] id;
	 // set id of each object to itself
	 public QuickFindUF(int N)
	 {
	 id = new int[N];
	 for (int i = 0; i < N; i++)
	 id[i] = i;
	 }
	 // if two entries are in the same component then they are connected.check whether p and q
   //  are in the same component
	 public boolean connected(int p, int q)
	 { return id[p] == id[q]; }
	 
	 //change all entries with id[p] to id[q]
	 
	 public void union(int p, int q)
	 {
	 int pid = id[p];
	 int qid = id[q];
	 for (int i = 0; i < id.length; i++)
	 if (id[i] == pid) id[i] = qid;
	 }
	 
	public int[] getId() {
		return id;
	}
	public void setId(int[] id) {
		this.id = id;
	}
	 
	// displays the array 
	public void display()
	{ int [] result = this.getId();

	for(int i = 0; i < result.length ; i++){
		System.out.print(result[i] + " ");
	}

	System.out.println();

	}
}
