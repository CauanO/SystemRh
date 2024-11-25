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

public class VagaController {
	private VagaRepository vr;
	private CandidatoRopository cr;
}
