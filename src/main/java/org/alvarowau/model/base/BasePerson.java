package org.alvarowau.model.base;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Clase que representa los atributos básicos de una persona.
 * Se utiliza como una clase embebible (componente) en otras entidades.
 * <p>
 * Esta clase contiene los campos {@code firstName} y {@code lastName}, que almacenan el
 * nombre y el apellido de una persona respectivamente.
 * </p>
 * <p>
 * Anotaciones de Lombok:
 * - {@code @Getter} y {@code @Setter}: Generan automáticamente los métodos getter y setter para los campos.
 * - {@code @AllArgsConstructor}: Genera un constructor con parámetros para todos los campos.
 * - {@code @NoArgsConstructor}: Genera un constructor sin parámetros.
 * </p>
 *
 * Anotaciones JPA:
 * - {@code @Embeddable}: Marca la clase como un componente embebible dentro de otras entidades.
 * - {@code @Column}: Define el nombre de la columna en la base de datos para los campos.
 *
 * @author Alvaro-Wau
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class BasePerson {

    /**
     * Primer nombre de la persona.
     * Mapeado a la columna "first_name" en la base de datos.
     */
    @Column(name = "first_name")
    private String firstName;

    /**
     * Apellido de la persona.
     * Mapeado a la columna "last_name" en la base de datos.
     */
    @Column(name = "last_name")
    private String lastName;
}
