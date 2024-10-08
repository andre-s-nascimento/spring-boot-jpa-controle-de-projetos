package br.com.treinaweb.twprojects.web.employees.dto;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDetails {
    private Long id;

    private String name;

    private String email;

    private String phone;

    private String cpf;

    private LocalDate birthDate;

    private LocalDate hireDate;

    private LocalDate resignationDate;

    private String address;
}
