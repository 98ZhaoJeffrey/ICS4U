public class Leader {
    final private String name;
    private int age;
    final private String countryName;

    public Leader(String name, int age, String countryName){
        if(age < 0){
            throw new IllegalArgumentException("A person cannot have a negative age");
        }
        this.name = name;
        this.age = age;
        this.countryName = countryName;
    }

    @Override
    public String toString(){
        return(this.name);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountryName() {
        return this.countryName;
    }

}
