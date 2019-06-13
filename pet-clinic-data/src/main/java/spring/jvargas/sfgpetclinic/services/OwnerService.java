package spring.jvargas.sfgpetclinic.services;

import spring.jvargas.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
