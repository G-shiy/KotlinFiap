package org.fiap.classes

import classes.Person
import java.time.LocalDate


class Employee(name: String, birthDate: LocalDate, city: String): Person(name, birthDate, city) {
}