package com.tina.personalfinancetrackerapi.transaction.internal;

import com.tina.personalfinancetrackerapi.budget.BudgetServiceApi;
import com.tina.personalfinancetrackerapi.transaction.TransactionServiceApi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionServiceApi {

    private final BudgetServiceApi budgetServiceApi;
}
