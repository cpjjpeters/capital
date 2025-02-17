package ipeters.capital.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/* carlpeters created on 17/02/2025 inside the package - ipeters.capital.entity */
@Data
@Entity
@Table(name = "PERSON")
public class PersonJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ADDRESS")
    private String address;

    public PersonJpaEntity() {
    }

    public PersonJpaEntity(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
