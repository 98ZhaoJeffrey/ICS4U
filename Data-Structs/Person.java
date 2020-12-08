import java.util.Objects;

public class Person {
    final private String name;
    private int age;
    final private String countryName;

    public Person(String name, int age, String countryName){
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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Person)) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(name, person.name) && age == person.age && Objects.equals(countryName, person.countryName);
    }

}
