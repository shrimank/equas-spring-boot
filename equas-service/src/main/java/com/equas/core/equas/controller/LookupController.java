package com.equas.core.equas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.equas.core.equas.domain.Lookup;
import com.equas.core.equas.service.LookupService;
import com.equas.core.equas.util.EquasResponse;

@RestController
@RequestMapping("/api/v1/lookup")
public class LookupController {

	@Autowired
	private LookupService lookupService;

	/**
	 * 
	 * @param lookupCode
	 * @return
	 */
	@GetMapping(value="",produces = "application/json")
	public ResponseEntity<EquasResponse> getLookupByCode(@RequestParam("code") final String lookupCode) {
		EquasResponse response = new EquasResponse();
		HttpStatus httpStatus = HttpStatus.OK;
		try {
			Optional<List<Lookup>> lookupList = lookupService.findByCode(lookupCode);
			if (lookupList.isPresent()) {
				response.setStatus("200");
				response.setBody(lookupList.get());
			} else {
				response.setStatus("404");
				response.setDescription("No Records Found.");
				httpStatus = HttpStatus.NOT_FOUND;
			}
		} catch (Exception e) {
			response.setStatus("500");
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return new ResponseEntity<EquasResponse>(response, httpStatus);
	}

}
