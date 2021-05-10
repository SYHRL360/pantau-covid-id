package com.The360company.portfolio.coronainfo.service;

import java.util.List;

import com.The360company.portfolio.coronainfo.model.CoronaIndonesia;
import com.The360company.portfolio.coronainfo.model.Provinsi;

public interface InfoCoronaService {

	public List<Provinsi> getProvinsi();
	
	public List<CoronaIndonesia> getCoronaIndonesia();
	
}
