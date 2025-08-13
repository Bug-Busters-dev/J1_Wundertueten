
import java.io.*;

public class FileReaderx {

    public int readLine(String file, int zeile) {
        int inhalt = 0;

        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {

                for (int i = 0; i < zeile; i++) {
                    String zinhalt = br.readLine();
                
                    if (zinhalt == null) {
                        break;
                    }

                    try {
                        inhalt = Integer.parseInt(zinhalt.trim()); 
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                        System.err.println("Die Datei hat nicht das richtige Format.");
                    }
                
                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("Datei existiert nicht.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Lesen hat nicht geklappt.");
        }
        return inhalt;
    }
 
    public int[] redarray(String file, int aZeile, int eZeile, int anzahlSpiele){
        if (anzahlSpiele < 0){
            System.err.println("Die Eingabe ist negativ und ungültig.");
        }
            int [] spiele = new int[anzahlSpiele];
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {

            for (int q = 0; q < aZeile; q++) {
                br.readLine();
            }
            for (int i = 0; 1 < eZeile; i++) {
                String zinhalt = br.readLine();

                if (zinhalt == null) {
                        break;
                }

                try {
                        spiele[i] = Integer.parseInt(zinhalt.trim());
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                        System.err.println("Die Datei hat nicht das richtige Format.");
                    }
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("Datei existiert nicht.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Lesen hat nicht geklappt.");
        }
        return spiele;
    }
}
