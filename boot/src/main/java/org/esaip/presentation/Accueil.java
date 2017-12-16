package org.esaip.presentation;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.esaip.dao.DirecteurDAO;
import org.esaip.dao.EtudiantDAO;
import org.esaip.dao.InformationDAO;
import org.esaip.dao.ProblemeDAO;
import org.esaip.entity.*;

@Controller
public class Accueil {

	@Autowired
	private InformationDAO information;
	@Autowired
	private DirecteurDAO directeur;
	@Autowired
	private EtudiantDAO etudiant;
	@Autowired
	private ProblemeDAO probleme;
	
	@RequestMapping("/welcome")
	public String welcome(Model model) {
		return "welcome";
	}
	
	@RequestMapping("/gestionInformation")
	public String gestion(@RequestParam("directeurId") long directeurId, @RequestParam("id") long id, Model model) {
		DirecteurEntite dir = directeur.directeurId(id);
		model.addAttribute("directeur", dir);
	
		InformationEntite info = information.informationId(id);
		model.addAttribute("info", info);
		return "gestionInformation";
	}
	
	@RequestMapping(params = "modifier", value = "/directeur", method = RequestMethod.POST)
	public String modifierInfo(@RequestParam(name = "description") String description, @RequestParam(name = "ID") long ID,
			Model model) {
		information.modificationInformation(ID, description);
	
		List<EtudiantEntite> ListEtudiant = etudiant.allEtudiant();
		model.addAttribute("etudiant", ListEtudiant);
	
		List<InformationEntite> listeInformation = information.allInformation();
		model.addAttribute("message", listeInformation);
		DirecteurEntite dir = directeur.directeurId(ID);
		model.addAttribute("directeur", dir);
	
		List<ProblemeEntite> listPb = probleme.allPb();
		model.addAttribute("problemes", listPb);
		return "directeur";
	
	}
	
	@RequestMapping(params = "supprimer", value = "/directeur", method = RequestMethod.POST)
	public String supprimerInfo(@RequestParam(name = "ID") long id, Model model) {
		information.supprimerInformation(id);
	
		List<EtudiantEntite> ListEtudiant = etudiant.allEtudiant();
		model.addAttribute("etudiant", ListEtudiant);
	
		List<InformationEntite> listeInformation = information.allInformation();
		model.addAttribute("message", listeInformation);
		DirecteurEntite dir = directeur.directeurId(id);
		model.addAttribute("directeur", dir);
	
		List<ProblemeEntite> listPb = probleme.allPb();
		model.addAttribute("Problemes", listPb);
		return "directeur";
	
	}
	
	@RequestMapping("/dirEtab")
	public String dirConnection(Model model) {
		List<DirecteurEntite> listDirecteur = directeur.allDirecteur();
		model.addAttribute("directeur", listDirecteur);
		return "dirConnection";
	}
	
	@RequestMapping(params = "connection", value = "/directeur", method = RequestMethod.POST)
	public String Dir(@RequestParam(name = "DirId") long id, Model model) {
	
		List<EtudiantEntite> listEtudiant = etudiant.allEtudiant();
		model.addAttribute("etudiant", listEtudiant);
	
		List<InformationEntite> listeInformation = information.allInformation();
		model.addAttribute("message", listeInformation);
		DirecteurEntite dir = directeur.directeurId(id);
		model.addAttribute("directeur", dir);
	
		List<ProblemeEntite> listPb = probleme.allPb();
		model.addAttribute("problemes", listPb);
		return "directeur";
	}
	
	@RequestMapping(value = "/directeur")
	public String Dirr(@RequestParam("dirId") long dirId, @RequestParam("pbId") long pbId, Model model) {
	
		List<InformationEntite> listInformation = information.allInformation();
		model.addAttribute("message", listInformation);
		DirecteurEntite dir = directeur.directeurId(dirId);
		model.addAttribute("directeur", dir);
	
		List<EtudiantEntite> listEtudiant = etudiant.allEtudiant();
		model.addAttribute("etudiant", listEtudiant);
	
		probleme.supprimer(pbId);
	
		List<ProblemeEntite> listPb = probleme.allPb();
		model.addAttribute("Problemes", listPb);
		return "directeur";
	}
	
	@RequestMapping(params = "insert", value = "/directeur", method = RequestMethod.POST)
	public String dirAjout(@RequestParam("ID") long id, @RequestParam(name = "description") String contenu, Model model) {
		DirecteurEntite dir = directeur.directeurId(id);
		information.insert(dir, contenu);
	
		List<EtudiantEntite> listEtudiant = etudiant.allEtudiant();
		model.addAttribute("etudiant", listEtudiant);
	
		List<InformationEntite> listInfo = information.allInformation();
		model.addAttribute("message", listInfo);
		model.addAttribute("directeur", dir);
	
		List<ProblemeEntite> listPb = probleme.allPb();
		model.addAttribute("Problemes", listPb);
		return "directeur";
	}
	
	@RequestMapping(params = "limite", value = "/directeur", method = RequestMethod.POST)
	public String dirAjout(@RequestParam("ID") long id, @RequestParam(name = "etudiantID") long etudiantID,
			@RequestParam(name = "limite") long limite, Model model) {
		DirecteurEntite dir = directeur.directeurId(id);
		EtudiantEntite etu = etudiant.etudiantId(etudiantID);
	
		List<EtudiantEntite> listEtudiant = etudiant.allEtudiant();
		model.addAttribute("etudiant", listEtudiant);
	
		List<ProblemeEntite> listPb = probleme.allPb();
		model.addAttribute("problemes", listPb);
	
		List<InformationEntite> list = information.allInformation();
		model.addAttribute("message", list);
		model.addAttribute("directeur", dir);
		return "directeur";
	}
	
	@RequestMapping("/etudiantConnection")
	public String etudiantConnection(Model model) {
		List<EtudiantEntite> listEtudiant = etudiant.allEtudiant();
		model.addAttribute("etudiant", listEtudiant);
		return "etudiantConnection";
	}
	
	@RequestMapping(params = "connection", value = "/information", method = RequestMethod.POST)
	public String information(@RequestParam(name = "etudiantId") long id, Model model) {
	
		EtudiantEntite etu = etudiant.etudiantId(id);
		
		model.addAttribute("etudiant", etu);
		DirecteurEntite dir = directeur.directeurGeneral();
		List<InformationEntite> listeInfo = information.infoByDirecteur(dir);
		model.addAttribute("message", listeInfo);
	
		// récupérations des problèmes
		List<ProblemeEntite> listPb = probleme.allPb();
		model.addAttribute("problemes", listeInfo);
		return "information";
	
	}
}


