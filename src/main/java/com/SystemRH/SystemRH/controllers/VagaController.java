package com.SystemRH.SystemRH.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.SystemRH.SystemRH.models.Cadidato;
import com.SystemRH.SystemRH.models.Vaga;
import com.SystemRH.SystemRH.repository.CandidatoRopository;
import com.SystemRH.SystemRH.repository.VagaRepository;

@Controller
public class VagaController {
	private VagaRepository vr;
	private CandidatoRopository cr;

	@RequestMapping(value = "/cadastrarVaga", method = RequestMethod.GET)
	public String form() {
		return "vaga/formVaga";
	}
	@RequestMapping(value = "/cadastrarVaga", method = RequestMethod.POST)
	public String form(@Valid Vaga vaga, BindingResult result, RedirectAttributes attributes) {
		 if (result.hasErrors()) {
			attributes.addFlashAttribute("mensagem", "Verifique os campos...");
			return "redirect:/cadastrarVaga"; 
		}
		vr.save(vaga);
		attributes.addFlashAttribute("mensagem", "Vaga cadastrada com sucesso!");
		return "redirect:/cadastrarVaga";
	}
	// LISTAR VAGAS
	@RequestMapping("/vagas")
	public ModelAndView listaVagas() {
		ModelAndView mv = new ModelAndView("vaga/listaVaga");
		Iterable<Vaga>vagas = vr.findAll();
		mv.addObject("vagas", vagas);
		return mv;
	}
	
	// DETALHES VAGA
	@RequestMapping(value = "/codigo", method = RequestMethod.GET)
	public ModelAndView detalhesVagas(@PathVariable("codigo") long codigo) {
		Vaga vaga = vr.findByCodigo(codigo);
		ModelAndView mv = new ModelAndView("vaga/detalhesVaga");
		mv.addObject("vaga", vaga);
		
		Iterable<Cadidato>cadidatos = cr.findByVaga(vaga);
		mv.addObject("caditados", cadidatos);
		
		return mv;
	}
}
