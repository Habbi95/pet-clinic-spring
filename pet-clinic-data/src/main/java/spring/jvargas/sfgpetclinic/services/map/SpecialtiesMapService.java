package spring.jvargas.sfgpetclinic.services.map;

import spring.jvargas.sfgpetclinic.model.Speciality;
import spring.jvargas.sfgpetclinic.services.SpecialtiesService;

import java.util.Set;

public class SpecialtiesMapService extends AbstractMapService<Speciality, Long> implements SpecialtiesService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
