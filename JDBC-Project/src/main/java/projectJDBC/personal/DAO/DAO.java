package projectJDBC.personal.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import projectJDBC.personal.model.Model;
import projectJDBC.personal.repository.RepositoryProject;

@Component
public class DAO {
	
	@Autowired
   RepositoryProject repositoryProject;
	

	public Model getModelElement(Integer modelElementId) {
		return repositoryProject.getModelElement(modelElementId);
	}
	
	public List<Model>getListOfModelElemets(){
		return repositoryProject.getListOfModelElemets();
	}
	
	public void addModelElement(Model model) {
	    repositoryProject.addModelElement(model);
	}
	
}
