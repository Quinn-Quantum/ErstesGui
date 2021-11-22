package Viwe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
    private JLabel Aufgabe4;
    private JButton plusbutton;
    private JButton minusbutton;
    private JLabel Aufgabe5;
    private JButton linksbündigButton;
    private JButton zentriertButton;
    private JButton rechtsbündigButton;
    private JLabel Aufgabe6;
    private JButton EXITButton;
    int size =11;
    private String name;


    public void setName(){
        this.name =name;
    }
    public String getName(String name){
        return name;}

    public TestGui(){
        //This use the form designer fro,
        add(root);

        setTitle("Ich bin ein GUI");
        setSize(800,600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false); //Fenster bleibt auf setSize

        setName("Dialog");

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
                   Color farben = JColorChooser.showDialog(null, "pick a color", Color.white);
                   root.setBackground(farben);
            }
        });

        //Schriftart
        arialButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font arial = new Font("Arial", Font.PLAIN + Font.ITALIC, size );
                setName("Arial");
                Label.setFont(arial);
            }
        });
        comicSansMSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font comicSansMS = new Font("Comic Sans MS", Font.PLAIN + Font.ITALIC,size);
                setName("Comic Sans MS");
                Label.setFont(comicSansMS);
            }
        });
        courierNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font courier = new Font("Courier", Font.PLAIN + Font.ITALIC, size);
                setName("Courier");
                Label.setFont(courier);
            }
        });

        //Label bearbeiten
        schreibenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label.setText(TextField.getText());
            }
        });
        löschenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label.setText(null);
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

        //Schrift größe
        plusbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   size ++ ;
                   Label.setFont(new Font(getName(),Font.PLAIN + Font.ITALIC,size));
            }
        });
        minusbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (size >0){
                size --;
                Label.setFont(new Font(getName(),Font.PLAIN + Font.ITALIC,size));}
                else Label.setFont(new Font(getName(),Font.PLAIN + Font.ITALIC,size));
            }
        });

        //Textausrichten
        //einmal mit Swing und 2mal mit JLABEL
        linksbündigButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              Label.setHorizontalAlignment(SwingConstants.LEFT);
            }
        });
        zentriertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label.setHorizontalAlignment(JLabel.CENTER);
            }
        });
        rechtsbündigButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label.setHorizontalAlignment(JLabel.RIGHT);
            }
        });
        EXITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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