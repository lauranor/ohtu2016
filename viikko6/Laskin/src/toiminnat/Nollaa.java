/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toiminnat;
import javax.swing.JTextField;
import ohtu.Sovelluslogiikka;

public class Nollaa implements Komento{
    private Sovelluslogiikka sovellus;
    private JTextField tulos;
    private JTextField syote;
    private int edMaara;
    
    public Nollaa (Sovelluslogiikka sovellus, JTextField tulos, JTextField syote) {
        this.sovellus=sovellus;
        this.tulos=tulos;
        this.syote=syote;
        
    }

    @Override
    public void suorita() {
        sovellus.nollaa();
        tulos.setText(Integer.toString(0));
        syote.setText("");
    }
    
    @Override
    public void peru(){
        
    }
}
