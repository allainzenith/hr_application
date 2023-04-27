package ph.com.alliance.jpa.functions.requestcategory.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ph.com.alliance.jpa.entity.RequestCategory;
import ph.com.alliance.jpa.functions.requestcategory.dao.RequestCategoryDao;

@Service
public class RequestCategoryServiceImpl implements RequestCategoryService {
	
	@Autowired
	RequestCategoryDao requestCategoryDao;
	
	@Override
	public List<RequestCategory> getAllCategories() {
		// TODO Auto-generated method stub
		List<RequestCategory> tickets = requestCategoryDao.findAll();
		return tickets;
	}
	
//	@Override
//	public List<Object[]> joinEmployeeandCategory() {
//		// TODO Auto-generated method stub
//		List<Object[]> tickets = requestCategoryDao.joinEmployeeandCategory();
//		return tickets;
//	}


	@Override
	public List<Map<String, Object>> joinEmployeeandCategory() {
	    // TODO Auto-generated method stub
	    List<Object[]> rows = requestCategoryDao.joinEmployeeandCategory();
	    List<Map<String, Object>> data = new ArrayList<>();
	    for (Object[] row : rows) {
	        Map<String, Object> item = new HashMap<>();
	        item.put("categoryID", row[0]);
	        item.put("categoryname", row[1]);
	        item.put("description", row[2]);
	        item.put("default_assignee", row[3]);
	        item.put("empID", row[4]);
	        item.put("emp_role", row[5]);
	        item.put("name", row[6]);
	        item.put("email", row[7]);
	        item.put("password", row[8]);
	        item.put("password_hashed", row[9]);
	        item.put("department", row[10]);
	        data.add(item);
	    }
	    return data;
	}

	
}
