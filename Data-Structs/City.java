import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONObject;

public class City extends Territory {
    /**
     * 
     * @param name -name of the city
     * @param leader -name of the leader
     * @param demonym -what the people of the city are called
     * @param population -the population size of the city
     * @param gdp -the amount of goods and services produced in the city within 1 year
     * @param area -the size of the city
     */
    public City(String name, String leader, String demonym, long population, double gdp, double area){
        super(name, leader, demonym, population, gdp, area);
    }

    /**
     *Function for how a city would collect taxes
     */
    public void collectTax(){
        System.out.printf("%s's government is collecting city taxes from their citzens", this.name);
    }

    /**
     *Function for how a city would spend taxes
     */
    public void useTax(){
        System.out.printf("%s's is fixing the city's roads with tax money", this.name);
    }

     /**
     * Gives us a human-readable representation of our city object
     * @return -String representation of our city object after putting it in a hashmap
     */
    @Override
    public String toString() {
        Map<String,String> map= new LinkedHashMap<>();
        map.put("Name", this.name);
        map.put("Leader", this.getLeader());
        map.put("Demonym", this.getDemonym());
        map.put("Population", String.valueOf(this.getPopulation()));
        map.put("GDP", String.valueOf(this.getGdp()));
        map.put("Area", String.valueOf(this.getArea()));

        return map.toString();
    }

    /**
     * Parses our JSON object to create our city
     * 
     * @param -city JSONObject with data to create a new city
     * @return -City
     */
    public static City parseData(JSONObject city){
        String name = (String) city.get("name");
        String leader = (String) city.get("leader");
        long population = (long) city.get("population");
        String demonym = (String) city.get("demonym");
        double area = (double) city.get("area");
        double GDP = (double) city.get("gdp");

        return (new City(name, leader, demonym, population, GDP, area));
    }
    
}
