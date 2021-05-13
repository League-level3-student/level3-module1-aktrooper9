package _07_California_Weather;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * OBJECTIVE:
 * 1. Create a program that allows the user to search for the weather
 * conditions of a given city in California. Use the example program below
 * and the Utilities class inside this project to get the temperature data
 * from a day in December 2020.
 * Example: User: Encinitas
 *          Program: Encinitas is Overcast with a tempeature of 59.01 °F
 * 
 * 2. Create a way for the user to specify the weather condition and then
 * list the cities that have those conditions.
 * Example: User: Mostly Cloudy
 *          Program: Long Beach, Pomona, Oceanside, ...
 * 
 * 3. Create a way for the user to enter a minimum and maximum temperature
 * and then list the cities that have temperatures within that range
 * Example: User: minimum temperature °F = 65.0, max temperature °F = 70.0
 *          Program: Fortana, Glendale, Escondido, Del Mar, ...
 *          
 * EXTRA:
 * Feel free to add pictures for specific weather conditions or a thermometer
 * for the temperature. Also If you want your program to get the current day's
 * temperature, you can get a free API key at: https://openweathermap.org/api 
 */

public class CaliforniaWeather implements ActionListener {
	 JFrame frame = new JFrame();
	 JPanel panel = new JPanel();
	 JTextField input = new JTextField(20);
	 JButton findweather = new JButton("find weather");
	 String city;
	 JLabel label = new JLabel();
     HashMap<String, WeatherData> weatherData = Utilities.getWeatherData();
    void start() {
        
        // All city keys have the first letter capitalized of each word

 
        frame.setVisible(true);
   	 panel.setVisible(true);
   	 panel.add(input);
   	 panel.add(label);
   	 panel.add(findweather);
   	 frame.add(panel);
   	 frame.pack();
   	 findweather.addActionListener(this);
 
       
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed.equals(findweather)) {
			city = input.getText();
			String cityName = Utilities.capitalizeWords( city );
			
			WeatherData datum = weatherData.get(cityName);
        
        if( datum == null ) {
           label.setText("Unable to find weather data for: " + cityName);
        } else {
        	 label.setText(cityName + " is " + datum.weatherSummary + " with a temperature of " + datum.temperatureF + " F");
        }
        frame.pack();
		}
	}
}
