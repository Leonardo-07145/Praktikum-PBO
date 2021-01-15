package leonardo07145_View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import leonardo07145_Controller.Leonardo07145_SoalControllerBarang;

public class Leonardo07145_DataBarang {
    public static Leonardo07145_SoalControllerBarang barang = new Leonardo07145_SoalControllerBarang();
    JFrame databarang = new JFrame();
    JTable tabelbarang = new JTable();
    JScrollPane scrollbarang = new JScrollPane(tabelbarang);
    JButton tambah,hapus,update,back;
    JLabel nama,kode,harga,judul;
    JTextField textnama,textkode,textharga;
    public Leonardo07145_DataBarang(){
        databarang.setSize(650,500);
        databarang.setLayout(null);
        databarang.getContentPane().setBackground(Color.LIGHT_GRAY);
        judul = new JLabel("Data Barang");
        judul.setBounds(210, 10, 600, 50);
        judul.setFont(new Font("Times New Roman",Font.BOLD,40));
        databarang.add(judul);
        nama = new JLabel("Nama Barang");
        nama.setBounds(50, 60, 150, 50);
        nama.setFont(new Font("Times New Roman",Font.BOLD,20));
        databarang.add(nama);
        textnama = new JTextField();
        textnama.setBounds(190, 75, 150, 25);
        databarang.add(textnama);
        kode = new JLabel("Kode Barang");
        kode.setBounds(50, 100, 150, 50);
        kode.setFont(new Font("Times New Roman",Font.BOLD,20));
        databarang.add(kode);
        textkode = new JTextField();
        textkode.setBounds(190, 115, 150, 25);
        databarang.add(textkode);
        harga = new JLabel("Harga Barang");
        harga.setBounds(50, 140, 150, 50);
        harga.setFont(new Font("Times New Roman",Font.BOLD,20));
        databarang.add(harga);
        textharga = new JTextField();
        textharga.setBounds(190, 155, 150, 25);
        databarang.add(textharga);
        
        tambah = new JButton("Tambah");
        tambah.setBounds(400, 70, 100, 30);
        tambah.setBackground(Color.WHITE);
        databarang.add(tambah);
        hapus = new JButton("Hapus");
        hapus.setBounds(400, 110, 100, 30);
        hapus.setBackground(Color.WHITE);
        databarang.add(hapus);
        update = new JButton("Update");
        update.setBounds(400, 150, 100, 30);
        update.setBackground(Color.WHITE);
        databarang.add(update);
        back = new JButton("Back");
        back.setBounds(250, 410, 100, 30);
        back.setBackground(Color.RED);
        databarang.add(back);
        
        scrollbarang.setBounds(30, 200, 570, 200);
        tabelbarang.setModel(Leonardo07145_AllObjctrl.Barang.daftarbarang());
        databarang.add(scrollbarang);
        
        databarang.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        databarang.setVisible(true);
        databarang.setLocationRelativeTo(null);
        
        tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    String nama = textnama.getText();
                    int kode = Integer.parseInt(textkode.getText());
                    int harga = Integer.parseInt(textharga.getText());
                    Leonardo07145_AllObjctrl.Barang.insert(nama, kode, harga);
                    JOptionPane.showMessageDialog(null, "Penambahan Barang Sukses", "information", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null, "Format Penulisan Salah", "information", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }
                tabelbarang.setModel(Leonardo07145_AllObjctrl.Barang.daftarbarang());
            }
        });
        hapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                for (int i = 0; i < Leonardo07145_AllObjctrl.Barang.getArrbarang().size(); i++) {
                    if (Leonardo07145_AllObjctrl.Barang.getArrbarang().get(i).getNama().equals(textnama.getText())) {
                        Leonardo07145_AllObjctrl.Barang.getArrbarang().remove(i);
                    }
                }
                tabelbarang.setModel(Leonardo07145_AllObjctrl.Barang.daftarbarang());
                JOptionPane.showMessageDialog(null, "Data Telah Dihapus!");
                kosong();
            }
        });
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                for (int i = 0; i < Leonardo07145_AllObjctrl.Barang.getArrbarang().size(); i++) {
                    if (Leonardo07145_AllObjctrl.Barang.getArrbarang().get(i).getNama().equals(textnama.getText())) {
                        Leonardo07145_AllObjctrl.Barang.getArrbarang().get(i).setNama(textnama.getText());
                        Leonardo07145_AllObjctrl.Barang.getArrbarang().get(i).setKode(Integer.parseInt(textkode.getText()));
                        Leonardo07145_AllObjctrl.Barang.getArrbarang().get(i).setHarga(Integer.parseInt(textharga.getText()));
                        
                    }
                }
                tabelbarang.setModel(Leonardo07145_AllObjctrl.Barang.daftarbarang());
                kosong();
            }
        });
        tabelbarang.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                int i = tabelbarang.getSelectedRow();
                textnama.setText(Leonardo07145_AllObjctrl.Barang.daftarbarang().getValueAt(i, 0).toString());
                textkode.setText(Leonardo07145_AllObjctrl.Barang.daftarbarang().getValueAt(i, 1).toString());
                textharga.setText(Leonardo07145_AllObjctrl.Barang.daftarbarang().getValueAt(i, 2).toString());
            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Leonardo07145_GUI gui = new Leonardo07145_GUI();
                databarang.dispose();
            }
        });
    }
    void kosong(){
        textnama.setText(null);
        textkode.setText(null);
        textharga.setText(null);
    }
}