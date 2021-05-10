package com.The360company.portfolio.coronainfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.The360company.portfolio.coronainfo.model.CoronaIndonesia;
import com.The360company.portfolio.coronainfo.model.Provinsi;
import com.The360company.portfolio.coronainfo.service.InfoCoronaService;

@Controller
public class InfoCoronaController {

	// need to inject our infocorona service
	
	@Autowired
	private InfoCoronaService infoCoronaService;
	
	@GetMapping("/corona")
	public String listProvinsi(Model model) {
		
		// get list province from the service
		List<Provinsi> theProvinsi = infoCoronaService.getProvinsi();
		// get CoronaIndonesia from the service
		List<CoronaIndonesia> coronaIndonesia = infoCoronaService.getCoronaIndonesia();
		
		// add the list province to the model
		model.addAttribute("listProvinsi", theProvinsi);
		// add the CoronaIndonesia to the model
		model.addAttribute("coronaIndonesia", coronaIndonesia);
		
		return "info-corona";
	}
}
