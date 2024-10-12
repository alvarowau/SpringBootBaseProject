package org.alvarowau.service.impl;

import org.alvarowau.model.Author;
import org.alvarowau.repository.AuthorRepository;
import org.alvarowau.repository.BaseRepository;
import org.alvarowau.service.base.BaseServiceImpl;
import org.alvarowau.service.interfaces.IAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementación del servicio {@link IAuthorService} para gestionar
 * operaciones relacionadas con la entidad {@link Author}.
 * <p>
 * Esta clase extiende de {@link BaseServiceImpl} y proporciona la
 * lógica de negocio específica para {@link Author}.
 * </p>
 *
 * @author Alvaro-Wau
 */
@Service
public class AuthorServiceImpl extends BaseServiceImpl<Author, Long> implements IAuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    /**
     * Constructor que inicializa el servicio con el repositorio de autores.
     *
     * @param repository el repositorio a utilizar para las operaciones de acceso a datos
     */
    public AuthorServiceImpl(BaseRepository<Author, Long> repository) {
        super(repository);
    }
}
