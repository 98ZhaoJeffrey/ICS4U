import java.util.ArrayList;
import org.json.simple.JSONObject;
public class Country extends Territory{
    private ArrayList<State> states;
    private City capital;
    final public String code;
    private String currency;
    final public String continent;

    public Country(String name, String currency, String leader, String continent, String code, String demonym, int population, int gdp, int area, ArrayList<State> states, City capital) {
        super(name, leader, demonym, population, gdp, area);
        this.states = states;
        this.continent = continent;
        this.code = code;
        this.capital = capital;
        this.currency = currency;
    }
    
    public ArrayList<State> getStates(){
        return this.states;
    }

    public void setCapital(City capital){
        this.capital = capital;
    }

    public String getCurrency(){
        return this.currency;
    }
    public void setCurrency(String currency){
        this.currency = currency;
    }

    public City getCapital(){
        return this.capital;
    }

    public void collectTax(){
        System.out.printf("%s's government is collecting federal taxes from their citzens", this.name);
    }

    public void useTax(){
        System.out.printf("%s's government is spending money to build oil pipelines", this.name);
    }

    public static void parseData(JSONObject country){
        String name = (String) country.get("name");
        String code = (String) country.get("code");
        String leader = (String) country.get("leader");
        String capital = (String) country.get("capital");
        String contient = (String) country.get("continent");
        long population = (long) country.get("population");
        String demonym = (String) country.get("demonym");
        double area = (double) country.get("area");
        String currency = (String) country.get("currency");
        String language = (String) country.get("language");
        double GDP = (double) country.get("gdp");

        System.out.println(name);
        System.out.println(code);
        System.out.println(capital);
        System.out.println(contient);
        System.out.println(population);
        System.out.println(demonym);
        System.out.println(area);
        System.out.println(currency);
        System.out.println(language);
        System.out.println(leader);
        System.out.println(GDP);
        System.out.println("-------------------------");

    }

}
