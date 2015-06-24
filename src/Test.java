import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Test extends JFrame {

	private static final long serialVersionUID = 1L;
	Manager manager;
	JButton[][] bcell;
	JPanel panel;
	
	public Test(){
		panel = new JPanel();
		bcell= new JButton[9][9];
		manager = new Manager();
		
		for(int i=0;i<9;i++)
			for(int j=0;j<9;j++){
				bcell[i][j]=new JButton();
				panel.add(bcell[i][j]);
			}		
		this.add(panel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(440,440);
		this.setVisible(true);
		
	}
	
	public void setBcell(Cell[][] cell){
		for(int i=0;i<9;i++)
			for(int j=0;j<9;j++){
				bcell[i][j].setLabel(Integer.toString(cell[i][j].getVal()));
				bcell[i][j].addActionListener(new BcellI(i,j,manager));
			}
	}
	
	

	public static void main(String[] args) {
		
		Test test = new Test();
		test.setBcell(test.manager.cell);
		System.out.println(test.manager.isFilled());
	}


}
