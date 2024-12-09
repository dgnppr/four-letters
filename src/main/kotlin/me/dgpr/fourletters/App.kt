package me.dgpr.fourletters

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FourLettersApplication

fun main(args: Array<String>) {
    runApplication<FourLettersApplication>(*args)
}
