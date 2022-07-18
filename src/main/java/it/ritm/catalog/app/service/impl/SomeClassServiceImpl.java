package it.ritm.catalog.app.service.impl;

import it.ritm.catalog.app.dao.SomeClass;
import it.ritm.catalog.app.repository.SomeClassRepository;
import it.ritm.catalog.app.service.SomeClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@RequiredArgsConstructor
@Service
public class SomeClassServiceImpl implements SomeClassService {

    private final SomeClassRepository someClassRepository;

    public SomeClass findByKeyAndValue(String key, String value) {
        return someClassRepository.findByKeyAndValue(key, value).orElseThrow(
            () -> new NoSuchElementException("Ресурс с запрошенными параметрами не найден!")
        );
    }

}
