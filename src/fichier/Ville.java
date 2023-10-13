package fichier;

public class Ville {
    private String name;
    private int code;
    private String region;
    private long population;

    public Ville(String name, int code, String region, long population) {
        this.name = name;
        this.code = code;
        this.region = region;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Ville: {" +
                "name : " + name + '\'' +
                ", code : " + code +
                ", region : " + region + '\'' +
                ", population : " + population +
                '}';
    }
}