import javax.swing.*;
import java.awt.*;
public class FirstTry extends JFrame {
	
	
	public FirstTry(){
		super("JFrame");
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	
	
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 400, 400);
		g.setColor(Color.blue);
		g.setFont(new Font("Comic Sans MS",Font.BOLD, 20));
		g.drawString("Doing graphics with a JFrame!", 60, 200);
	}
	
	
	public static void main (String[]args){
		
		new FirstTry();
		
	}


}
