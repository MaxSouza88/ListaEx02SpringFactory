package com.ContaBancariaSpring.Ex02.model.calculosBancarios;

import com.ContaBancariaSpring.Ex02.model.ContaBancariaModel;

import java.math.BigDecimal;

public interface Calculos {
    public BigDecimal calcularConta(ContaBancariaModel contaBancariaModel);
}

