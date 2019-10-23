import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

public class Main{
	JFrame mainFrame;
	JButton btnWareHouse, btnReports, btnKardex, btnClose;
	JPanel panel, panelData;
	JLabel lblMenu, lblTitle;
	
	Main(){
		// Menú
		mainFrame = new JFrame();
		panel = new JPanel(); 
        panel.setLayout(new FlowLayout());  
        lblMenu = new JLabel("Menú");
        btnWareHouse = new JButton("Bodega");
        btnReports = new JButton("Reportes");
        btnKardex = new JButton("Kardex");
        btnClose = new JButton("Salir");
        
        btnClose.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
	            System.exit(0);
	        }
	    });
        
        panel.add(lblMenu);  
        panel.add(btnWareHouse);
        panel.add(btnReports);
        panel.add(btnKardex);
        panel.add(btnClose);
        
        // Content
        
        panelData = new JPanel(); 
        panelData.setLayout(new FlowLayout());
        lblTitle = new JLabel("Title");
        
        btnWareHouse.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		
        	}
        });
        
        mainFrame.add(panel);
        //mainFrame.add(panelData);
        mainFrame.setSize(800,800);  
        mainFrame.setLocationRelativeTo(null);  
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        mainFrame.setVisible(true);
        
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
