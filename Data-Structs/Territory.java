import java.util.Objects;

//package Data-Structs;
public class Territory {
    final public String name;
    private Person leader;
    final public String currency;
    private String language;
    final public String continent;
    final public String code;
    private String demonym;
    private int population;
    private int gdp;
    private int area;

    public Territory(String name, Person leader, String currency, String continent, String code, String demonym, int population, int gdp, int area){
        this.name = name;
        this.leader = leader;
        this.currency = currency;
        this.continent = continent;
        this.code = code;
        this.demonym = demonym;
        this.population = population;
        this.gdp = gdp;
        this.area = area;
    }

    public Person getLeader() {
        return this.leader;
    }

    public void setLeader(Person leader) {
        this.leader = leader;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDemonym() {
        return this.demonym;
    }

    public void setDemonym(String demonym) {
        this.demonym = demonym;
    }

    public int getPopulation() {
        return this.population;
    }

    public void setPopulation(int population) {
        if(population < 0){
            throw new IllegalArgumentException("The population of a Territory must be greater than 0");
        }
        this.population = population;
    }

    public int getGdp() {
        return this.gdp;
    }

    public void setGdp(int gdp) {
        if(gdp < 0){
            throw new IllegalArgumentException("The GDP of a Territory must be greater than 0");
        }
        this.gdp = gdp;
    }

    public int getArea() {
        return this.area;
    }

    public void setArea(int area) {
        if(area < 0){
            throw new IllegalArgumentException("The area of a Territory must be greater than 0");
        }
        this.area = area;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
