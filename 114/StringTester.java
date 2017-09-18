public class StringTester
{
    // instance variables - replace the example below with your own
    private int x;
    private String weatherCondition;
    
    /**
     * Constructor for objects of class StringTester
     */
    public static void main()
    {
        
        String weatherCondition = "severe thunderstorms";
        int length = weatherCondition.length( );
        
        
        System.out.println(length);

        System.out.println(weatherCondition.substring(0,length));
        System.out.println(WeatherConditionals.getWeatherAdvice(101, "snow"));
        
        System.out.println(WeatherConditionals.getHikingAdvice(9, 6, 50, "sunny"));
    }
}
