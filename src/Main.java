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
        gbc.fill = GridBagConstraints.HORIZONTAL;
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
        
        lblTitle = new JLabel("Title");
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 3;
        gbc.gridheight = 2;
        lblTitle.setVisible(false);
        panel.add(lblTitle, gbc);
        
        btnWareHouse.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
                lblTitle.setText("Bodega");
                lblTitle.setVisible(true);
        	}
        });

        btnKardex.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
                lblTitle.setText("Kardex");
                lblTitle.setVisible(true);
        	}
        });

        btnReports.addActionListener((new ActionListener(){
            public void actionPerformed(ActionEvent e){
                lblTitle.setText("Reportes");
                lblTitle.setVisible(true);
            }
        }));
        
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
