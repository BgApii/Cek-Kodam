import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class cekkodam extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel judul;
    private JLabel nama;
    private JLabel kodam;
    private JLabel gambar;
    private JTextField search;
    private JButton button;
    ImageIcon kosong = new ImageIcon("src\\image\\kosong.png");
    ImageIcon deodorant = new ImageIcon("src\\image\\deodorant.png");
    ImageIcon kulkas = new ImageIcon("src\\image\\kulkas.png");
    ImageIcon sendal = new ImageIcon("src\\image\\sendal.png");
    ImageIcon casing = new ImageIcon("src\\image\\casing.png");
    ImageIcon remote = new ImageIcon("src\\image\\remote.png");
    ImageIcon dompet = new ImageIcon("src\\image\\dompet.png");
    ImageIcon senter = new ImageIcon("src\\image\\senter.png");
    ImageIcon toa = new ImageIcon("src\\image\\toa.png");
    ImageIcon kunci = new ImageIcon("src\\image\\kunci.png");
    ImageIcon jomok = new ImageIcon("src\\image\\jomok.png");
    Object[] i_kodam = {kosong, deodorant, kulkas, sendal, casing, remote, dompet, senter, toa, kunci, jomok};
    String[] j_kodam = {"Kosong", "Deodorant", "Kulkas", "Sendal", "Casing HP", "Remote", "Dompet", "Senter", "Toa", "Kunci", "King Jomok"};

    private void Layout(){
        setTitle("Library");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);


        Font label = new Font("Consolas",Font.BOLD,14);
        panel = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        judul = new JLabel("KODAM", SwingConstants.CENTER);
        judul.setFont(new Font("Serif", Font.BOLD, 24));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 5;
        panel.add(judul, gbc);

        nama = new JLabel("Nama  :", SwingConstants.RIGHT);
        nama.setFont(label);
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(nama, gbc);

        search = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 4;
        panel.add(search, gbc);

        button = new JButton("Cek");
        gbc.gridwidth = 1;
        gbc.gridx = 2;
        gbc.gridy = 2;
        panel.add(button, gbc);

        kodam = new JLabel();
        kodam.setFont(new Font("Serif", Font.BOLD, 14));
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 5;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        panel.add(kodam, gbc);

        gambar = new JLabel();
        gbc.gridheight = 1;
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 5;

        panel.add(gambar, gbc);



        button.addActionListener(this);

        add(panel);
        setVisible(true);
    }

    private void random(){
        Random acak = new Random();
        int randomindex = acak.nextInt(j_kodam.length);
        gambar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gambar.setIcon((Icon) i_kodam[randomindex]);
        kodam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kodam.setText(j_kodam[randomindex]);
    }

    public static void main(String[] args) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cekkodam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        cekkodam cek = new cekkodam();
        cek.Layout();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            random();
        }
    }
}
