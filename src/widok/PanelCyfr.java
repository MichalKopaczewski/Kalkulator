package widok;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import javax.swing.JPanel;
import widok.MyJButton;

public class PanelCyfr extends JPanel {
    private final Dimension WYMIARY_PANELU = new Dimension(110, 120);
    private final Point POZYCJA_PANELU = new Point(50, 95);
    private MyJButton cyfry[],plusMinus,przecinek;
    public PanelCyfr () {
        setSize(WYMIARY_PANELU);
        setLocation(POZYCJA_PANELU);
        setLayout(new GridLayout(4, 3,4,4));
        inicjacjaOrazDodaniePrzyciskow();
    }
    public void inicjacjaOrazDodaniePrzyciskow() {
        cyfry = new MyJButton[10];
        for (int i=0; i<10; i++) {
            cyfry[i] = new MyJButton(String.valueOf(i), Color.BLUE);
        }
        add(cyfry[7]);
        add(cyfry[8]);
        add(cyfry[9]);
        add(cyfry[4]);
        add(cyfry[5]);
        add(cyfry[6]);
        add(cyfry[1]);
        add(cyfry[2]);
        add(cyfry[3]);
        add(cyfry[0]);
        plusMinus = new MyJButton("+/-", Color.BLUE);
        przecinek = new MyJButton(",", Color.BLUE);
        add(plusMinus);
        add(przecinek);
    }
    
}
