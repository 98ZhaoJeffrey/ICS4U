import java.util.ArrayList;

public class State extends Territory{
    private ArrayList<City> cities;
    private City capital;
    private Country isApartOf;

    public State(String name, Person leader, String currency, String continent, String code, String demonym, int population, int gdp, int area, ArrayList<City> cities, City capital, Country isApartOf){
        super(name, leader, currency, continent,code, demonym, population, gdp, area);
        this.cities = cities;
        this.capital = capital;
        this.isApartOf = isApartOf;
    }

    public ArrayList<City> getCities() {
        return this.cities;
    }

    public City getCapital() {
        return this.capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public Country getIsApartOf() {
        return this.isApartOf;
    }

    public void setIsApartOf(Country isApartOf) {
        this.isApartOf = isApartOf;
    }

    public void collectStateTaxes(){
        System.out.printf("%s's government is collecting state taxes from their citzens", this);
    }
   
}
