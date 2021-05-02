package Viwe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.RGBtoHSB;


public class TestGui extends JFrame {


    private JPanel root;
    private JLabel Label;
    private JButton rotButton;
    private JButton blauButton;
    private JButton grünButton;
    private JButton gelbButton;
    private JButton standartfarbeButton;
    private JButton farbeWählenButton;
    private JLabel Aufgabe1;
    private JLabel Aufgabe2;
    private JTextField TextField;
    private JButton arialButton;
    private JButton comicSansMSButton;
    private JButton courierNewButton;
    private JButton schreibenButton;
    private JButton löschenButton;
    private JLabel Aufgabe3;
    private JButton redButton;
    private JButton blueButton;
    private JButton greenButton;
    int size =11;

    public TestGui(){
        //This use the form designer fro,
        add(root);

        setTitle("Ich bin ein GUI");
        setSize(500,600);
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




        //Schriftart
        arialButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font arial = new Font("Arial", Font.PLAIN + Font.ITALIC, size );
                Label.setFont(arial);
            }
        });
        comicSansMSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font comicSansMS = new Font("Comic Sans MS", Font.PLAIN + Font.ITALIC,size);
                Label.setFont(comicSansMS);

            }
        });
        courierNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font courier = new Font("Courier", Font.PLAIN + Font.ITALIC, size);
                Label.setFont(courier);
            }
        });


        schreibenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label.setText(TextField.getText());
            }
        });
        löschenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label.setText("");

            }
        });

        //Schriftfarbe ändern
        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label.setForeground(Color.RED);
            }
        });
        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label.setForeground(Color.BLUE);
            }
        });
        greenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label.setForeground(Color.GREEN);
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
       // 239, 239, 239

        Color hintergrund = new Color(239, 239, 239);

        root.setBackground(hintergrund);
    }






    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
