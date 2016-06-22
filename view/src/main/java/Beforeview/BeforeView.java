package Beforeview;

import java.awt.Color;

import javax.swing.JPanel;

import view.ViewFrame;

public class BeforeView {
	
	private ViewFrame frame;
	private ViewPanelProgressbar progress;
	private ViewPanelMenu menu;
	private String texture;
	private int stage;
	
	
	public BeforeView(){
		frame = new ViewFrame();
		JPanel pan = new JPanel();		
		
		menu = new ViewPanelMenu();
		pan.add(menu);
		frame.setContentPane(pan);
		frame.validate();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setOption();
;
		progress = new ViewPanelProgressbar();
		pan.removeAll();
		pan.setBackground(Color.black);
		pan.add(progress);
		frame.setContentPane(pan);
		progress.load();
	}
	
	public void setOption(){
		if(menu.texture1.isSelected())
			texture = "lorann";
		else if(menu.texture2.isSelected())
			texture = "pokemon";
			
			if(menu.stage1.isSelected())
				stage = 1;
			else if(menu.stage2.isSelected())
				stage = 2;
			else if(menu.stage3.isSelected())
				stage = 3;
			else if(menu.stage4.isSelected())
				stage = 4;
			else if(menu.stage5.isSelected())
				stage = 5;
		}
		
		public String getTexture(){
			return texture;
		}
		
		public int getStage(){
			return stage;
		}

		public ViewFrame getFrame() {
			return frame;
		}
}
