package spring.jvargas.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.jvargas.sfgpetclinic.model.Speciality;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
