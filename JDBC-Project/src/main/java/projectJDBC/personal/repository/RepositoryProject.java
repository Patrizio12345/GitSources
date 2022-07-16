package projectJDBC.personal.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.stereotype.Repository;
import projectJDBC.personal.model.Model;

@Repository
public class RepositoryProject {

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Autowired
	private PlatformTransactionManager transactionManager;
	
	
	
	public Model getModelElement(Integer modelElementId) {
		
		MapSqlParameterSource parameterSource=new MapSqlParameterSource();
		parameterSource.addValue("elementoModelId",modelElementId);
		
		String query="select * from model where id= :elementoModelId";
			Model model=namedParameterJdbcTemplate.queryForObject(
				query, 
				parameterSource, 
				(rs, rowNum) ->new Model(rs.getInt("modelElementId"), rs.getString("modelElementName"))
				);
		
		return model;
	}
	
	public List<Model>getListOfModelElemets(){
		MapSqlParameterSource parameterSource=new MapSqlParameterSource();
		
		String query="select * from model";

		List<Model>modelList=namedParameterJdbcTemplate.query(
				query, 
				parameterSource,
				(rs, rowNum) ->new Model(rs.getInt("modelElementId"), rs.getString("modelElementName"))
				);
		return modelList;
	}
	
	public void addModelElement(Model model) {
		TransactionDefinition transactionDefinition=new DefaultTransactionDefinition();
		TransactionStatus transactionStatus=transactionManager.getTransaction(transactionDefinition);
		
		MapSqlParameterSource parameterSource=new MapSqlParameterSource();
		parameterSource.addValue("modelElementId", model.getModelElementId());
		parameterSource.addValue("modelElementName",model.getModelElementName());
		
		String query="insert into Model(id,name) VALUES (:modelElementId, :modelElementName)";
		
		try {
			namedParameterJdbcTemplate.update(query,parameterSource);
			transactionManager.commit(transactionStatus);
		} catch (DataAccessException e) {
			transactionManager.rollback(transactionStatus);
		}
	}
	
	
	//updateModel struttura uguale all'add, 
	//unica differenza nella query con "update Model set nome=:modelName where id=:modelElementId"
	
	
	//deleteModel struttura uguale all'add e all'update,
	//con la differenza che nell'attribute del public va' indicato l'id
    //il parameterSource sara' ovviamente esclusivo per l'id
	//la query "delete Model where id=:modelElementId"
	
}
