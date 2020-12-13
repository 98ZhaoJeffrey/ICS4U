import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*; 

/**
 * Main driver class that reads data, generates city, states, and country objects, then writes out the results
 *
 * @author Jeffrey Zhao
 * @version 1.0
 * @since 1.8
 */

public class Main {
    public static void main (String[] args) throws Exception{
        try{            
            //comparators
            ComparePopulation comparePopulation = new ComparePopulation();
            CompareGDP compareGDP = new CompareGDP();
            CompareArea compareArea = new CompareArea();

            //create all the cities, then create the states, then create the countries
            Object cityJSON = new JSONParser().parse(new FileReader("inputs/city.json"));
            Object stateJSON = new JSONParser().parse(new FileReader("inputs/state.json"));
            Object countryJSON = new JSONParser().parse(new FileReader("inputs/country.json"));
            JSONArray cityList = (JSONArray) cityJSON;
            JSONArray stateList = (JSONArray) stateJSON;
            JSONArray countryList = (JSONArray) countryJSON;
            
            //create arraylists to hold objects
            int citySize = cityList.size();
            int stateSize = countryList.size();
            int countrySize = countryList.size();
            List <City> cities = new ArrayList <City> (citySize);
            List <State> states = new ArrayList <State> (stateSize);
            List <Country> countries = new ArrayList <Country> (countrySize);

            //adding in city, state, and country data
            for(int i = 0; i < citySize; i++){
                cities.add(City.parseData((JSONObject) cityList.get(i)));
            }
            for(int i = 0; i < stateSize; i++){
                states.add(State.parseData((JSONObject) stateList.get(i), cities));
            }
            for(int i = 0; i < countrySize; i++){
                countries.add(Country.parseData((JSONObject) countryList.get(i), cities));
            }
            
            //Creating a new folder for the outputs
            final String outputFolder = System.getProperty("user.dir") + "\\output";
            File outputs = new File(outputFolder);
            outputs.mkdir();
            
            //creating file writers
            FileWriter cityWriter = new FileWriter(new File(outputFolder + "\\city.txt"), false);
            FileWriter stateWriter = new FileWriter(new File(outputFolder + "\\state.txt"), false);
            FileWriter countryWriter = new FileWriter(new File(outputFolder + "\\country.txt"), false);


            //Writing output
            System.out.println("Writing to city.txt");
            cityWriter.write(String.format("Generated %s objects \n", cities.get(0).getClass().getTypeName()));
            for(City city: cities){
                cityWriter.write(city + "\n");
            }
            cityWriter.write("----------------------------\n");
            Collections.sort(cities, comparePopulation.reversed());
            cityWriter.write(String.format("Sorting %s objects by population \n", cities.get(0).getClass().getTypeName()));
            for(City city: cities){
                cityWriter.write(String.format("%s's population is %s \n", city.name, city.getPopulation()));
            }
            cityWriter.write("----------------------------\n");
            Collections.sort(cities, compareArea.reversed());
            cityWriter.write(String.format("Sorting %s objects by area \n", cities.get(0).getClass().getTypeName()));
            for(City city: cities){
                cityWriter.write(String.format("%s's area is %s \n", city.name, city.getArea()));
            }
            cityWriter.write("----------------------------\n");
            Collections.sort(cities, compareGDP.reversed());
            cityWriter.write(String.format("Sorting %s objects by GDP(Trillion dollars) \n", cities.get(0).getClass().getTypeName()));
            for(City city: cities){
                cityWriter.write(String.format("%s's GDP is %s \n", city.name, city.getGdp()));
            }
            cityWriter.write("----------------------------\n");
            cityWriter.close();
            System.out.println("Finished writing to city.txt");


            System.out.println("Writing to states.txt");
            stateWriter.write(String.format("Generated %s objects \n", states.get(0).getClass().getTypeName()));
            for(State state: states){
                stateWriter.write(state + "\n");
            }
            stateWriter.write("----------------------------\n");
            Collections.sort(states, comparePopulation.reversed());
            stateWriter.write(String.format("Sorting %s objects by population \n", states.get(0).getClass().getTypeName()));
            for(State state: states){
                stateWriter.write(String.format("%s's population is %s \n", state.name, state.getPopulation()));
            }
            stateWriter.write("----------------------------\n");
            Collections.sort(states, compareArea.reversed());
            stateWriter.write(String.format("Sorting %s objects by area \n", states.get(0).getClass().getTypeName()));
            for(State state: states){
                stateWriter.write(String.format("%s's area is %s \n", state.name, state.getArea()));
            }
            stateWriter.write("----------------------------\n");
            Collections.sort(states, compareGDP.reversed());
            stateWriter.write(String.format("Sorting %s objects by GDP(Trillion dollars) \n", states.get(0).getClass().getTypeName()));
            for(State state: states){
                stateWriter.write(String.format("%s's GDP is %s \n", state.name, state.getGdp()));
            }
            stateWriter.write("----------------------------\n");
            stateWriter.close();
            System.out.println("Finsihed writing to state.txt");

            
            System.out.println("Writing to countrys.txt");
            countryWriter.write(String.format("Generated %s objects \n", countries.get(0).getClass().getTypeName()));
            for(Country country: countries){
                countryWriter.write(country + "\n");
            }
            countryWriter.write("----------------------------\n");
            Collections.sort(countries, comparePopulation.reversed());
            countryWriter.write(String.format("Sorting %s objects by population \n", countries.get(0).getClass().getTypeName()));
            for(Country country: countries){
                countryWriter.write(String.format("%s's population is %s \n", country.name, country.getPopulation()));
            }
            countryWriter.write("----------------------------\n");
            Collections.sort(countries, compareArea.reversed());
            countryWriter.write(String.format("Sorting %s objects by area \n", countries.get(0).getClass().getTypeName()));
            for(Country country: countries){
                countryWriter.write(String.format("%s's area is %s \n", country.name, country.getArea()));
            }
            countryWriter.write("----------------------------\n");
            Collections.sort(countries, compareGDP.reversed());
            countryWriter.write(String.format("Sorting %s objects by GDP(Trillion dollars) \n", countries.get(0).getClass().getTypeName()));
            for(Country country: countries){
                countryWriter.write(String.format("%s's GDP is %s \n", country.name, country.getGdp()));
            }
            countryWriter.write("----------------------------\n");
            countryWriter.close();
            System.out.println("Finsihed writing to country.txt");

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
