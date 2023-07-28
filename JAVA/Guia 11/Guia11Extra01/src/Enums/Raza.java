package Enums;

/**
 *
 * @author DarioF
 */
public enum Raza {

    DOBERMAN("doberman"), BULLDOG("bulldog"), SALCHICHA("salchicha"), FOX_TERRIER("foxTerrier"), SIBERIANO("siberiano"), CHIHUAHUA ("chihuahua"), CALLEJERO ("callejero"), OTRO ("otro");
    
    private String raza;

    private Raza() {
    }

    private Raza(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    

}
