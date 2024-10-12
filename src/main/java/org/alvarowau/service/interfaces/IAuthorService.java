package org.alvarowau.service.interfaces;

import org.alvarowau.model.Author;
import org.alvarowau.service.base.BaseService;

/**
 * Servicio específico para gestionar operaciones relacionadas con la entidad {@link Author}.
 * <p>
 * Esta interfaz extiende de {@link BaseService} y hereda sus métodos
 * CRUD básicos para la entidad {@link Author}.
 * </p>
 *
 * @author Alvaro-Wau
 */
public interface IAuthorService extends BaseService<Author, Long> {
}
