package Beforeview;

import java.awt.Color;

import javax.swing.JPanel;

import view.ViewFrame;

public class BeforeView {
	
	/** The frame**/
	private ViewFrame frame;
	/**The loading bar**/
	private ViewPanelProgressbar progress;
	/**The menu**/
	private ViewPanelMenu menu;
	/**The texture pack**/
	private String texture;
	/**The stage**/
	private int stage;
	
	/** The constructor BeforeView**/
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
		frame.setVisible(false);
<<<<<<< HEAD
		Audio audio = new Audio();
		audio.start();
=======
		Audio son = new Audio();
		son.start();
>>>>>>> fb6c40449365c228da37d26074d9829c6b49ee95
	}
	/**Option selection **/
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
		
	//getters
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
