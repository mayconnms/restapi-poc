package br.com.gjc.restapi.restapipoc.controler;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/anuncio")
public class Anuncio {

	@RequestMapping(method = RequestMethod.GET, value="/test", produces = MediaType.APPLICATION_JSON_VALUE)
	public String test() throws Exception {
		return "test";
	}
	
}
