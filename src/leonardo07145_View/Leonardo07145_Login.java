package leonardo07145_View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Leonardo07145_Login {
    JFrame Tampilanlogin = new JFrame();
    JLabel judul,log,namalog,passwordlog;
    JTextField textnamalog;
    JPasswordField textpasslog;
    JButton ok;
    public Leonardo07145_Login(){
        Tampilanlogin.setSize(700,300);
        Tampilanlogin.setLayout(null);
        Tampilanlogin.getContentPane().setBackground(Color.LIGHT_GRAY);
        judul = new JLabel("UD. SUEB");
        judul.setBounds(250, 10, 600, 50);
        judul.setFont(new Font("Times New Roman",Font.BOLD,40));
        Tampilanlogin.add(judul);
        log = new JLabel("LOGIN");
        log.setBounds(290, 70, 200, 50);
        log.setFont(new Font("Times New Roman",Font.BOLD,25));
        Tampilanlogin.add(log);
        namalog = new JLabel("Nama");
        namalog.setBounds(180, 120, 100, 50);
        namalog.setFont(new Font("Times New Roman",Font.BOLD,20));
        Tampilanlogin.add(namalog);
        textnamalog = new JTextField();
        textnamalog.setBounds(290, 130, 150, 25);
        Tampilanlogin.add(textnamalog);
        passwordlog = new JLabel("Password");
        passwordlog.setBounds(180, 160, 100, 50);
        passwordlog.setFont(new Font("Times New Roman",Font.BOLD,20));
        Tampilanlogin.add(passwordlog);
        textpasslog = new JPasswordField();
        textpasslog.setBounds(290, 170, 150, 25);
        Tampilanlogin.add(textpasslog);
        ok = new JButton("OK");
        ok.setBounds(300, 215, 100, 30);
        ok.setBackground(Color.GREEN);
        Tampilanlogin.add(ok);
        
        Tampilanlogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Tampilanlogin.setVisible(true);
        Tampilanlogin.setLocationRelativeTo(null);
        
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String nama = textnamalog.getText();
                String passwd = textpasslog.getText();

                if (textnamalog.getText().equals("admin") && textpasslog.getText().equals("admin")) {
                    JOptionPane.showMessageDialog(null, "Selamat Anda Berhasil Login");
                    Leonardo07145_GUI gui = new Leonardo07145_GUI();
                    Tampilanlogin.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Username/Password Salah!");
                    kosong();
                }
            }
        });
    }
    void kosong(){
        textnamalog.setText(null);
        textpasslog.setText(null);
    }
}