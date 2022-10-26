package nyp_donem_projesi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JFrame;

/**
 *
 * Talha Ramadan 20360859104
 * 
 */
public class NYP_Donem_Projesi extends JFrame implements ActionListener{
    static ArrayList <KrediKarti> butunKartlar=new ArrayList <KrediKarti>();
    public static void main(String[] args) {
        NYP_Donem_Projesi panel=new NYP_Donem_Projesi("NYP Donem Projesi");
    }
    Musteri m1;
    
    JButton bt1,bt2,bt3,bt4;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6;
    JTextArea ta;
    JLabel lb1,lb2,lb3,lb4,lb5,lb6;
    
    NYP_Donem_Projesi(String s){
        super(s);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        //TEXTAREA
        ta = new JTextArea("");
        ta.setEditable(false);
        ta.setBounds(60,350,300,200);
        ta.setVisible(false);
        this.add(ta);

        //LABEL lar
        lb1 = new JLabel("Adi:");
        lb1.setBounds(60,40,100,30);
        this.add(lb1);
        
        lb2 = new JLabel("Soyadi:");
        lb2.setBounds(60,80,100,30);
        this.add(lb2);
        
        lb3 = new JLabel("Mail Adresi:");
        lb3.setBounds(60,120,100,30);
        this.add(lb3);
        
        lb4 = new JLabel("Tel No:");
        lb4.setBounds(60,160,100,30);
        this.add(lb4);
        
        //TEXTFIELD lar 
        tf1=new JTextField("");
        tf1.setBounds(150, 40, 150, 30);
        this.add(tf1);
        
        tf2=new JTextField("");
        tf2.setBounds(150, 80, 150, 30);
        this.add(tf2);
        
        tf3=new JTextField("");
        tf3.setBounds(150, 120, 150, 30);
        this.add(tf3);
        
        tf4=new JTextField("");
        tf4.setBounds(150, 160, 150, 30);
        this.add(tf4);
        
        //BUTTON LAR
        bt1=new JButton("Musteri Ekle");
        bt1.setBounds(150, 200, 150, 30);
        bt1.addActionListener(this);
        this.add(bt1);
        
        bt2=new JButton("Hesap Bilgileri");
        bt2.setBounds(150, 240, 150, 30);
        this.add(bt2);
        
        bt3=new JButton("Musteri Bilgileri");
        bt3.addActionListener(this);
        bt3.setBounds(0, 240, 150, 30);
        this.add(bt3);
        
        
        bt4=new JButton("Kredi Bilgileri");
        bt4.setBounds(300, 240, 150, 30);
        this.add(bt4);
        
        this.setSize(800, 620);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    //ActionListeneri kullanmak icin gereken metod
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==bt1){
            String ad = tf1.getText();
            String soyad = tf2.getText();
            String mail = tf3.getText();
            String telno = tf4.getText();
            m1 = new Musteri(ad,soyad,mail,telno);
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
            JOptionPane.showMessageDialog(null, "Musteri Eklendi...","Eylem Basarili!",2);
        }else if(ae.getSource()==bt3){
            ta.setVisible(true);
            ta.setText(" Adi: "+m1.getAd()+"\n Soyadi: "+m1.getSoyad()+"\n Mail Adresi: "+m1.getEmail()+"\n Tel No: "+m1.getTelefonNumarasi());
        }
    }
    
}
