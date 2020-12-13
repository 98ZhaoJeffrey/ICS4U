import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;

public class State extends Territory {
    private List<City> cities;
    private City capital;
    final public String code;

    /**
     * 
     * @param name -name of the state
     * @param leader -leader of the state
     * @param code -code the state is refered to
     * @param demonym -what people from that state are called
     * @param population -population size of the state
     * @param gdp - amount of goods and services that the state produces in a year
     * @param area -size of the state
     * @param capital -capital city of the state
     * @param cities -cities that make up the state
     */
    public State(String name, String leader, String code, String demonym, long population, double gdp, long area, City capital, List<City> cities){
        super(name, leader, demonym, population, gdp, area);
        this.code = code;
        this.capital = capital;
        this.cities = cities;
    }

    /**
     * Getter function for cities
     * 
     * @return list of cities
     */
    public List<City> getCities() {
        return this.cities;
    }

    /**
     * Add a city to the list of cities in the state
     * 
     * @param city -city to be added
     */
    public void addCity(City city){
        this.cities.add(city);
    }

    /**
     * Getter function for the capital
     * 
     * @return -capital city of the state
     */
    public City getCapital() {
        return this.capital;
    }

    /**
     * Setter function for the state
     * 
     * @param capital -city capital of the state
     */
    public void setCapital(City capital) {
        this.capital = capital;
    }

    /**
     * Function for how a state would collect taxes
     */
    public void collectTax(){
        System.out.printf("%s's government is collecting state taxes from their citzens", this.name);
    }

    /**
     * Function for how a state would spend taxes
     */
    public void useTax(){
        System.out.printf("%s's government is building new public state universities with tax money", this.name);
    }

    /**
     * Gives us a human-readable representation of our state object
     * 
     * @return -String representation of our state object after passing the data into a hashmap
     */
    @Override
    public String toString() {
        Map<String,String> map= new LinkedHashMap<>();
        map.put("Name", this.name);
        map.put("Leader", this.getLeader());
        map.put("Demonym", this.getDemonym());
        map.put("Code", this.code);
        map.put("Capital", String.valueOf(this.capital));
        map.put("Population", String.valueOf(this.getPopulation()));
        map.put("GDP", String.valueOf(this.getGdp()));
        map.put("Area", String.valueOf(this.getArea()));

        return map.toString();
    }

    /**
     * 
     * @param state -the JSON object that will be used to create the object
     * @param cities -list of cities to find if the capital exists
     * @return
     */
    public static State parseData(JSONObject state, List <City> cities){
        String name = (String) state.get("name");
        String code = (String) state.get("code");
        String leader = (String) state.get("leader");
        String capital = (String) state.get("capital");
        long population = (long) state.get("population");
        String demonym = (String) state.get("demonym");
        long area =  ((long)state.get("area"));
        double GDP = (double) state.get("gdp");

        State s = new State(name, leader, code, demonym, population, GDP, area, null, null);
        
        for(City city : cities){
            if(capital.equals(city.name)){
                s.capital = city;
                break;
            }
        }  
        return s;
    }
       
}
