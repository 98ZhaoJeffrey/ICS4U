import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONObject;
public class Country extends Territory{
    private List<State> states;
    private City capital;
    private String language;
    final public String code;
    private String currency;
    final public String continent;

    /**
     * Constructor for country
     * 
     * @param name -name of country
     * @param currency -name of currency
     * @param language -language spoken in the country
     * @param leader -leader of the country
     * @param continent -name of contient the country is on
     * @param code -what the code the world refers the country by
     * @param demonym -what people from the country are called
     * @param population -population size of the country
     * @param gdp -amounts of goods and services produced in a year by the country
     * @param area -area size of country
     */
    public Country(String name, String currency, String language, String leader, String continent, String code, String demonym, long population, double gdp, double area){
        super(name, leader, demonym, population, gdp, area);
        this.continent = continent;
        this.code = code;
        this.currency = currency;
        this.language = language;
    }
    /**
     * Getter function for state list field
     * 
     * @return -List of states in the country
     */
    
    public List<State> getStates(){
        return this.states;
    }

    /**
     * Getter function for currency field
     * 
     * @return -name of the currency used in the country
     */
    public String getCurrency(){
        return this.currency;
    }

    /**
     *Setter function for currency field
     *  
     * @param -currency name used in the country
     */
    public void setCurrency(String currency){
        this.currency = currency;
    }

    /**
     * Getter function for language field
     * 
     * @return -language spoken in the country
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     *Setter function for language field
     *  
     * @param -language most spoken in the country
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Getter function for capital field
     * 
     * @return -capital city of the country
     */
    public City getCapital(){
        return this.capital;
    }
    
    /**
     *Setter function for city field
     *  
     * @param -capital city of the country
     */
    public void setCapital(City capital){
        this.capital = capital;
    }

    /**
     *Function for how a country would collect taxes
     */
    public void collectTax(){
        System.out.printf("%s's government is collecting federal taxes from their citzens", this.name);
    }

    /**
     *Function for how a country would spend taxes
     */
    public void useTax(){
        System.out.printf("%s's government is spending money to build oil pipelines", this.name);
    }

    /**
     * Gives us a human-readable representation of our country object
     * 
     * @return -String representation of our country object after passing the data into a hashmap
     */
    @Override
    public String toString() {
        Map<String,String> map= new LinkedHashMap<>();
        map.put("Name", this.name);
        map.put("Leader", this.getLeader());
        map.put("Language", this.getLanguage());
        map.put("Capital", String.valueOf(this.capital));
        map.put("Demonym", this.getDemonym());  
        map.put("Code", this.code);      
        map.put("Continent", this.continent);
        map.put("Currency", this.currency);
        map.put("Language", this.language);
        map.put("Population", String.valueOf(this.getPopulation()));
        map.put("GDP", String.valueOf(this.getGdp()));
        map.put("Area", String.valueOf(this.getArea()));

        return map.toString();
    }

     /**
     * Parses our JSON data and creates a new object
     * 
     * @param -country the JSON object that will be used to create the object
     * @param -cities list of cities to find if the capital exists
     * @return -Country 
     */
    public static Country parseData(JSONObject country, List <City> cities){
        String name = (String) country.get("name");
        String code = (String) country.get("code");
        String leader = (String) country.get("leader");
        String capital = (String) country.get("capital");
        String continent = (String) country.get("continent");
        long population = (long) country.get("population");
        String demonym = (String) country.get("demonym");
        double area = (double) country.get("area");
        String currency = (String) country.get("currency");
        String language = (String) country.get("language");
        double GDP = (double) country.get("gdp");

        Country c = new Country(name, currency, language, leader, continent, code,  demonym, population, GDP, area); 

        c.capital = null;
        c.states = null;
        
        for(City city : cities){
            if(capital.equals(city.name)){
                c.capital = city;
                break;
            }
        }  
        return c;

    }

}
