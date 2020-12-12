import org.json.simple.JSONObject;

public class State extends Territory {
    private City[] cities;
    private City capital;
    final public String code;

    public State(String name, String leader, String code, String demonym, long population, double gdp, long area, City[] cities, City capital){
        super(name, leader, demonym, population, gdp, area);
        this.cities = cities;
        this.capital = capital;
        this.code = code;
    }

    public City[] getCities() {
        return this.cities;
    }

    public City getCapital() {
        return this.capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public void collectTax(){
        System.out.printf("%s's government is collecting state taxes from their citzens", this.name);
    }

    public void useTax(){
        System.out.printf("%s's government is building new public state universities with tax money", this.name);
    }
    public static void parseData(JSONObject state){
        String name = (String) state.get("name");
        String code = (String) state.get("code");
        String leader = (String) state.get("leader");
        String capital = (String) state.get("capital");
        long population = (long) state.get("population");
        String demonym = (String) state.get("demonym");
        double area = (double) state.get("area");
        double GDP = (double) state.get("gdp");
    }
       
}
