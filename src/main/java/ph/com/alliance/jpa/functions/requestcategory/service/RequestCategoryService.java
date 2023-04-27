package ph.com.alliance.jpa.functions.requestcategory.service;

import java.util.List;
import java.util.Map;

public interface RequestCategoryService {
	Object getAllCategories();
//	List<Object[]> joinEmployeeandCategory();
	List<Map<String, Object>> joinEmployeeandCategory();
}
