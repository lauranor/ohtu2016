package toiminnat;

import javax.swing.JTextField;
import ohtu.Sovelluslogiikka;
import toiminnat.Komento;

public class Erotus implements Komento {

    private Sovelluslogiikka sovellus;
    private JTextField tulos;
    private JTextField syote;
    private int edMaara;

    public Erotus(Sovelluslogiikka sovellus, JTextField tulos, JTextField syote) {
        this.sovellus = sovellus;
        this.tulos = tulos;
        this.syote = syote;
    }

    @Override
    public void suorita() {
        sovellus.miinus(Integer.parseInt(syote.getText()));
        tulos.setText(Integer.toString(sovellus.tulos()));
        syote.setText(null);
    }

    @Override
    public void peru() {
    }

}
