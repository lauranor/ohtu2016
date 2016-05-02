package toiminnat;

import javax.swing.JTextField;
import ohtu.Sovelluslogiikka;

public class Summa implements Komento{
    private Sovelluslogiikka sovellus;
    private JTextField tulos;
    private JTextField syote;
    private int edMaara;
    
    public Summa (Sovelluslogiikka sovellus, JTextField tulos, JTextField syote) {
        this.sovellus=sovellus;
        this.tulos=tulos;
        this.syote=syote;
        
    }

    @Override
    public void suorita() {
        sovellus.plus(Integer.parseInt(syote.getText()));
        tulos.setText(Integer.toString(sovellus.tulos()));
        syote.setText("");
    }
    
    @Override
    public void peru(){ 
        sovellus.miinus(edMaara);
        tulos.setText(Integer.toString(sovellus.tulos()));
        syote.setText("");
    }
}
