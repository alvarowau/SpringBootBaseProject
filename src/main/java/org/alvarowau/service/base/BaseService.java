package org.alvarowau.service.base;

import org.alvarowau.model.base.Base;

import java.io.Serializable;
import java.util.List;

/**
 * Servicio base genérico para gestionar operaciones CRUD sobre entidades que extienden de {@link Base}.
 * <p>
 * Esta interfaz define métodos comunes para todas las entidades, incluyendo las operaciones de
 * búsqueda, guardado, actualización y eliminación.
 * </p>
 *
 * @param <T>  el tipo de la entidad que extiende de {@link Base}
 * @param <ID> el tipo de la clave primaria de la entidad, debe ser {@link Serializable}
 *
 * @author Alvaro-Wau
 */
public interface BaseService<T extends Base, ID extends Serializable> {

    /**
     * Obtiene una lista de todas las entidades.
     *
     * @return una lista con todas las entidades
     * @throws Exception si ocurre algún error durante la operación
     */
    List<T> findAll() throws Exception;

    /**
     * Busca una entidad por su identificador.
     *
     * @param id el identificador de la entidad
     * @return la entidad encontrada o {@code null} si no se encuentra
     * @throws Exception si ocurre algún error durante la operación
     */
    T findById(ID id) throws Exception;

    /**
     * Guarda una nueva entidad en la base de datos.
     *
     * @param entity la entidad a guardar
     * @return la entidad guardada
     * @throws Exception si ocurre algún error durante la operación
     */
    T save(T entity) throws Exception;

    /**
     * Actualiza una entidad existente.
     *
     * @param id     el identificador de la entidad a actualizar
     * @param entity los nuevos datos de la entidad
     * @return la entidad actualizada
     * @throws Exception si ocurre algún error durante la operación
     */
    T update(ID id, T entity) throws Exception;

    /**
     * Elimina una entidad por su identificador.
     *
     * @param id el identificador de la entidad a eliminar
     * @return {@code true} si la entidad se eliminó con éxito, {@code false} en caso contrario
     * @throws Exception si ocurre algún error durante la operación
     */
    boolean delete(ID id) throws Exception;
}
