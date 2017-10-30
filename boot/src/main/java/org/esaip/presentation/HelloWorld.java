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
	@RequestMapping("/consultationDirecteurEtablissement")
	public String consultationDirecteurEtab() {
		return "consultationDirecteurEtab";
	}
}