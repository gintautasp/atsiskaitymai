package egzaminas_atsiskaitymai;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AtaskaitosController {

	
	@RequestMapping(path="/skolininkai", method={ RequestMethod.GET, RequestMethod.POST })
    public String skolininkai(@RequestParam(name="pav", required=false, defaultValue="") String pav
			, @RequestParam(name="flag_fizinis", required=false, defaultValue="0") String flag_fizinis
			, @RequestParam(name="flag_juridinis", required=false, defaultValue="0") String flag_juridinis	
			, @RequestParam(name="flag_visi", required=false, defaultValue="0") String flag_visi						
			, @RequestParam(name="ieskoti", required=false, defaultValue="neieskoti") String ieskoti			
			, Model model) {
		
        model.addAttribute("lst_menu", Meniu.values() ); 
		
		return "skolininkai";
	}
}
