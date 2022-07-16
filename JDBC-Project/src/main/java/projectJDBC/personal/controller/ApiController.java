package projectJDBC.personal.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import projectJDBC.personal.RequestResponse.AddModelElementRequest;
import projectJDBC.personal.RequestResponse.GetListOfModelElemetsResponse;
import projectJDBC.personal.RequestResponse.GetModelElementResponse;
import projectJDBC.personal.RequestResponse.ResponseBase;
import projectJDBC.personal.model.Model;
import projectJDBC.personal.services.Services;

@RestController
public class ApiController {

	@Autowired
	Services services;
	
	@ResponseBody
	@GetMapping(value="api/getModelElement/{modelElementId}", produces=MediaType.APPLICATION_JSON_VALUE)
	public GetModelElementResponse getModelElement(@PathVariable("modelElementId")Integer modelElementId) {
		GetModelElementResponse responseBase=new GetModelElementResponse();
		
	try {
		Model model=services.getModelElement(modelElementId);
		responseBase.setSimpleData(model);
		responseBase.setCode("OK");
	} catch (Exception e) {
		responseBase.setCode("KO");
		responseBase.setDescr(e.getMessage());
	}
	return responseBase;	
	}
	
	@ResponseBody
	@GetMapping(value = "api/getListOfModelElemets", produces=MediaType.APPLICATION_JSON_VALUE)
	public GetListOfModelElemetsResponse getListOfModelElemets() {
		GetListOfModelElemetsResponse response=new GetListOfModelElemetsResponse();
		
		try {
			ArrayList<Model>listOfModel=services.getListOfModelElemets();
			response.setSimpleData(listOfModel);
			response.setCode("OK");
		} catch (Exception e) {
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
		return response;
	}
	
	@ResponseBody
	@GetMapping(value = "api/addModelElement", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseBase addModelElement(@RequestBody AddModelElementRequest date) {
		ResponseBase responseBase=new ResponseBase();
		
		try {
			Model model=new Model(date.getModelElementId(),date.getModelElementName());
			services.addModelElement(model);
			responseBase.setCode("OK");
		} catch (Exception e) {
			responseBase.setCode("KO");
		}
		return responseBase;
	}
	
	
	
}
