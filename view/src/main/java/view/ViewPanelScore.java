package view;

import java.awt.Color;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import contract.IModel;

public class ViewPanelScore extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private int score;
	private IModel model;
	private JLabel affScore;
	private JLabel monsterAlive;
	private JLabel bonusRemaining;
	
	public ViewPanelScore(IModel model){	
	this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
	this.setBackground(Color.black);
	this.model = model;
	affScore = new JLabel("Score : " + score);
	monsterAlive = new JLabel("Monster alive : 4");
	bonusRemaining = new JLabel("Bonus remaining : 2");
	
	affScore.setForeground(Color.orange);
	monsterAlive.setForeground(Color.orange);
	bonusRemaining.setForeground(Color.orange);
	
	}
	
	public void updateScore(){
		this.removeAll();
		affScore.setText("Score : " + this.model.getScore());
		monsterAlive.setText("Monster(s) alive: " + this.model.getMonsterNumber());
		bonusRemaining.setText("Bonus remaining : " + this.model.getBonusNumber());
		this.add(affScore);
		this.add(Box.createGlue());
		this.add(monsterAlive);
		this.add(Box.createGlue());
		this.add(bonusRemaining);
	}
	
}
