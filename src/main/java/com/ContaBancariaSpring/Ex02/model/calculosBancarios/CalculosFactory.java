package com.ContaBancariaSpring.Ex02.model.calculosBancarios;

import java.math.BigDecimal;

public class CalculosFactory {

    public static Calculos tipoCalculo( String tipoCalculo){
        if(tipoCalculo.equalsIgnoreCase("DEPOSITO")){
            return new DepositosFactory();
        } else if (tipoCalculo.equalsIgnoreCase("SAQUE")) {
            return new SaquesFactory();
        }else {
            return null;
        }
    }
}
