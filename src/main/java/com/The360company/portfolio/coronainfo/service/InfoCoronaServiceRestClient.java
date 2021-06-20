package com.The360company.portfolio.coronainfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.The360company.portfolio.coronainfo.model.CoronaIndonesia;
import com.The360company.portfolio.coronainfo.model.GlobalData;
import com.The360company.portfolio.coronainfo.model.Provinsi;

@Service
public class InfoCoronaServiceRestClient implements InfoCoronaService{

	private RestTemplate restTemplate;
	
	private String infoCoronaRestUrl;
	
	
	@Autowired
	public InfoCoronaServiceRestClient(RestTemplate theRestTemplate,
									  @Value("${kawalcorona.rest.url}") String theUrl) {
		
		this.restTemplate = theRestTemplate;
		this.infoCoronaRestUrl = theUrl;
	}
	
	private HttpEntity<String> settingUserAgentContentType(){

		HttpHeaders headers = new HttpHeaders();
		headers.add("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36");
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		return entity;
	}
	
	@Override
	public List<Provinsi> getProvinsi() {
		
		
		HttpEntity<String> entity = settingUserAgentContentType();
		
		String urlIndonesiaProvinsi = this.infoCoronaRestUrl + "/indonesia" + "/provinsi/";
		// make REST call
		ResponseEntity<List<Provinsi>> responseEntity = restTemplate.exchange(urlIndonesiaProvinsi, 
																			HttpMethod.GET, entity, 
																			new ParameterizedTypeReference<List<Provinsi>>() {});
		// get the list of province from response
		List<Provinsi> listProvinsi = responseEntity.getBody();
		
		return listProvinsi;
	}
	
	

	@Override
	public List<CoronaIndonesia> getCoronaIndonesia() {
		
		HttpEntity<String> entity = settingUserAgentContentType();
		
		String urlCoronaIndonesia = this.infoCoronaRestUrl + "/indonesia/";
		
		// make REST call
		ResponseEntity<List<CoronaIndonesia>> responseEntity = restTemplate.exchange(urlCoronaIndonesia, HttpMethod.GET, entity, new ParameterizedTypeReference<List<CoronaIndonesia>>() {});
		
		// get object CoronIndonesia from response
		List<CoronaIndonesia> coronaIndonesia = responseEntity.getBody();
		
		
		return coronaIndonesia;
	}

	@Override
	public List<GlobalData> getGlobalData() {
		
		HttpEntity<String> entity = settingUserAgentContentType();
	
		String urlGlobalData = this.infoCoronaRestUrl + "/";
		
		// make REST call
		ResponseEntity<List<GlobalData>> responseEntity = restTemplate.exchange(urlGlobalData, HttpMethod.GET, entity, new ParameterizedTypeReference<List<GlobalData>>() {});
		
		// get object Global from response
		List<GlobalData> globalData = responseEntity.getBody();
		
		
		
		return globalData;
	}

}
