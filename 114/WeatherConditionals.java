public class WeatherConditionals
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class WeatherConditionals
     */
    public static boolean getWeatherAdvice(int temperature, String description)
    {
        //String YEY = (temperature + " " + "degrees" + " " + "and" + " " + description + ".");
        //return YEY;
        boolean windy = false;
        boolean error = false;
        String s = "snow";
        String w = "windy";
        if(description.indexOf(w) >= 0){
            windy = true;
        }

        else if(temperature > 30 && description.indexOf(w) >= 0){
            windy = true;
        }
        else if(temperature > 30){
            windy = false;
        }
        else if(temperature < 30){
            windy = true;
        }
        if(description.indexOf(s) >= 0 && temperature > 100){
            System.out.println("ERROR");
        }

        return windy;
    }

    public static String getHikingAdvice(int temperature, int windchill, int humidity, String description)
    {
        boolean goodToHike;
        goodToHike = false;

        boolean rightTemp;
        rightTemp = false;

        boolean rightWind;
        rightWind = false;

        boolean rightHumid;
        rightHumid = false;

        String result1;
        String result2;
        String result3;
        String result4;
        String result5;

        temperature = 0;
        windchill = 0;
        humidity = 0;
        result1 = "The Humidity is perfect and";
        result2 = "the Windchill is perfect and";
        result3 = "the Temperature is perfect";
        result4 = "it is not a good day for hiking";

        String bad;
        bad = "snow";

        if (description.indexOf(bad) >= 0 && temperature > 32) 
        {

            return "error";

        }

        if (temperature >= 50 && temperature <= 60)
        {
            rightTemp = true;
        } else {        
            rightTemp = false;
        }

        if (windchill <= 10) 
        {
            rightWind = true;
        } else {
            rightWind = false;
        }

        if (humidity <= 10)
        {
            rightHumid = true;
        } else {
            rightHumid = false;
        }

        if (rightHumid = false) {
            result1 = "The Humidity is not right and";
        }
        if (rightWind = false) {        
            result2 = "the wind chill is not right and";
        }
        if (rightTemp = false) {
            result3 = "the temperature is not right";
        }
        if ((rightHumid = true) && (rightTemp = true) && (rightWind = true))
        {
            result4 = "and it is a perfect day for hiking!";
        }

        result5 = result1 + " " + result2 + " " + result3 + " " + result4;

        return result5;
    }
}
