object Question1 extends App{

    class Rational(x:Int,y:Int) {
        def numer = x
        def denom = y

        def neg() = Rational(-x,y)
        
        override def toString(): String = s"${this.numer}/${this.denom}"
    }

    var rational = new Rational(5,6)

    println(rational)
    println(rational.neg())





}