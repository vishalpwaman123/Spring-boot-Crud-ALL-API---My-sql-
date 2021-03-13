package com.crudoperation.crudOperation.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudoperation.crudOperation.entities.requestmodel.EmployeeRequestModel;

public interface CrudOperationRLInterface extends JpaRepository<EmployeeRequestModel, Long> {

}
