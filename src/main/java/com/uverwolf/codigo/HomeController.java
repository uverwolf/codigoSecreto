package com.uverwolf.codigo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		
		return "index.jsp";
	}
	
	@RequestMapping(value = "/codigo",method = RequestMethod.POST)
	
	public String codigo(@RequestParam(value="bushido")String bushido, RedirectAttributes redirectAttributes) {
		if(bushido.equals("compacion") || bushido.equals("lealtad")|| bushido.equals("coraje")|| bushido.equals("veracidad")||	bushido.equals("honor")) {
			return "codigo.jsp";
		}else {		
	        redirectAttributes.addFlashAttribute("error", "te falta disciplina");
	        return "redirect:/";
			}
		}
	

}
