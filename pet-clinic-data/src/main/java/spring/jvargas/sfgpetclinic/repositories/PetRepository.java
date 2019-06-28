package spring.jvargas.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.jvargas.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
