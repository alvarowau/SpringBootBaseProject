package org.alvarowau.model.base;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * Clase base que proporciona un identificador común para todas las entidades que extiendan de ella.
 * Esta clase utiliza el mapeo de superclase en JPA para compartir el ID entre diferentes entidades.
 * Implementa {@link Serializable} para permitir que los objetos de esta clase sean serializables.
 * <p>
 * Anotaciones de Lombok:
 * - {@code @Getter} y {@code @Setter}: Generan automáticamente los métodos getter y setter para todos los campos.
 * - {@code @AllArgsConstructor}: Genera un constructor con un parámetro para cada campo.
 * - {@code @NoArgsConstructor}: Genera un constructor sin parámetros.
 * </p>
 *
 * @author Alvaro-Wau
 */
@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Base implements Serializable {

    /**
     * Identificador único de la entidad. Generado automáticamente por la estrategia de identidad.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
