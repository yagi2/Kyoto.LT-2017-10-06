data class Rational(val numerator: Int, val denominator: Int) {
    operator fun plus(that: Rational) =
        Rational(
            numerator * that.denominator + that.numerator * denominator,
            denominator * that.denominator
        )
}

val half = Rational(1, 2)
val quator = Rational(1, 4)

println(half + quator)