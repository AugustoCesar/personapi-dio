package com.dio.personapi.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Person {

    private Long id;
    private String firstName;
    private String lastName;
    private String cpf;
    private LocalDate birthDate;
    private List<Phone> phones;
}
