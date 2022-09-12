object Question4 extends App{

    case class Account(accno:String,bal:Double) {
        var Accno = accno
        var Balance = bal

        def withdrawals(amount:Double) = this.Balance = this.Balance - amount
        def deposits(amount:Double) = this.Balance = this.Balance + amount

        def transfer(that:Account,amount:Double) = {this.withdrawals(amount); that.deposits(amount)}

        //Overide to string method to print the object in readable format
        override def toString(): String = s"Account number: ${this.Accno}   Balance: ${this.Balance}"

    }


    case class Bank() {
        var accounts:List[Account] = List()

        def addOneAccount(acc:Account) = this.accounts = this.accounts :+ acc
        def addaccounts(acc:Account*) = acc.foreach(addOneAccount(_))

        def negativeBalanceAccounts() = accounts.filter(_.Balance < 0)
        def sumOfAccounts() = accounts.reduce((x,y) => Account("",x.Balance+y.Balance))
        
        def interest(x:Account) = if (x.Balance<0 ) x.Balance*.1 else x.Balance*.05
        def calculateFinalBalances() = this.accounts = this.accounts.map( x => Account(x.Accno,x.Balance + interest(x)) )
    }

    var testBank = Bank()

    testBank.addaccounts(Account("001",25000),Account("002",-272), Account("003",645), Account("004",-345))

    println(testBank.negativeBalanceAccounts())
    println(testBank.sumOfAccounts().Balance)
    testBank.calculateFinalBalances()
    println(testBank.accounts)






}