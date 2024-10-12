package org.alvarowau.repository;

import org.alvarowau.model.base.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * Repositorio base genérico para todas las entidades que extiendan de {@link Base}.
 * Proporciona operaciones CRUD estándar a través de {@link JpaRepository}.
 * <p>
 * Esta interfaz es una clase genérica, donde:
 * <ul>
 *   <li>{@code E} es el tipo de entidad que extiende de {@link Base}.</li>
 *   <li>{@code ID} es el tipo de la clave primaria de la entidad, que debe ser {@link Serializable}.</li>
 * </ul>
 * </p>
 * <p>
 * Anotaciones:
 * - {@code @NoRepositoryBean}: Indica que esta interfaz no debe ser instanciada directamente, sino que debe ser extendida por otros repositorios concretos.
 * </p>
 *
 * @param <E>  el tipo de la entidad que extiende de {@link Base}
 * @param <ID> el tipo de la clave primaria de la entidad, debe ser {@link Serializable}
 *
 * @author Alvaro-Wau
 */
@NoRepositoryBean
public interface BaseRepository<E extends Base, ID extends Serializable> extends JpaRepository<E, ID> {
}
