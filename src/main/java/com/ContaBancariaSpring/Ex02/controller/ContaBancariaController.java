package com.ContaBancariaSpring.Ex02.controller;

import com.ContaBancariaSpring.Ex02.model.ContaBancariaModel;
import com.ContaBancariaSpring.Ex02.model.calculosBancarios.CalculosFactory;
import com.ContaBancariaSpring.Ex02.service.ContaBancariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contas")

public class ContaBancariaController {

    @Autowired
    private ContaBancariaService contaBancariaService;

    @GetMapping
    public List<ContaBancariaModel> buscaTudo(){
    return contaBancariaService.buscaTudo();
    }

    @GetMapping(path = "/{id}")
    public Optional<ContaBancariaModel> buscaId(@PathVariable Long id){
        return contaBancariaService.buscaId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ContaBancariaModel cadastraConta(@RequestBody ContaBancariaModel contaBancariaModel) {
        return contaBancariaService.cadastraConta(contaBancariaModel);
    }

    @PutMapping(path = "/{id}")
    public ContaBancariaModel alteraConta(@RequestBody ContaBancariaModel contaBancariaModel){
        return contaBancariaService.alteraConta(contaBancariaModel);

    }

    @DeleteMapping(path = "/{id}")
    public void deletaConta(@PathVariable Long id){
        contaBancariaService.deletaConta(id);
    }


}
