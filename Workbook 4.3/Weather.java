public class Weather {
    public static void main(String[] args) {
        double noon = 77;          //temperature at noon in fahrenheit.
        double evening = 61;       //temperature during the evening in fahrenheit
        double midnight = 55;      //temperature at midnight in fahrenheit

        //Task 3 - Call the printTemperatures function. 
        double temp1 = fahrenheitToCelsius(noon);
        printTemperatures(noon, temp1);
        double temp2 = fahrenheitToCelsius(evening);
        printTemperatures(evening, temp2);
        double temp3 = fahrenheitToCelsius(midnight);
        printTemperatures(midnight, temp3);
        
        
    }


    //Task 1: Make a function here. See the doc comments below. 

    /**
     * Function name: fahrenheitToCelsius - converts fahrenheit to celcius
     * @param fahrenheit (double)
     * @return celsius (double)
     * 
     * Inside the function:
     * 1. returns the temperature in celcius. C = (F - 32) * 5/9. 
     */
    public static double fahrenheitToCelsius(double fahrenheit){
        double celcius = (fahrenheit - 32) * 5 / 9;
        return celcius;
    }

     
    //Task 2: Make a function here. See the doc comments below. 

    /**
     * Function name: printTemperatures – prints both temperature values. 
     * @param fahrenheit (double)
     * 
     * Inside the function: 
     *  1. prints: F: <temperature in fahrenheit>.
     *  2. prints: C: <temperature in celsius> . 
     */
    public static void printTemperatures(double fahrenheit, double temperature){
        System.out.println(fahrenheit + " degrees in fahrenheit is equivalent to " + temperature + " in celsius.");

    }
}