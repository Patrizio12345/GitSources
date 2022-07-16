package projectJDBC.personal.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import projectJDBC.personal.DAO.DAO;
import projectJDBC.personal.model.Model;

@Service
public class Services {
	
	@Autowired
	DAO dao;

	public Model getModelElement(Integer modelElementId) {
		return dao.getModelElement(modelElementId);
	}
	
	public ArrayList<Model>getListOfModelElemets(){
		List<Model>modelList=dao.getListOfModelElemets();
		ArrayList<Model>modelArrayList=new ArrayList<Model>();
		modelArrayList.addAll(modelList);
		
		return modelArrayList;
	}
	
	@Transactional
	public void addModelElement(Model model) {
         dao.addModelElement(model);
	}
	
}
