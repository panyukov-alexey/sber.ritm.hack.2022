package it.ritm.catalog.app.controller;

import it.ritm.catalog.app.dto.SomeClassDTO;
import it.ritm.catalog.app.mapper.SomeClassMapper;
import it.ritm.catalog.app.service.SomeClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/someClass")
@RequiredArgsConstructor
public class SomeClassController {

    private final SomeClassService someClassService;
    private final SomeClassMapper someClassMapper;

    @GetMapping("/{key}/{value}")
    public SomeClassDTO findByKeyAndValue(@PathVariable String value, @PathVariable String key) {
        return someClassMapper.mapDomainToDto(someClassService.findByKeyAndValue(key, value));
    }

}
