object Question3 extends App{

    case class Account(accno:String,bal:Double) {
        var Accno = accno
        var Balance = bal

        def withdrawals(amount:Double) = this.Balance = this.Balance - amount
        def deposits(amount:Double) = this.Balance = this.Balance + amount

        def transfer(that:Account,amount:Double) = {this.withdrawals(amount); that.deposits(amount)}

        override def toString(): String = s"Account number: ${this.Accno}   Balance: ${this.Balance}"

    }


    var account1 = Account("001", 45000)
    var account2 = Account("002", 25000)

    println("Before transfer")
    println(account1)
    println(account2)

    account2.transfer(account1,5000)

    println("After transfer")
    println(account1)
    println(account2)






}