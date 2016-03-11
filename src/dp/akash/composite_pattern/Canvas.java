package dp.akash.composite_pattern;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Canvas extends JFrame{
	private static Canvas instance=new Canvas();
	private Graphics graphics;

	private Canvas(){};

	public static Canvas getInstance(){
		return instance;
	}

	public void drawLine(int x1,int y1,int x2,int y2) {
		graphics.drawLine(x1,y1,x2,y2);
	}

	public void paint(Graphics g){
		super.paint(g);
		this.graphics=g;
		/*adding three houses*/
		List<House> houses=new ArrayList<House>();
		houses.add(new House(300, 544, 375, 500, 50));
		houses.add(new House(400, 544, 475, 500, 50));
		houses.add(new House(140, 150, 200, 120, 30));
		/*adding eleven trees*/
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
		/*adding a river*/
		River river=new River(0, 300, 300, 189, 590, 143);
		/*at last creating a village with three houses,eleven trees and one river*/
		Village village=new Village(houses, trees, river);
		/*drawing the village*/
		village.draw();
	}
}
