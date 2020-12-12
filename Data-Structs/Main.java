import java.io.FileReader;
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject;
import org.json.simple.parser.*; 
public class Main {
    @SuppressWarnings("unchecked")
    public static void main (String[] args) throws Exception{
        try{
            //create all the cities, then create the states, then create the countries
            //Object cityJSON = new JSONParser().parse(new FileReader("inputs/city.json"));
            //Object StateJSON = new JSONParser().parse(new FileReader("inputs/state.json"));
            Object countryJSON = new JSONParser().parse(new FileReader("inputs/country.json"));


            JSONArray countryList = (JSONArray) countryJSON;
            //countryList.forEach(country -> Country.parseData((JSONObject)country));
            for(int i = 0; i < countryList.size(); i++){
                JSONObject country = countryList.getJSONObject(i);
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
