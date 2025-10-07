package com.example.library.services;

import com.example.library.models.Loan;
import com.example.library.models.LoanStatus;
import com.example.library.repositories.LoanRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class LoanService {
    private final LoanRepository loanRepository;

    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    //Get all Loans
    public List<Loan> getAllLoan(){
        return loanRepository.findAll();
    }

    public Optional<Loan> findLoanById(Integer id){
    return loanRepository.findById(id);
    }

    public Loan saveLoan(Loan loan){
        return loanRepository.save(loan);
    }

    public void deleteLoanById(Integer id ){
        loanRepository.deleteById(id);
    }
}
