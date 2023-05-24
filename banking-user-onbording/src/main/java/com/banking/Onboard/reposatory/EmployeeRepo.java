package com.banking.Onboard.reposatory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.Onboard.model.Employee;



public interface EmployeeRepo extends JpaRepository <Employee, Long>	{

}
