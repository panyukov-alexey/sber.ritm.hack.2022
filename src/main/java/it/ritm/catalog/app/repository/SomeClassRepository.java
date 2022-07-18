package it.ritm.catalog.app.repository;

import it.ritm.catalog.app.dao.SomeClass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SomeClassRepository extends JpaRepository<SomeClass, Long> {

    Optional<SomeClass> findByKeyAndValue(String key, String value);

}
