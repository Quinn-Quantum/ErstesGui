package Viwe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.RGBtoHSB;


public class TestGui extends JFrame {


    private JPanel root;
    private JLabel Label;
    private JTextField AB1;
    private JButton rotButton;
    private JButton blauButton;
    private JButton grünButton;
    private JButton gelbButton;
    private JButton standartfarbeButton;
    private JButton farbeWählenButton;

    public TestGui(){
        //This use the form designer fro,
        add(root);

        setTitle("Ich bin ein GUI");
        setSize(400,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);



        rotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Red_clicked();
            }
        });
        blauButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Blau_clicked();
            }
        });
        grünButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                G_clicked();

            }
        });
        gelbButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Gelb_clicked();
            }
        });
        standartfarbeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Grau_clicked();

            }
        });

        farbeWählenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               if(e.getSource() == farbeWählenButton){
                   JColorChooser farbAuswahl = new JColorChooser();

                   Color farben = JColorChooser.showDialog(null, "pick a color", Color.white);
                   root.setBackground(farben);
               }

            }
        });
    }
    //Hintergrund Farben
    public void G_clicked() {
        this.root.setBackground(java.awt.Color.GREEN);
    }
    public void Gelb_clicked() {
        this.root.setBackground(java.awt.Color.YELLOW);
    }

    public void Red_clicked() {
        this.root.setBackground(java.awt.Color.RED);
    }
    public void Blau_clicked() {
        this.root.setBackground(java.awt.Color.BLUE);
    }
    //normale Hintergrundfarbe
    public void Grau_clicked() {

        Color hintergrund = new Color(65, 68, 80);

        root.setBackground(hintergrund);
    }





    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
