package widok;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import javax.swing.JPanel;

public class PanelOperatorow extends JPanel {
    private final Dimension WYMIARY_PANELU = new Dimension(72, 120);
    private final Point POZYCJA_PANELU = new Point(164, 95);
    private MyJButton dziel,sqrt,procent,mnoz,minus,plus,rowne,jedenPrzezX;
    public PanelOperatorow () {
        setSize(WYMIARY_PANELU);
        setLocation(POZYCJA_PANELU);
        setLayout(new GridLayout(4, 2, 4, 4));
        inicjalizacjaOrazDodaniePrzyciskow();
    }

    private void inicjalizacjaOrazDodaniePrzyciskow() {
        dziel = new MyJButton("/", Color.RED);
        sqrt = new MyJButton("sqrt", Color.RED);
        mnoz = new MyJButton("*", Color.RED);
        procent = new MyJButton("%", Color.RED);
        minus = new MyJButton("-", Color.RED);
        plus = new MyJButton("+", Color.RED);
        rowne = new MyJButton("=", Color.RED);
        jedenPrzezX = new MyJButton("1/x", new Color(153, 0, 153));
        add(dziel);
        add(sqrt);
        add(mnoz);
        add(procent);
        add(minus);
        add(jedenPrzezX);
        add(plus);
        add(rowne);
    }
    
}
