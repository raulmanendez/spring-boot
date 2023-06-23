package learn.spring.data.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import learn.spring.data.rest.repository.entity.Department;

@RepositoryRestResource
public interface DepartmentRestRepository extends JpaRepository<Department, Integer> {

}
