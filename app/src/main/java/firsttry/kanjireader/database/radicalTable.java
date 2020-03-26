package firsttry.kanjireader.database;

public class radicalTable {
    String radical;
    String strokes;

    public radicalTable(){

    }

    public radicalTable(String radical, String strokes){
        this.radical = radical;
        this.strokes = strokes;
    }

    public void setRadical(String radical) {
        this.radical = radical;
    }

    public void setStrokes(String strokes) {
        this.strokes = strokes;
    }
}
