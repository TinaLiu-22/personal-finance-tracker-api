package com.tina.personalfinancetrackerapi.transaction.internal;

import com.tina.personalfinancetrackerapi.budget.BudgetApi;
import com.tina.personalfinancetrackerapi.transaction.TransactionApi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class TransactionController implements TransactionApi {

    private final BudgetApi budgetApi;
}
