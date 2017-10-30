package org.esaip.presentation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {

	@RequestMapping("/etudiant")
	public String welcome() {
		return "etudiant";
	}

	@RequestMapping("/dirEtude")
	public String dirEtude() {
		return "dirEtude";
	}
	@RequestMapping("/dirEtab")
	public String dirEtab() {
		return "dirEtab";
	}
	@RequestMapping("/consultationProbleme")
	public String consultationProbleme() {
		return "consultationProbleme";
	}
	
	@RequestMapping("/creationProbleme")
	public String creationProbleme() {
		return "creationProbleme";
	}
	
	@RequestMapping("/historiqueInformation")
	public String historiqueInformation() {
		return "historiqueInformation";
	}
	
	@RequestMapping("/creationInformation")
	public String creationInformation() {
		return "creationInformation";
	}
}