package com.knoldus.services

/**
 * Created by harmeet on 19/11/16.
 */
object TransactionService {

  def balanceDebit(balance: Double, debitAmount: Double) = balance - debitAmount

  def balanceCredit(balance: Double, creditAmount: Double) = balance + creditAmount
}
