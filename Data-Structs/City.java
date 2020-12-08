public class City extends Territory{

    public City(String name, Person leader, String currency, String continent, String code, String demonym, int population, int gdp, int area){
        super(name, leader, currency, continent, code, demonym, population, gdp, area);
    }

    public void collectCityTaxes(){
        System.out.printf("%s's government is collecting city taxes from their citzens", this);
    }
    
}
