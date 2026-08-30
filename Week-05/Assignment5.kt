package com.pes.lib

open class BankAccounts(
    val accName: String,
    val accNumber: Int,
    var balance: Int = 0
) {

    open fun displayInfo() {
        println("Account Name: $accName")
        println("Account Number: $accNumber")
        println("Balance: $balance")
    }
}

class SavingAccounts(
    accName: String,
    accNumber: Int,
    var interestRate: Float
) : BankAccounts(accName, accNumber) {

    fun credit(amount: Int) {
        balance += amount
    }

    fun debit(amount: Int) {
        balance -= amount
    }

    override fun displayInfo() {
        println("Account Name: $accName")
        println("Account Number: $accNumber")
        println("Balance: $balance")
        println("Interest Rate: $interestRate")
    }
}

fun main() {
    val account = SavingAccounts("John", 1234, 5.0f)

    account.credit(1000)
    account.debit(200)

    account.displayInfo()
}
