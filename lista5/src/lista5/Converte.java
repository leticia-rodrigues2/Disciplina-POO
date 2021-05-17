package lista5;

	public class Converte {


		public static double celsiusParaFahrenheit(double celsius) {
			return (9*celsius/5)+32;
		}

		public static double fahrenheitParaCelsius(double fahrenheit) {
		return (fahrenheit-32)*+5/9;
			  }

		public static double celsiusParaKelvin(double celsius) {
			return celsius +273.15;
			  }

		public static  double kelvinParaCelsius (double kelvin) {
			return kelvin - 273.15;
			  }
		public static  double kelvinparaFahrenheit (double kelvin) {
			var celsius = Converte.kelvinParaCelsius(kelvin);
			return Converte.celsiusParaFahrenheit(celsius);
			  }


		}


