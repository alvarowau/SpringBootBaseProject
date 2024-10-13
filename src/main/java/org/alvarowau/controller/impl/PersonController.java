package org.alvarowau.controller.impl;

import org.alvarowau.controller.base.BaseControllerImpl;
import org.alvarowau.model.Person;
import org.alvarowau.service.impl.PersonServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST para manejar operaciones CRUD relacionadas con las personas.
 * Extiende la implementación base {@link BaseControllerImpl} para reutilizar
 * la lógica de manejo de entidades.
 *
 * @author Alvaro-Wau
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/persons")
public class PersonController extends BaseControllerImpl<Person, PersonServiceImpl> {

    public PersonController(PersonServiceImpl service) {
        super(service);
    }
}
