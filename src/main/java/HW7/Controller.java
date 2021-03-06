package HW7;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static HW7.Period.NOW;

public class Controller {
    private WeatherModel weatherModel = new AccuweatherModel();
    private Map<Integer, Period> variants = new HashMap<>();

    public Controller(){
        variants.put(1, NOW);
        variants.put(5, Period.FIVE_DAYS);
    }
    public void getWeather (String userInput, String selectedCity) throws IOException {
        Integer option = Integer.parseInt(userInput);

        switch (variants.get(option)) {
            case NOW:
                weatherModel.getWeather(selectedCity, NOW);
                break;
            case FIVE_DAYS:
                throw new IOException("Метод еще не реализован!");
        }
    }

}