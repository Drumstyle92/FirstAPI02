package co.develhope.FirstAPI02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Drumstyle92
 * Class initialized to controller for Spring Boot.
 */
@RestController
@RequestMapping("/factorial")
public class FactorialController {
    /**
     * @param id Number that we insert in the get.
     * @return Returns the factorial of the id.
     * Get method which, upon entering a given integer, gives its factorial as an answer.
     */
    @GetMapping(value = "/{id}")
public String getFactorialNumber(@PathVariable() Integer id){

    Integer numberFactorial = 1;

    for(Integer i = 1;i<=id;i++){

            numberFactorial = numberFactorial * i;
    }

    return "The number is " + id + " and its factorial is " + numberFactorial;

    }

 }
