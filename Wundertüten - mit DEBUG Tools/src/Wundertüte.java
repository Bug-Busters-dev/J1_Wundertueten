public class Wundertüte {

    int [] spiele;

    public Wundertüte(int größe){
        spiele = new int[größe];
    }

    public void hineinlegen(int art){
        spiele [art] += 1;
    }

}
