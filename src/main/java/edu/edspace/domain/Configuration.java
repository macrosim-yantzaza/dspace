package edu.edspace.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@Data
@Entity
@Table
public class Configuration implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 25, unique = true)
    private String code;
    private String name;
    private String value;
}
