package com.example.library.services;

import com.example.library.DTO.LoanDTO;
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

    public Loan saveLoan(LoanDTO loanDTO){
        loansDates(loanDTO);
        loanRules(loanDTO);
        loanDTO.setStatus(LoanStatus.BORROWED);
        Loan loan = mapLoanDtoToEntity(loanDTO);

        return loanRepository.save(loan);
    }

    public void deleteLoanById(Integer id ){
        loanRepository.deleteById(id);
    }

    public void loanRules(LoanDTO loanDTO){
        if (loanDTO.getReturnDate().isAfter(loanDTO.getDueDate())){
            loanDTO.setStatus(LoanStatus.LATE);
        }
        if (loanDTO.getLoanDate().isAfter(loanDTO.getDueDate())){
            throw new IllegalStateException("Invalid loan date, the due date must be after the loan date");
        }
        if(loanDTO.getStatus().equals(LoanStatus.BORROWED)){
            throw new IllegalStateException("The book was already borrowed");
        }
    }

    public Loan mapLoanDtoToEntity(LoanDTO loanDTO){
        Loan loan = new Loan();
        loan.setLoanDate(loanDTO.getLoanDate());
        loan.setDueDate(loanDTO.getDueDate());
        loan.setReturnDate(loanDTO.getReturnDate());
        loan.setStatus(loanDTO.getStatus());
        loan.setBorrower(loanDTO.getBorrower());
        loan.setBook(loanDTO.getBook());
        return loan;
    }

    public void loansDates(LoanDTO loanDTO){
        loanDTO.setLoanDate(LocalDate.now());
        loanDTO.setDueDate(LocalDate.now().plusMonths((1)));

    }
}
