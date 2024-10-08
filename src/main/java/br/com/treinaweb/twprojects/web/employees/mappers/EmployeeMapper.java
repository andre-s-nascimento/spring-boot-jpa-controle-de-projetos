package br.com.treinaweb.twprojects.web.employees.mappers;

import br.com.treinaweb.twprojects.core.models.Employee;
import br.com.treinaweb.twprojects.web.employees.dto.EmployeeDetails;
import br.com.treinaweb.twprojects.web.employees.dto.EmployeeForm;
import br.com.treinaweb.twprojects.web.employees.dto.EmployeeListItem;

public interface EmployeeMapper {
    
    Employee toEmployee(EmployeeForm employeeForm);

    EmployeeForm toEmployeeForm(Employee employee);

    EmployeeListItem toEmployeeListItem(Employee employee);

    EmployeeDetails toEmployeeDetails(Employee employee);
}
