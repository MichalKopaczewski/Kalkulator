
package widok;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Point;
import javax.swing.JFrame;

public class OknoKalkulatora extends JFrame{
    private final int WYSOKOSC_MENU_BAR=25;
    private final int SZEROKOSC_MENU_BAR=240;
    private final Dimension ROZMIAR_POLA_TEKSTOWEGO = new Dimension(240, 25);
    private final Point POZYCJA_POLA_TEKSTOWEGO = new Point(0, 25);
    private MenuBar menuBar;
    private MyJTextField wynikTF;
    private PanelPamieci pamiecPN;
    private PanelCyfr cyfryPN;
    private PanelUsuwania usuwaniePN;
    private PanelOperatorow operatorPN;
    public OknoKalkulatora(int x, int y, int szerokosc, int wysokosc) {
        setLayout(null);
        setResizable(false);
        inicjalizacjaRamki(x, y, szerokosc, wysokosc);
        inicjalizacjaOrazDodanieMenuBara();
        inicjalizacjaOrazDodaniePolaWyniku();
        inicjalizacjaOrazDodaniePaneluPamieci();
        inicjalizacjaOrazDodaniePaneluCyfr();
        inicjalizacjaOrazDodaniePaneluUsuwania();
        inicjalizacjaOrazDodaniePaneluOperatorow();
        setVisible(true);
    }
    private void inicjalizacjaRamki(int x, int y, int szerokosc, int wysokosc) {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        Insets insets;
        insets = getInsets();
        setBounds(x, y, szerokosc + insets.left + insets.right, wysokosc + insets.top + insets.bottom);
    }
    private void inicjalizacjaOrazDodanieMenuBara() {
        menuBar = new MenuBar();
        menuBar.setBounds(0, 0, SZEROKOSC_MENU_BAR , WYSOKOSC_MENU_BAR);
        add(menuBar, BorderLayout.NORTH);
    }
    private void inicjalizacjaOrazDodaniePolaWyniku() {
        wynikTF = new MyJTextField();
        wynikTF.setSize(ROZMIAR_POLA_TEKSTOWEGO);
        wynikTF.setLocation(POZYCJA_POLA_TEKSTOWEGO);
        add(wynikTF);
    }
    private void inicjalizacjaOrazDodaniePaneluPamieci() {
        pamiecPN = new PanelPamieci();
        add(pamiecPN);
    }
    private void inicjalizacjaOrazDodaniePaneluCyfr() {
        cyfryPN = new PanelCyfr();
        add(cyfryPN);
    }
    private void inicjalizacjaOrazDodaniePaneluUsuwania () {
        usuwaniePN = new PanelUsuwania();
        add(usuwaniePN);
    }
    private void inicjalizacjaOrazDodaniePaneluOperatorow() {
        operatorPN = new PanelOperatorow();
        add(operatorPN);
    }
    
}
