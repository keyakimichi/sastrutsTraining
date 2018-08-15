package org.seasar.sastruts.example.action;

import javax.annotation.Resource;

import org.seasar.sastruts.example.form.EmployeeForm;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class EmployeeAction {
	@Resource
	@ActionForm
	protected EmployeeForm employeeForm;

//	// 「/employee/list」でアクセス
//	@Execute(validator=false, urlPattern="list")
//	public String index() {
//		return "employee.jsp";
//	}

	// 「/employee/detail/文字列」でアクセス
	@Execute(validator=false, urlPattern="detail/{empId}")
	public String index() {
		return "employee.jsp";
	}
}
