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
 * Entidad que representa una persona en el sistema.
 * Hereda de {@link Base} para proporcionar un identificador único.
 * <p>
 * Esta clase contiene los detalles básicos de la persona mediante {@link BasePerson}
 * y un campo adicional para el DNI (Documento Nacional de Identidad).
 * </p>
 *
 * Anotaciones JPA:
 * - {@code @Entity}: Marca esta clase como una entidad gestionada por JPA.
 * - {@code @Table}: Especifica el nombre de la tabla "persons" en la base de datos.
 * - {@code @Embedded}: Inserta los detalles básicos de la persona embebidos en esta entidad.
 * - {@code @Column}: Configura el mapeo del campo DNI a la columna correspondiente en la base de datos.
 *
 * Anotaciones de Lombok:
 * - {@code @Getter} y {@code @Setter}: Generan automáticamente los métodos getter y setter para los campos.
 * - {@code @AllArgsConstructor}: Genera un constructor con todos los parámetros.
 * - {@code @NoArgsConstructor}: Genera un constructor sin parámetros.
 *
 * @author Alvaro-Wau
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "persons")
public class Person extends Base {

    /**
     * Detalles básicos de la persona, tales como el nombre y apellido.
     * Esta información se almacena en una instancia embebida de {@link BasePerson}.
     */
    @Embedded
    private BasePerson personDetails;

    /**
     * DNI (Documento Nacional de Identidad) de la persona.
     * Mapeado a la columna "dni" en la base de datos.
     */
    @Column(name = "dni")
    private int dni;
}
