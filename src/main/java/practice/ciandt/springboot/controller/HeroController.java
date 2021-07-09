package practice.ciandt.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import practice.ciandt.springboot.domain.Hero;

import java.util.List;

@RestController
@RequestMapping("hero")
public class HeroController {
    @GetMapping(path = "list")
    public List<Hero> list() {
        return List.of(new Hero("Superman"), new Hero("Batman"));
    }
}
