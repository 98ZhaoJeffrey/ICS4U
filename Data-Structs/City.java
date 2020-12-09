public class City extends Territory{

    public City(String name, Leader leader, String continent, String code, String demonym, int population, int gdp, int area){
        super(name, leader, continent, code, demonym, population, gdp, area);
    }

    public void collectTax(){
        System.out.printf("%s's government is collecting city taxes from their citzens", this);
    }

    public void useTax(){
        System.out.printf("%s's is fixing the city's roads with tax money", this);
    }
    
}
