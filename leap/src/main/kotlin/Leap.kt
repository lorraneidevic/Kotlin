class Year(val year: Int) {
  val isLeap: Boolean = when {
    isDivisableBy(400) -> true
    isDivisableBy(100) -> false
    isDivisableBy(4) -> true
    else -> false
  }

  fun isDivisableBy(divisor: Int): Boolean {
    return when{
      year % divisor == 0 -> true
      else -> false
    }
  }
}