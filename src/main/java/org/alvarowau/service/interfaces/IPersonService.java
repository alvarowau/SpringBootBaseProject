package org.alvarowau.service.interfaces;

import org.alvarowau.model.Person;
import org.alvarowau.service.base.BaseService;

/**
 * Servicio específico para gestionar operaciones relacionadas con la entidad {@link Person}.
 * <p>
 * Esta interfaz extiende de {@link BaseService} y hereda sus métodos
 * CRUD básicos para la entidad {@link Person}.
 * </p>
 *
 * @author Alvaro-Wau
 */
public interface IPersonService extends BaseService<Person, Long> {
}
