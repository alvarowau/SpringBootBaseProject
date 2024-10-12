package org.alvarowau.service.impl;

import org.alvarowau.model.Person;
import org.alvarowau.repository.PersonRepository;
import org.alvarowau.service.base.BaseServiceImpl;
import org.alvarowau.service.interfaces.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementación del servicio {@link IPersonService} para gestionar
 * operaciones relacionadas con la entidad {@link Person}.
 * <p>
 * Esta clase extiende de {@link BaseServiceImpl} y proporciona la
 * lógica de negocio específica para {@link Person}.
 * </p>
 *
 * @author Alvaro-Wau
 */
@Service
public class PersonServiceImpl extends BaseServiceImpl<Person, Long> implements IPersonService {

    @Autowired
    private PersonRepository personRepository;

    /**
     * Constructor que inicializa el servicio con el repositorio de personas.
     *
     * @param personRepository el repositorio a utilizar para las operaciones de acceso a datos
     */
    public PersonServiceImpl(PersonRepository personRepository) {
        super(personRepository); // Asegúrate de pasar el repositorio aquí
    }
}
