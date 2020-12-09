public class Country extends Territory{
    private State[] states;
    private City capital;
    private String currency;

    public Country(String name, String currency, Leader leader, String continent, String code, String demonym, int population, int gdp, int area, State[] states, City capital) {
        super(name, leader, continent, code, demonym, population, gdp, area);
        this.states = states;
        this.capital = capital;
        this.currency = currency;
    }

    public State[] getStates(){
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
        System.out.printf("%s's government is collecting federal taxes from their citzens", this);
    }

    public void useTax(){
        System.out.printf("%s's government is spending money to build oil pipelines", this);
    }

}
