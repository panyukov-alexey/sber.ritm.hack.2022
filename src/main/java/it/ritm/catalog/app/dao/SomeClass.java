package it.ritm.catalog.app.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static javax.persistence.GenerationType.IDENTITY;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "some_table")
public class SomeClass {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name = "key_text")
    private String key;

    @Column(name = "value_text")
    private String value;

}
