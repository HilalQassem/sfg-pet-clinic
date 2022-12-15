package miniguru.springframework.sfgpetclinic.services;

import miniguru.springframework.sfgpetclinic.model.Owner;

/**
 * Created by jt on 7/18/18.
 */
public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastName);
}
