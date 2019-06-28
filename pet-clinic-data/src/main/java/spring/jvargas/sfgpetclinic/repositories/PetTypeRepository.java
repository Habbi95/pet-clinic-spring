package spring.jvargas.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.jvargas.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
