public class Cell {
	private int val;
	private int pstack[];
	private int pstack_count;
	
	public Cell(){
		val =0;
		pstack = new int[10];
		for(int i=0;i<9;i++)pstack[i]=1;
		pstack_count=10;
	}
	
	public void scan_h(int x,int y,Cell[][] cell){
		for(int z=1;z<=9;z++){//gives values from 1-9
			for(int i=0;i<9;i++)//check that value
				if(i==y)continue;
				else if(cell[x][i].val==z)pstack[z-1]=0;
		}
		noofpv();
	}
	
	public void scan_v(int x,int y, Cell cell[][]){
		for(int z=1;z<=9;z++){
			for(int i=0;i<9;i++)
				if(i==x)continue;
				else if(cell[i][y].val==z)pstack[z-1]=0;
		}
		noofpv();
	}

	public void scan_box(int x,int y,Cell cell[][]){
		for(int z=1;z<=9;z++){
			for(int i=(x/3)*3;i<i+3;i++)
				for(int j=(y/3)*3;j<j+3;j++)
					if(i==x&&j==y)continue;
					else if(cell[i][j].val==z)pstack[z-1]=0;
		}
		noofpv();
	}
	
	public void noofpv(){//#ofPossibleValues
		pstack_count=0;
		for(int i=0;i<9;i++)
			if(pstack[i]==1)pstack_count++;
	}
	
	public int getPstack_count(){
		return pstack_count;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public int[] getPstack(){
		return pstack;
	}
}
