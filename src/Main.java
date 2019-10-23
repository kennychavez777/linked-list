import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Main{
	JFrame mainFrame;
	JButton btnWareHouse, btnReports, btnKardex, btnClose;
	JPanel panel, panelData;
	JLabel lblMenu, lblTitle;
	
	Main(){
		// Menú
		mainFrame = new JFrame();
		panel = new JPanel(); 
        panel.setLayout(new GridBagLayout());
        lblMenu = new JLabel("Menú");
        
        // Constraints
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(lblMenu, gbc);
        
        btnWareHouse = new JButton("Bodega");
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        gbc.gridheight = 2;
        panel.add(btnWareHouse, gbc);

        btnReports = new JButton("Reportes");
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        gbc.gridheight = 2;
        panel.add(btnReports, gbc);
        
        btnKardex = new JButton("Kardex");
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 6;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        gbc.gridheight = 2;
        panel.add(btnKardex, gbc);
        
        btnClose = new JButton("Salir");
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.gridx = 9;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        gbc.gridheight = 2;
        panel.add(btnClose, gbc);
        
        btnClose.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
	            System.exit(0);
	        }
	    });
        
        // Content
        
        // panelData = new JPanel(); 
        // panelData.setLayout(new FlowLayout());
        // lblTitle = new JLabel("Title");
        
        // btnWareHouse.addActionListener(new ActionListener(){
        // 	public void actionPerformed(ActionEvent e){
        		
        // 	}
        // });
        
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
