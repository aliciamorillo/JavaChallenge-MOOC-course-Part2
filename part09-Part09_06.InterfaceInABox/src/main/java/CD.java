
public class CD implements Packable {
    
    String artist;
    String nameCD;
    int publicationYear;
    
    public CD(String artist, String nameCD, int publicationYear){
        this.artist = artist;
        this.nameCD = nameCD;
        this.publicationYear = publicationYear;
    }

    @Override
    public double weight() {
        return 0.1;
    }

    @Override
    public String toString(){
        return artist + ": " + nameCD + " (" + publicationYear + ")";
    }
    
}
