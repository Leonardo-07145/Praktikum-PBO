package leonardo07145_View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import leonardo07145_Controller.Leonardo07145_SoalControllerPembeli;

public class Leonardo07145_DataPembeli {
    public static Leonardo07145_SoalControllerPembeli pembeli = new Leonardo07145_SoalControllerPembeli();
    
    JFrame datapembeli = new JFrame();
    JTable tabelpembeli = new JTable();
    JScrollPane scrollpembeli = new JScrollPane(tabelpembeli);
    JLabel judul;
    JButton back;
    
    public Leonardo07145_DataPembeli() {
        datapembeli.setSize(700,400);
        datapembeli.setLayout(null);
        datapembeli.getContentPane().setBackground(Color.LIGHT_GRAY);
        judul = new JLabel("Data Pembeli");
        judul.setBounds(230, 10, 600, 50);
        judul.setFont(new Font("Times New Roman",Font.BOLD,40));
        datapembeli.add(judul);
        back = new JButton("Back");
        back.setBounds(270, 300, 100, 30);
        back.setBackground(Color.RED);
        datapembeli.add(back);
        
//        tabelpembeli = new JTable();
//        tabelpembeli.setModel(daftarpembeli());
//        JScrollPane scrollpembeli = new JScrollPane(tabelpembeli);
//        scrollpembeli.setBounds(60, 80, 570, 200);
//        datapembeli.add(scrollpembeli);

        scrollpembeli.setBounds(60, 80, 570, 200);
        tabelpembeli.setModel(pembeli.daftarpembeli());
        datapembeli.add(scrollpembeli);
        
        datapembeli.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        datapembeli.setVisible(true);
        datapembeli.setLocationRelativeTo(null);
        
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Leonardo07145_GUI gui = new Leonardo07145_GUI();
                datapembeli.dispose();
            }
        });
    }
}