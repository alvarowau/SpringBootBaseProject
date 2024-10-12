package org.alvarowau.controller.base;

import org.alvarowau.model.base.Base;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

/**
 * Interfaz base para controladores que manejan operaciones CRUD
 * para entidades que extienden de {@link Base}.
 * <p>
 * Esta interfaz define los métodos básicos para obtener, guardar,
 * actualizar y eliminar entidades.
 * </p>
 *
 * @param <E> el tipo de entidad que extiende de {@link Base}
 * @param <ID> el tipo de identificador de la entidad
 *
 * @author Alvaro-Wau
 */
public interface BaseController<E extends Base, ID extends Serializable> {

    /**
     * Obtiene todas las entidades.
     *
     * @return una respuesta que contiene la lista de todas las entidades
     */
    ResponseEntity<?> getAll();

    /**
     * Obtiene una entidad por su ID.
     *
     * @param id el ID de la entidad a obtener
     * @return una respuesta que contiene la entidad correspondiente
     */
    ResponseEntity<?> getOne(@PathVariable ID id);

    /**
     * Guarda una nueva entidad.
     *
     * @param entity la entidad a guardar
     * @return una respuesta que contiene la entidad guardada
     */
    ResponseEntity<?> save(@RequestBody E entity);

    /**
     * Actualiza una entidad existente.
     *
     * @param id el ID de la entidad a actualizar
     * @param entity la entidad con los datos actualizados
     * @return una respuesta que contiene la entidad actualizada
     */
    ResponseEntity<?> update(@PathVariable ID id, @RequestBody E entity);

    /**
     * Elimina una entidad por su ID.
     *
     * @param id el ID de la entidad a eliminar
     * @return una respuesta indicando el resultado de la operación
     */
    ResponseEntity<?> delete(@PathVariable ID id);
}
