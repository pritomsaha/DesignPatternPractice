package dp.akash.composite_pattern;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Canvas extends JFrame{
	public static Graphics graphics;
	public void paint(Graphics g){
		super.paint(g);
		graphics=g;
		List<House> houses=new ArrayList<House>();
		houses.add(new House(300, 544, 375, 500, 50));
		houses.add(new House(400, 544, 475, 500, 50));
		houses.add(new House(140, 150, 200, 120, 30));
		List<Tree> trees=new ArrayList<Tree>();
		trees.add(new Tree(90, 150, 70));
		trees.add(new Tree(110, 150, 80));
		trees.add(new Tree(130, 150, 50));
		trees.add(new Tree(390, 544, 100));
		trees.add(new Tree(385, 544, 80));
		trees.add(new Tree(480, 544, 100));
		trees.add(new Tree(495, 544, 80));
		trees.add(new Tree(510, 544, 100));
		trees.add(new Tree(280, 544, 80));
		trees.add(new Tree(270, 544, 95));
		trees.add(new Tree(260, 544, 75));
		River river=new River(0, 300, 300, 189, 590, 143);
		Village village=new Village(houses, trees, river);
		village.draw();
	}
	
	public static void main(String[] args){
		Canvas canvas=new Canvas();
		canvas.setBounds(20, 20 , 600 , 600);
		canvas.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println(arg0.getX() + " " + arg0.getY());
				
			}
		});
		canvas.setVisible(true);
	}
}
