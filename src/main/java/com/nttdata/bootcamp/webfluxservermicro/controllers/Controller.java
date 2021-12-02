package com.nttdata.bootcamp.webfluxservermicro.controllers;

import com.nttdata.bootcamp.webfluxservermicro.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.SynchronousSink;

import java.time.Duration;

@RestController
class PersonListController {

    @GetMapping(path="/person-list-1",produces="text/event-stream")
    public Flux<Person> personList1() {
        Flux<Person> personFlux = Flux.just(new Person("Pedro","Martinez",12)).delayElements(Duration.ofSeconds(1));
        return personFlux;
        // Implementar
    }


    @GetMapping(path="/person-list-2",produces="text/event-stream")
    public Flux<Person> personList2() {
        // Implementar
        Flux<Person> personFlux = Flux.just(new Person("Juan","Garcia",12)).delayElements(Duration.ofSeconds(2));
        return personFlux;
    }
    @GetMapping(path="/person-list-3",produces="text/event-stream")
    public Flux<Person> personList3() {
        // Implementar
        Flux<Person> personFlux = Flux.just(new Person("Ana","Fernandez",12)).delayElements(Duration.ofSeconds(3));
        return personFlux;
    }

    @GetMapping(path="/person-list-4",produces="text/event-stream")
    public Flux<Person> personList4 () {
        // Implementar
        Flux<Person> personFlux = Flux.just(new Person("Maria","Martinez",12)).delayElements(Duration.ofSeconds(4));
        return personFlux;
    }
}
