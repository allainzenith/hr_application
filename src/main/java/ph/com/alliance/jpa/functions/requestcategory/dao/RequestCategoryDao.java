package ph.com.alliance.jpa.functions.requestcategory.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ph.com.alliance.jpa.entity.RequestCategory;

@Repository
public interface RequestCategoryDao extends JpaRepository<RequestCategory, Integer>{
	
	@Query(value="select * from jumpstartprogram2023.request_category inner join jumpstartprogram2023.employee on employee.empID = request_category.default_assignee", nativeQuery = true)
	List<Object[]> joinEmployeeandCategory();

}
