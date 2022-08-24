package com.ContaBancariaSpring.Ex02.model.calculosBancarios;

import com.ContaBancariaSpring.Ex02.model.ContaBancariaModel;

import java.math.BigDecimal;

public class DepositosFactory implements Calculos{

    @Override
    public BigDecimal calcularConta(ContaBancariaModel contaBancariaModel) {
        return contaBancariaModel.getValorTransacao().add(contaBancariaModel.getValorInicial());
    }
}
