package egzaminas_atsiskaitymai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* <h1>Egzamino uzduotis</h1>
* programa ledžia suvesti kliento informacija, jam pateiktas saskaitas ir atsiskaitymus pagal ssskaitas
* jos pagalba galima sudaryti neatsiskaiciusiu daugiau ne tam tikra suma klientų sąrasus
* <p>
* Programa skiria fizinius ir juridinius klientus
* 
* @author  Zara Ali
* @version 1.0
* @since   2021-03-31 
*/
@SpringBootApplication
public class AtsiskaitymaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtsiskaitymaiApplication.class, args);
	}

}
