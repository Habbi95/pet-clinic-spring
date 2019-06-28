package spring.jvargas.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.jvargas.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
