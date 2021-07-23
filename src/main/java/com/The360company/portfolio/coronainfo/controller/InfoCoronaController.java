package com.The360company.portfolio.coronainfo.controller;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.The360company.portfolio.coronainfo.model.CoronaIndonesia;
import com.The360company.portfolio.coronainfo.model.GlobalData;
import com.The360company.portfolio.coronainfo.model.Provinsi;
import com.The360company.portfolio.coronainfo.service.InfoCoronaService;

@Controller
public class InfoCoronaController {

	// need to inject our infocorona service
	private InfoCoronaService infoCoronaService;
	
	@Autowired
	public InfoCoronaController(InfoCoronaService infoCoronaService) {
		this.infoCoronaService = infoCoronaService;
	}
	
	@GetMapping("/covid-id")
	public String listProvinsi(Model model) {
		
		// get list province from the service
		List<Provinsi> theProvinsi = infoCoronaService.getProvinsi();
		// get CoronaIndonesia "String" from the service
		List<CoronaIndonesia> coronaIndonesia = infoCoronaService.getCoronaIndonesia();
		// get GlobalData from the service
		List<GlobalData> globalData = infoCoronaService.getGlobalData();
		
		//  get current date and time
		Instant nowUtc = Instant.now();
		ZoneId asiaJakarta = ZoneId.of("Asia/Jakarta");
		
		ZonedDateTime nowAsiaJakarta = ZonedDateTime.ofInstant(nowUtc, asiaJakarta);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMMM-uuuu HH:mm");
		
		String currentDateTime = dtf.format(nowAsiaJakarta);
		
		// add the list province to the model
		model.addAttribute("listProvinsi", theProvinsi);
		// add the CoronaIndonesia to the model
		model.addAttribute("coronaIndonesia", coronaIndonesia);
		// add the Global to the model
		model.addAttribute("globalData", globalData);
		// add current date time to model
		model.addAttribute("currentDateTime", currentDateTime);
		
		return "corona-info";
	}
}
