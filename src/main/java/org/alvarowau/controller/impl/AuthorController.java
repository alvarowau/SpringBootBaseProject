package org.alvarowau.controller.impl;

import org.alvarowau.controller.base.BaseControllerImpl;
import org.alvarowau.model.Author;
import org.alvarowau.service.impl.AuthorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST para manejar operaciones CRUD relacionadas con los autores.
 * Extiende la implementación base {@link BaseControllerImpl} para reutilizar
 * la lógica de manejo de entidades.
 *
 * @author Alvaro-Wau
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/authors")
public class AuthorController extends BaseControllerImpl<Author, AuthorServiceImpl> {
}
