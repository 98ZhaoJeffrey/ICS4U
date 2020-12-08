//package Data-Structs;
import java.util.ArrayList;

public class Country extends Territory{
    private ArrayList<State> states;
    private City capital;

    public Country(String name, Person leader, String currency, String continent, String code, String demonym, int population, int gdp, int area, ArrayList<State> states, City capital) {
        super(name, leader, currency, continent,code, demonym, population, gdp, area);
        this.states = states;
        this.capital = capital;
    }

    public ArrayList<State> getStates(){
        return this.states;
    }

    public void setCapital(City capital){
        this.capital = capital;
    }

    public City getCapital(){
        return this.capital;
    }

    public void collectFederalTaxes(){
        System.out.printf("%s's government is collecting federal taxes from their citzens", this);
    }

}
