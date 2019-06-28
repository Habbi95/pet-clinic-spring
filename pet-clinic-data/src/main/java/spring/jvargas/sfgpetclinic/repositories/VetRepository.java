package spring.jvargas.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.jvargas.sfgpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
