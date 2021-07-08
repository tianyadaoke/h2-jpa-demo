package com.florhispania.h2demo.web;

import com.florhispania.h2demo.bean.onetoone.Country;
import com.florhispania.h2demo.bean.onetoone.Flag;
import com.florhispania.h2demo.dao.onetoone.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class CountryFlagController {
    @Autowired
    CountryRepository countryRepository;
    @PostMapping("/country")
    @Transactional
    public void addCountry(){
        Flag flag = new Flag();
        flag.setFlagUrl("https://google.es/flag/spain");

        Country country  = new Country();
        country.setCountryName("Spain");
        country.setFlag(flag);

        countryRepository.save(country);
    }
    @GetMapping("/countries")
    public List<Country> getAll(){
        return countryRepository.findAll();
    }
}
