package org.alvarowau.repository;

import org.alvarowau.model.Author;
import org.springframework.stereotype.Repository;

/**
 * Repositorio específico para la entidad {@link Author}.
 * Extiende de {@link BaseRepository} para proporcionar las operaciones CRUD básicas.
 * <p>
 * Anotaciones:
 * - {@code @Repository}: Indica que esta interfaz es un componente de Spring y representa un repositorio de datos.
 * </p>
 *
 * @author Alvaro-Wau
 */
@Repository
public interface AuthorRepository extends BaseRepository<Author, Long> {
}
