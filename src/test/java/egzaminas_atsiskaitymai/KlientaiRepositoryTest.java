package egzaminas_atsiskaitymai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;

import org.junit.jupiter.api.Test;

/**
* <h1>Duomenų bazės klientų repositorijos testas</h1>
* klase skirta klientų lentelės duomenų issaugojimui, nuskaitymui, salinimui patestuoti
* <p>
* atliekami visi būtini CRUD testai
* 
* @author  Zara Ali
* @version 1.0
* @since   2021-03-31 
*/
@SpringBootTest
public class KlientaiRepositoryTest {
	
	   @Autowired
	    private KlientaiRepository klientai_repository;
	   
	    /**
	     * tikrinamas Klientu informacijos issaugojimas
	     */
	    @Test
	    public void testSaveGetKlientai() {

	        																			     // System.out.println (" starting here test ! ");    	
	        Klientai klientai = new Klientai( 0, "Šilas", 0 );
	        Klientai client = klientai_repository.save(klientai);
	        // Klientai client_as = klientai_repository.findByPav("Šilas");
	        																			     // System.out.println (" kt1 : " + produkt.getId() );        
	        assertNotNull(klientai);
	        																			     // System.out.println (" kt2 ! ");        
	        assertNotNull(client);        
	        																			     // System.out.println (" kt3 ! ");        
	        assertEquals(client.getPav(), klientai.getPav());
	        																				 // System.out.println (" kt4 ! ");   
	        																				 // -- neveiks kt4 nespaudina .. 
	        assertEquals(client.getFlag_fizinis(), klientai.getFlag_fizinis());
	        																				 // System.out.println (" kt5 ! ");      
	        
	        klientai_repository.deleteById(client.getId());				  
	        																		         // System.out.println (" ending here test ! ");
	    }
	    
	    /**
	     * tikriname ar nuskaitomas Klientų sarasas
	     */	    
	    @Test   
	    public void testFindAllKlientai() {
	        assertNotNull(klientai_repository.findAll());
	    }
	    
	    /**
	     * tikriname ar galima pasalinti pagal pavadinimą
	     */		    
	    @Test    
	    public void deleteFoundedByName() {
	        																			// System.out.println (" kt6 ! ");       
	        Klientai klientai = new Klientai( 0, "Šilas", 0 );
	        Klientai client = klientai_repository.save(klientai);       
			klientai_repository.delete( client );                  					    // -- pagal pavyzdį neveikia  :(  
	        client = klientai_repository.findByPav("Šilas");
	        assertEquals( client, null );		
	    }  
	    
	    /**
	     * tikriname ar alima pasalinti pagal id
	     */		   
	    @Test
	    public void deletByKlientaiIdTest() {
	    	
			Klientai client_as = null;
	        Klientai klientai = new Klientai( 0, "Šilas", 0 );
	        Klientai client = klientai_repository.save(klientai);
	        Integer id_client = client.getId();
	        klientai_repository.deleteById(id_client);
	        Optional <Klientai> found = klientai_repository.findById ( id_client );
	        
			if ( found.isPresent() ) {
				
				   client_as = found.get();
			}
	        assertEquals( client_as, null );        
	    }   	

}
