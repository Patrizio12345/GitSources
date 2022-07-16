package projectJDBC.personal.RequestResponse;

import java.util.ArrayList;

import projectJDBC.personal.model.Model;

public class GetListOfModelElemetsResponse extends ResponseBase{

	private ArrayList<Model>models=new ArrayList<>();

	public ArrayList<Model> getModels() {
		return models;
	}

	public void setModels(ArrayList<Model> models) {
		this.models = models;
	}
	
	
	
}
