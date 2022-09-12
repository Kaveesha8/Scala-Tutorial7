object Question2 extends App{

    class Rational(x:Int,y:Int) {
        def numer = x
        def denom = y

        def neg() = Rational(-x,y)
     
        def +(that:Rational) = Rational(this.numer*that.denom+this.denom*that.numer,this.denom*that.denom)
        def -(that:Rational) = this + that.neg() 
        override def toString(): String = s"${this.numer}/${this.denom}"
    }

    var x = new Rational(3,4)
    var y = new Rational(5,8)
    var z = new Rational(2,7)

    
    println(x-y-z)





}