package br.com.treinaweb.twprojects.core.repositories;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;

import br.com.treinaweb.twprojects.core.models.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @NonNull
    @EntityGraph(attributePaths = "position")
    List<Employee> findAll();

    @NonNull
    @EntityGraph(attributePaths = { "position", "address", "projects" })
    Optional<Employee> findById(@NonNull Long id);

    List<Employee> findByPositionName(String positionName);

    List<Employee> findByPositionNameNot(String positionName);

    @Query("select e from Employee e where e.position.name = 'Gerente de Projeto'")
    List<Employee> findManagers();

    @Query("select e from Employee e where e.position.name <> 'Gerente de Projeto'")
    List<Employee> findTeam();
}
