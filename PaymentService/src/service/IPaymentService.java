package service;
import java.text.ParseException;
import java.util.List;

import model.Contract;
import model.Installment;

public interface IPaymentService {

    Contract processContract(Contract contract, int installments) throws ParseException;

}
