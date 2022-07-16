package projectJDBC.personal.model;

public class Model {
	
	private Integer modelElementId;
	private String modelElementName;
	
	//costruttore
	public Model(Integer modelElementId,String modelElementName) {
		
		this.modelElementId=modelElementId;
		this.modelElementName=modelElementName;
		
	}
	
	
	public Integer getModelElementId() {
		return modelElementId;
	}
	public void setModelElementId(Integer modelElementId) {
		this.modelElementId = modelElementId;
	}
	public String getModelElementName() {
		return modelElementName;
	}
	public void setModelElementName(String modelElementName) {
		this.modelElementName = modelElementName;
	}
	

 
	
	
	
	
}
