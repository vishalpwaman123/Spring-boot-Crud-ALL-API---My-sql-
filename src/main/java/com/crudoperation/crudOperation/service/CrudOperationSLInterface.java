package com.crudoperation.crudOperation.service;

import com.crudoperation.crudOperation.entities.requestmodel.EmployeeRequestModel;
import com.crudoperation.crudOperation.entities.responsemodel.EmployeeResponseModel;

public interface CrudOperationSLInterface {
	
	public EmployeeResponseModel postoperation(EmployeeRequestModel employeeRequestModel);

}
