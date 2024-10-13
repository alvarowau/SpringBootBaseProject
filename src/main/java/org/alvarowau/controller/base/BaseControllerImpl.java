package org.alvarowau.controller.base;

import org.alvarowau.model.base.Base;
import org.alvarowau.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Implementación base de un controlador REST para manejar operaciones CRUD
 * de entidades que extienden de {@link Base}.
 *
 * @param <E> el tipo de entidad que extiende de {@link Base}
 * @param <S> el tipo de servicio que maneja las entidades
 *
 * @author Alvaro-Wau
 */
public abstract class BaseControllerImpl<E extends Base, S extends BaseServiceImpl<E, Long>> implements BaseController<E, Long> {


    protected S service;

    public BaseControllerImpl(S service) {
        this.service = service;
    }

    /**
     * Obtiene todas las entidades.
     *
     * @return una respuesta que contiene la lista de todas las entidades,
     * o un mensaje de no contenido si no hay entidades registradas
     */
    @GetMapping
    public ResponseEntity<?> getAll() {
        try {
            List<E> entities = service.findAll();
            if (entities.isEmpty()) {
                return ResponseEntity.status(HttpStatus.NO_CONTENT)
                        .body(Map.of("message", "No hay entities registradas."));
            }
            return ResponseEntity.ok(entities); // 200 OK
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of("error", "Error al recuperar las entities", "cause", e.getMessage()));
        }
    }

    /**
     * Obtiene una entidad por su ID.
     *
     * @param id el ID de la entidad a obtener
     * @return una respuesta que contiene la entidad correspondiente
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        try {
            E entity = service.findById(id);
            return ResponseEntity.ok(entity);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Map.of("error", e.getMessage()));
        }
    }

    /**
     * Guarda una nueva entidad.
     *
     * @param entityResponse la entidad a guardar
     * @return una respuesta que contiene la entidad guardada
     */
    @PostMapping
    public ResponseEntity<?> save(@RequestBody E entityResponse) {
        try {
            E savedEntity = service.save(entityResponse);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedEntity);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of(
                            "error", "Error al guardar la entidad",
                            "status", "Por favor, vuelve a intentarlo más tarde",
                            "cause", e.getMessage()
                    ));
        }
    }

    /**
     * Actualiza una entidad existente.
     *
     * @param id el ID de la entidad a actualizar
     * @param entityResponse la entidad con los datos actualizados
     * @return una respuesta que contiene la entidad actualizada
     */
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody E entityResponse) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.update(id, entityResponse));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Map.of("error", e.getMessage()));
        }
    }

    /**
     * Elimina una entidad por su ID.
     *
     * @param id el ID de la entidad a eliminar
     * @return una respuesta indicando el resultado de la operación
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            if (service.delete(id)) {
                return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body(Map.of("error", "entidad no encontrada con ID: " + id));
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of("error", e.getMessage()));
        }
    }
}
