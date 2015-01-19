package widok;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import javax.swing.JPanel;

public class PanelPamieci extends JPanel {
    private final Dimension WYMIARY_PANELU = new Dimension(32, 120);
    private final Point POZYCJA_PANELU = new Point(7, 95);
    private MyJButton mc,mr,ms,mp;
    public PanelPamieci () {
        setSize(WYMIARY_PANELU);
        setLocation(POZYCJA_PANELU);
        setLayout(new GridLayout(4, 1,4,4));
        inicjalizacjaOrazDodaniePrzyciskow();
    }
    private void inicjalizacjaOrazDodaniePrzyciskow() {
        mc = new MyJButton("MC", Color.RED);
        mr = new MyJButton("MR", Color.RED);
        ms = new MyJButton("MS", Color.RED);
        mp = new MyJButton("M+", Color.RED);
        add(mc);
        add(mr);
        add(ms);
        add(mp);
    }
}
