public class State extends Territory{
    private City[] cities;
    private City capital;
    private Country isApartOf;

    public State(String name, Leader leader, String continent, String code, String demonym, int population, int gdp, int area, City[] cities, City capital, Country isApartOf){
        super(name, leader, continent,code, demonym, population, gdp, area);
        this.cities = cities;
        this.capital = capital;
        this.isApartOf = isApartOf;
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

    public Country getIsApartOf() {
        return this.isApartOf;
    }

    public void setIsApartOf(Country isApartOf) {
        this.isApartOf = isApartOf;
    }

    public void collectTax(){
        System.out.printf("%s's government is collecting state taxes from their citzens", this);
    }

    public void useTax(){
        System.out.printf("%s's government is building new public state universities with tax money", this);
    }
       
}
