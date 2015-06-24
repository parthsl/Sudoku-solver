import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


public class BcellI extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	int x,y;
	Manager manager;
	
	public BcellI(int x, int y,Manager manager){
		this.x=x;
		this.y=y;
		this.manager = manager;
	}
	
	
	public void fun(int x, int y, Manager manager){
		int [] temp = new int[10];
		temp = manager.getPstack(x,y);
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setSize(200,200);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Label label;
		for (int i = 0; i < 10; i++) {
			label = new Label(Integer.toString(temp[1]));
			f.add(label);
		}		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		fun(this.x,this.y,this.manager);
	}
}
