import java.util.ArrayList;

public class Wundertüten {
    public static void main(String[] args) {
        String dateipfad = "C:\\\\Users\\\\Jonathan Salomo\\\\Documents\\\\Programiren\\\\Informatik Wettbewerb\\\\Wundertüten\\\\Eingabe_Ausgabe.txt";
        int anzahlderWunderTüte = 0;
        int anzahlderSpielsorte = 0;
        int[] sp;
        boolean wuGepackt = false;

        FileReaderx fileRederx = new FileReaderx();
        anzahlderWunderTüte = fileRederx.readLine(dateipfad, 1);
        anzahlderSpielsorte = fileRederx.readLine(dateipfad, 2);
        sp = fileRederx.redarray(dateipfad, 2, anzahlderSpielsorte + 1, anzahlderSpielsorte);

        WundertütenPacker wundertütenPacker = new WundertütenPacker(anzahlderWunderTüte, anzahlderSpielsorte, sp);
        wuGepackt = wundertütenPacker.packen();

        if  (wuGepackt == true){
            FileCreator fileCreator = new FileCreator(dateipfad);
            fileCreator.createFile("Aufteilung der Spiele:");
        
            ArrayList<Wundertüte> wundertüten = wundertütenPacker.wundertüten;
            for (int i = 0; i < wundertüten.size(); i++) {
                 Wundertüte wu = wundertüten.get(i);
                fileCreator.appendData("Games in Wundertuete " + (i + 1) + ": ",true);
                for (int spiele : wu.spiele) {
                    System.out.print(spiele + " ");
                    fileCreator.appendData(spiele + " ",false);
                }
            }
        }
    }
}