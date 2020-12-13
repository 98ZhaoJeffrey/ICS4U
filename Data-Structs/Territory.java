import java.util.Comparator;
/**
 * Abstract class that builds the structure of a territory(piece of land) and its methods
 *
 * @author Jeffrey Zhao
 * @version 1.0
 * @since 1.8
 */
public abstract class Territory{
    final public String name;
    private String leader;
    private String demonym;
    private long population;
    private double gdp;
    private double area;

    /**
     * Constructor to build our territory object
     * 
     * @param name -name of the territory
     * @param leader -leader/ruler of the territory
     * @param demonym -what the people of the territory are known as
     * @param population -number of people living on the territory
     * @param gdp -the amount of goods and services produced within the territory in 1 year
     * @param area -size of the territory
     */
    public Territory(String name, String leader, String demonym, long population, double gdp, double area){
        this.name = name;
        this.leader = leader;
        this.demonym = demonym;
        this.population = population;
        this.gdp = gdp;
        this.area = area;
    }

    /**
     * Getter function for leader field
     * 
     * @return -leader of the territory
     */
    public String getLeader() {
        return this.leader;
    }

    /**
     * Setter function for leader field
     * 
     * @param -territory leader
     */
    public void setLeader(String leader) {
        this.leader = leader;
    }

    /**
     * Getter function for demonym field
     * 
     * @return -what the people are known as
     */
    public String getDemonym() {
        return this.demonym;
    }

    /**
     *Setter function for demonym field
     *  
     * @param -name of the people who live in the territory
     */
    public void setDemonym(String demonym) {
        this.demonym = demonym;
    }

    /**
     * Getter function for population field
     * 
     * @return -population size of the territory
     */
    public long getPopulation() {
        return this.population;
    }
    /**
     * Setter function for population field
     * 
     * @param -population size of the territory
     */
    public void setPopulation(long population) {
        this.population = population;
    }

    /**
     * Getter function for GDP field
     * 
     * @return -GDP of the territory
     */
    public double getGdp() {
        return this.gdp;
    }
    
    /**
     * Setter function for GDP field
     * 
     * @param -GDP of the territory
     */
    public void setGdp(double gdp) {
        this.gdp = gdp;
    }

    /**
     * Getter function for area field
     * 
     * @return -area of the territory
     */
    public double getArea() {
        return this.area;
    }

    /**
     * Setter function for area field
     * 
     * @param -area of the territory
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Abstract function for how certain territories collect taxes
     */
    abstract void collectTax();

    /**
     * Abstract function for how certain territories spend taxes
     */
    abstract void useTax();

}

class ComparePopulation implements Comparator <Territory> {
    /**
     * @param Territory to be compared to
     * @param Territory that is compared to
     * @return +1 if the first territory's population is greater than the second territory's, -1 if flipped, and 0 if equal
     */
    public int compare(Territory t1, Territory t2){
        if(t1.getPopulation() > t2.getPopulation()){
            return 1;
        }
        if(t1.getPopulation() < t2.getPopulation()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
class CompareGDP implements Comparator <Territory> {
    /**
     * @param Territory to be compared to
     * @param Territory that is compared to
     * @return +1 if the first territory's gdp is greater than the second territory's, -1 if flipped, and 0 if equal
     */
    public int compare(Territory t1, Territory t2){
        if(t1.getGdp() > t2.getGdp()){
            return 1;
        }
        if(t1.getGdp() < t2.getGdp()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
class CompareArea implements Comparator <Territory> {
     /**
     * @param Territory to be compared to
     * @param Territory that is compared to
     * @return +1 if the first territory's area is greater than the second territory's, -1 if flipped, and 0 if equal
     */
    public int compare(Territory t1, Territory t2){
        if(t1.getArea() > t2.getArea()){
            return 1;
        }
        if(t1.getArea() < t2.getArea()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
