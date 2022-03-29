package service;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.Contract;
import model.Installment;

public class PaypalService implements IPaymentService {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy");
    
    @Override
    public Contract processContract(Contract contract, int installmentsNumber) throws ParseException {        
        var installmentValue = contract.getValue() / installmentsNumber;
        for (int i = 1; i <= installmentsNumber; i++) {
            var value =  installmentValue + installmentValue * 0.01 * i;
            value = value + (value * 0.02);
            var installment = new Installment(simpleDateFormat.parse(String.format("%d/%d/%d", contract.getDate().getDate(), contract.getDate().getMonth() + i+1, contract.getDate().getYear())), value); 
            contract.getInstallments().add(installment);
        }        

        return contract;
        
    }

}
