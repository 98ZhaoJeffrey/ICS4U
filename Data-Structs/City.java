import org.json.simple.JSONObject;

public class City extends Territory {

    public City(String name, String leader, String demonym, int population, int gdp, int area){
        super(name, leader, demonym, population, gdp, area);
    }

    public void collectTax(){
        System.out.printf("%s's government is collecting city taxes from their citzens", this.name);
    }

    public void useTax(){
        System.out.printf("%s's is fixing the city's roads with tax money", this.name);
    }

    public static void parseData(JSONObject city){
        String name = (String) city.get("name");
        String leader = (String) city.get("leader");
        long population = (long) city.get("population");
        String demonym = (String) city.get("demonym");
        double area = (double) city.get("area");
        double GDP = (double) city.get("gdp");

    }
    
}
