package org.alvarowau.repository;

import org.alvarowau.model.Person;
import org.springframework.stereotype.Repository;

/**
 * Repositorio específico para la entidad {@link Person}.
 * Extiende de {@link BaseRepository} para heredar las operaciones CRUD básicas.
 * <p>
 * Anotaciones:
 * - {@code @Repository}: Indica que esta interfaz es un componente de Spring y representa un repositorio de datos.
 * </p>
 *
 * @author Alvaro-Wau
 */
@Repository
public interface PersonRepository extends BaseRepository<Person, Long> {
}
