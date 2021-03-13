package com.crudoperation.crudOperation.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crudoperation.crudOperation.entities.requestmodel.EmployeeRequestModel;
import com.crudoperation.crudOperation.entities.responsemodel.EmployeeResponseModel;
import com.crudoperation.crudOperation.service.CrudOperationSLInterface;

@RestController
public class Controller {
	
	public CrudOperationSLInterface crudOperationInterface; 

	@PostMapping("/postOperation")
	public ResponseEntity<EmployeeResponseModel> postoperation(@RequestBody EmployeeRequestModel employeeRequestModel){
		try {
			
			EmployeeResponseModel employeeResponseModel = this.crudOperationInterface.postoperation(employeeRequestModel);
			if(employeeResponseModel != null) {
				return ResponseEntity.status(HttpStatus.OK)
				        .body(employeeResponseModel);
						//new ResponseEntity<>(Data=employeeResponseModel,HttpStatus.OK);
			}else {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				        .body(null);
			}
			
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
}
