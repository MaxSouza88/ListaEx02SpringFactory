package com.ContaBancariaSpring.Ex02.service;

import com.ContaBancariaSpring.Ex02.model.ContaBancariaModel;
import com.ContaBancariaSpring.Ex02.model.calculosBancarios.CalculosFactory;
import com.ContaBancariaSpring.Ex02.repository.ContaBancariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ContaBancariaService {

    @Autowired
    private ContaBancariaRepository contaBancariaRepository;

    public List<ContaBancariaModel> buscaTudo(){
        return contaBancariaRepository.findAll();
    }

    public Optional<ContaBancariaModel> buscaId(Long codigo){
        return contaBancariaRepository.findById(codigo);
    }

    public ContaBancariaModel cadastraConta(ContaBancariaModel contaBancariaModel){

        BigDecimal resultado = CalculosFactory.tipoCalculo(contaBancariaModel.getTipoTransacao()).calcularConta(contaBancariaModel);
        contaBancariaModel.setValorFinal(resultado);

        return contaBancariaRepository.save(contaBancariaModel);
    }

    public ContaBancariaModel alteraConta(ContaBancariaModel contaBancariaModel){

        BigDecimal resultado = CalculosFactory.tipoCalculo(contaBancariaModel.getTipoTransacao()).calcularConta(contaBancariaModel);
        contaBancariaModel.setValorFinal(resultado);

        return contaBancariaRepository.save(contaBancariaModel);


    }

    public void deletaConta(Long id){
        contaBancariaRepository.deleteById(id);
    }

}
