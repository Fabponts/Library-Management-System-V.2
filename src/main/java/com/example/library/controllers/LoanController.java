package com.example.library.controllers;

import com.example.library.models.Loan;
import com.example.library.services.LoanService;
import jakarta.persistence.PostUpdate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/loan")
public class LoanController {
    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    //Show all loans made
    @GetMapping
    public List<Loan> getAllLoans() {
        return loanService.getAllLoan();
    }

    //Get loans by id
    @GetMapping("/{id}")
    public Optional<Loan> getLoanById(@PathVariable Integer id) {
        return loanService.findLoanById(id);
    }

    //Save a new loan
    @PostMapping
    public Loan saveLoan(@RequestBody Loan loan){
        return loanService.saveLoan(loan);
    }

    //Delete a Loan by id
    @DeleteMapping("/{id}")
    public void deleteLoanById(@PathVariable Integer id){
        loanService.deleteLoanById(id);
    }
}
