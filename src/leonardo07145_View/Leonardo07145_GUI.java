package leonardo07145_View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static leonardo07145_View.Leonardo07145_DataPembeli.pembeli;

public class Leonardo07145_GUI {
    JFrame TampilanPilihan = new JFrame();
    JLabel judul;
    JButton radiobarang, radiopembeli, radiokasir;
    public Leonardo07145_GUI(){
        TampilanPilihan.setSize(700,300);
        TampilanPilihan.setLayout(null);
        TampilanPilihan.getContentPane().setBackground(Color.LIGHT_GRAY);
        judul = new JLabel("UD. SUEB");
        judul.setBounds(240, 10, 600, 50);
        judul.setFont(new Font("Times New Roman",Font.BOLD,40));
        TampilanPilihan.add(judul);
        radiobarang = new JButton("Data Barang");
        radiobarang.setBounds(85, 130, 110, 30);
        radiobarang.setBackground(Color.WHITE);
        TampilanPilihan.add(radiobarang);
        radiopembeli = new JButton("Data Pembeli");
        radiopembeli.setBounds(280, 130, 110, 30);
        radiopembeli.setBackground(Color.WHITE);
        TampilanPilihan.add(radiopembeli);
        radiokasir = new JButton("Kasir");
        radiokasir.setBounds(480, 130, 100, 30);
        radiokasir.setBackground(Color.WHITE);
        TampilanPilihan.add(radiokasir);
        TampilanPilihan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TampilanPilihan.setVisible(true);
        TampilanPilihan.setLocationRelativeTo(null);
        radiobarang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Leonardo07145_DataBarang databarang = new Leonardo07145_DataBarang();
                TampilanPilihan.dispose();
                }
            }
        );
        radiopembeli.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Leonardo07145_DataPembeli datapembeli = new Leonardo07145_DataPembeli();
                TampilanPilihan.dispose();
            }
        });
        radiokasir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                Leonardo07145_Kasir kasir = new Leonardo07145_Kasir();
                TampilanPilihan.dispose();
            }
        });
    }
}