package br.com.treinaweb.twprojects.core.repositories;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.twprojects.core.models.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @EntityGraph(attributePaths = "position")
    List<Employee> findAll();

    @EntityGraph(attributePaths = {"position", "address", "projects"})
    Optional<Employee> findById(Long id);
}
