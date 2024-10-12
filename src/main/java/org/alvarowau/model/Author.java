package org.alvarowau.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.alvarowau.model.base.Base;
import org.alvarowau.model.base.BasePerson;

/**
 * Entidad que representa un autor en el sistema.
 * Hereda de {@link Base} para incluir un identificador único.
 * <p>
 * Esta clase incluye detalles básicos de la persona a través de {@link BasePerson}
 * y una biografía del autor.
 * </p>
 *
 * Anotaciones JPA:
 * - {@code @Entity}: Indica que esta clase es una entidad gestionada por JPA.
 * - {@code @Table}: Define el nombre de la tabla "authors" en la base de datos.
 * - {@code @Embedded}: Incluye los detalles de la persona embebidos en esta entidad.
 * - {@code @Column}: Configura propiedades específicas de las columnas en la base de datos.
 * </p>
 *
 * Anotaciones de Lombok:
 * - {@code @Getter} y {@code @Setter}: Generan automáticamente los métodos getter y setter para los campos.
 * - {@code @AllArgsConstructor}: Genera un constructor con todos los parámetros.
 * - {@code @NoArgsConstructor}: Genera un constructor sin parámetros.
 *
 * @author Alvaro-Wau
 */
@Entity
@Table(name = "authors")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Author extends Base {

    /**
     * Detalles básicos de la persona asociados con el autor.
     * Esta información se gestiona a través de la clase {@link BasePerson}, que está embebida en esta entidad.
     */
    @Embedded
    private BasePerson personDetails;

    /**
     * Biografía del autor.
     * Mapeada a la columna "biography" en la base de datos, con un límite de 1500 caracteres.
     */
    @Column(name = "biography", length = 1500)
    private String biography;
}
