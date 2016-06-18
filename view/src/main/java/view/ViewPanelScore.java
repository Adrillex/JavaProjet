package view;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewPanelScore extends JPanel{
	
	private JLabel score;
	private JLabel monsterAlive;
	private JLabel bonusRemaining;
	private JLabel distanceGate;
	
	public ViewPanelScore(){	
	this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
	this.setBackground(Color.black);
	
	score = new JLabel("Score : None");
	monsterAlive = new JLabel("Monster alive : 4");
	bonusRemaining = new JLabel("Bonus remaining : 2");
	distanceGate = new JLabel("Distance of the Gate : Far far away ");
	
	score.setForeground(Color.orange);
	monsterAlive.setForeground(Color.orange);
	bonusRemaining.setForeground(Color.orange);
	distanceGate.setForeground(Color.orange);
	
	this.add(score);
	this.add(monsterAlive);
	this.add(bonusRemaining);
	this.add(distanceGate);
	}
	
	public void updateScore(){
	}
	
}
