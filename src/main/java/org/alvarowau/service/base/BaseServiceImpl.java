package org.alvarowau.service.base;

import jakarta.transaction.Transactional;
import org.alvarowau.model.base.Base;
import org.alvarowau.repository.BaseRepository;

import java.io.Serializable;
import java.util.List;

/**
 * Implementación abstracta de {@link BaseService} que proporciona la lógica
 * común para las operaciones CRUD sobre entidades que extienden de {@link Base}.
 * <p>
 * Esta clase debe ser extendida por servicios específicos de entidades.
 * </p>
 *
 * @param <T>  el tipo de la entidad que extiende de {@link Base}
 * @param <ID> el tipo de la clave primaria de la entidad, debe ser {@link Serializable}
 *
 * @author Alvaro-Wau
 */
public abstract class BaseServiceImpl<T extends Base, ID extends Serializable> implements BaseService<T, ID> {

    protected BaseRepository<T, ID> repository;

    /**
     * Constructor que inicializa el repositorio.
     *
     * @param repository el repositorio a utilizar para las operaciones de acceso a datos
     */
    protected BaseServiceImpl(BaseRepository<T, ID> repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public T findById(ID id) throws Exception {
        return repository.findById(id)
                .orElseThrow(() -> new Exception("Entidad no encontrada con ID: " + id));
    }

    @Override
    @Transactional
    public T save(T entity) {
        return repository.save(entity);
    }

    @Override
    @Transactional
    public T update(ID id, T entity) throws Exception {
        if (!repository.existsById(id)) {
            throw new Exception("Entidad no encontrada con ID: " + id);
        }
        return repository.save(entity);
    }

    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        if (!repository.existsById(id)) {
            throw new Exception("Entidad no encontrada con ID: " + id);
        }
        repository.deleteById(id);
        return true;
    }
}
