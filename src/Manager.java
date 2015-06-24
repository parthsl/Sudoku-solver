
public class Manager {
	Cell[][] cell;
	
	public Manager(){
		cell = new Cell[9][9];
		for (int i = 0; i < 9; i++) {
			for (int k = 0; k < 9; k++) {
				cell[i][k] = new Cell();
			}
		}
		cell[1][1].setVal(3);
	}
	
	
	
	public void level1(){
		
	}
	
	public boolean isFilled(){
		for(int i=0;i<9;i++)
			for(int j=0;j<9;j++)
				if(cell[i][j].getPstack_count()!=0)return false;
		
		return true;
	}
	
	public int[] getPstack(int x,int y){
		return cell[x][y].getPstack();
	}
}
