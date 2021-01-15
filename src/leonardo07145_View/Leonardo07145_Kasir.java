package leonardo07145_View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Locale;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import leonardo07145_Controller.*;

public class Leonardo07145_Kasir {
    private static Leonardo07145_SoalControllerBarang barang = new Leonardo07145_SoalControllerBarang();
    private static Leonardo07145_SoalControllerPembeli pembeli = new Leonardo07145_SoalControllerPembeli();
    JFrame kasir = new JFrame();
    JTable tabelbarang = new JTable();
    JScrollPane scrollbarang = new JScrollPane(tabelbarang);
    JLabel judul,nmpembeli,notelp,alamat,jmlhbarang,namabarang;
    JTextField textnama,textnotelp,textalamat,textjmlhbarang,textnamabarang,texthitung;
    JButton back,tambah,hitung;
    
    public Leonardo07145_Kasir() {
        kasir.setSize(700,600);
        kasir.setLayout(null);
        kasir.getContentPane().setBackground(Color.LIGHT_GRAY);
        judul = new JLabel("Kasir");
        judul.setBounds(280, 10, 600, 50);
        judul.setFont(new Font("Times New Roman",Font.BOLD,40));
        kasir.add(judul);
        
        nmpembeli = new JLabel("Nama Pembeli");
        nmpembeli.setBounds(50, 60, 150, 50);
        nmpembeli.setFont(new Font("Times New Roman",Font.BOLD,20));
        kasir.add(nmpembeli);
        textnama = new JTextField();
        textnama.setBounds(190, 75, 150, 25);
        kasir.add(textnama);
        notelp = new JLabel("No Telepon");
        notelp.setBounds(50, 100, 150, 50);
        notelp.setFont(new Font("Times New Roman",Font.BOLD,20));
        kasir.add(notelp);
        textnotelp = new JTextField();
        textnotelp.setBounds(190, 115, 150, 25);
        kasir.add(textnotelp);
        alamat = new JLabel("Alamat");
        alamat.setBounds(50, 140, 150, 50);
        alamat.setFont(new Font("Times New Roman",Font.BOLD,20));
        kasir.add(alamat);
        textalamat = new JTextField();
        textalamat.setBounds(190, 155, 150, 25);
        kasir.add(textalamat);
        namabarang = new JLabel("Barang yang Dibeli");
        namabarang.setBounds(50, 195, 200, 25);
        namabarang.setFont(new Font("Times New Roman",Font.BOLD,20));
        kasir.add(namabarang);
        textnamabarang = new JTextField();
        textnamabarang.setBounds(220, 195, 150, 25);
        kasir.add(textnamabarang);
        jmlhbarang = new JLabel("Jumlah");
        jmlhbarang.setBounds(400, 195, 150, 25);
        jmlhbarang.setFont(new Font("Times New Roman",Font.BOLD,20));
        kasir.add(jmlhbarang);
        textjmlhbarang = new JTextField();
        textjmlhbarang.setBounds(475, 195, 75, 25);
        kasir.add(textjmlhbarang);
        
        hitung = new JButton("Hitung");
        hitung.setBounds(50, 250, 100, 30);
        hitung.setBackground(Color.WHITE);
        kasir.add(hitung);
        texthitung = new JTextField();
        texthitung.setBounds(190, 250, 150, 25);
        kasir.add(texthitung);
        tambah = new JButton("Tambah");
        tambah.setBounds(400, 70, 100, 30);
        tambah.setBackground(Color.WHITE);
        kasir.add(tambah);
        back = new JButton("Back");
        back.setBounds(270, 510, 100, 30);
        back.setBackground(Color.RED);
        kasir.add(back);
        
        scrollbarang.setBounds(60, 300, 570, 200);
        tabelbarang.setModel(barang.daftarbarang());
        kasir.add(scrollbarang);
        
        kasir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        kasir.setVisible(true);
        kasir.setLocationRelativeTo(null);
        tambah.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                try{
                    String nama = textnama.getText();
                    String notelp = textnotelp.getText();
                    String alamat = textalamat.getText();
                    Leonardo07145_AllObjctrl.Pembeli.insert(nama, notelp, alamat);
                    JOptionPane.showMessageDialog(null, "Penambahan Pembeli Sukses", "information", JOptionPane.INFORMATION_MESSAGE);
                    kosong();                    
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null, "Format Penulisan Salah", "Penambahan Barang Gagal", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Leonardo07145_GUI gui = new Leonardo07145_GUI();
                kasir.dispose();
            }
        });
        hitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                for(int i = 1;i<Leonardo07145_AllObjctrl.Barang.getArrbarang().size();i++){
                    if((Leonardo07145_AllObjctrl.Barang.getArrbarang().get(i).getNama()).equals(textnamabarang.getText())){
                        int harga = Leonardo07145_AllObjctrl.Barang.getArrbarang().get(i).getHarga()*Integer.parseInt(textjmlhbarang.getText());
                        texthitung.setText(String.valueOf(harga));
                    }
                }
            }
        });
        tabelbarang.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                int i = tabelbarang.getSelectedRow();
                textnamabarang.setText(Leonardo07145_AllObjctrl.Barang.daftarbarang().getValueAt(i, 0).toString());
            }
        });
    }
    void kosong(){
        textnama.setText(null);
        textnotelp.setText(null);
        textalamat.setText(null);
    }
}