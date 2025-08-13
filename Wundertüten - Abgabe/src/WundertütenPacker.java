import java.util.ArrayList;

public class WundertütenPacker {
    ArrayList<Wundertüte> wundertüten;  
    int[] spiele;
    int anzahlSpiele;
    int anzahlTüten;

    public WundertütenPacker(int anzahlderWunderTüten, int anzahlDerSpielsorten, int[] sp) {
        wundertüten = new ArrayList<>();
        anzahlTüten = anzahlderWunderTüten;
        anzahlSpiele = anzahlDerSpielsorten;
        spiele = sp;
    }

    public boolean packen() {
        boolean stop = false;
        if (anzahlSpiele < 0){
            System.err.println("Die Eingabe der Anzahl der Spiele ist negativ und ungültig.");
        }else if(anzahlTüten < 0){
            System.err.println("Die Eingabe der Anzahl der Tüten ist negativ und ungültig.");
        }
        for (int i = 0; i < anzahlSpiele; i++){
            if (spiele[i] < 0){
                System.err.println("Die Eingabe der Anzahl von Spiel "+ (i + 1) + " ist negativ und ungültig.");
                stop = true;
            }
        }
        if (stop == false){

            for (int i = 0; i < anzahlTüten; i++) {
                Wundertüte tüte = new Wundertüte(anzahlSpiele);  
                wundertüten.add(tüte);  
            }

            int nesteTüte = 0;

            for (int i = 0; i < anzahlSpiele; i++){
                for (int a = 0; a < spiele[i]; a++){
                    Wundertüte wu = wundertüten.get(nesteTüte);
                    wu.hineinlegen(i);
                    nesteTüte ++;
                    if (nesteTüte >= anzahlTüten){
                        nesteTüte = 0;
                    }
                }
            }

            return true;

        }else{
            return false;
        }
    }
}