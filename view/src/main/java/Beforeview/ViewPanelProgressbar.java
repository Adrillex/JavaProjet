package Beforeview;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.Border;

public class ViewPanelProgressbar extends JPanel{
	
	/**
	 * Default Serial VersionUID
	 */
	private static final long serialVersionUID = 1L;
	/**The loading bar**/
	private JProgressBar progress;
	
	/**The constructor **/
	public ViewPanelProgressbar(){
		progress = new JProgressBar();
		progress.setPreferredSize(new Dimension(650,200));
		progress.setMinimum(1);
		progress.setMaximum(100);
		
		progress.setStringPainted(true);
        progress.setString("LOADING, PLEASE WAIT...");
        
        progress.setBackground(Color.blue);
        progress.setForeground(Color.orange);
        Border border = BorderFactory.createTitledBorder("Loading...");
        progress.setBorder(border);
        this.setBackground(Color.red);
        this.add(progress);
        }
	
	/**The loadin method. Loads elements from the database**/
	public void load(){
		for (int i = 1; i < 101; i++) {
	        progress.setValue(i);
	        System.out.println(i);
	        try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
