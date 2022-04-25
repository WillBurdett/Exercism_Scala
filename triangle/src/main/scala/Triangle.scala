case class Triangle(a: Double, b: Double, c: Double) {

  // Set must all be unique, and so this calculates how many sides match/are unique
  val uniqueSides = (Set(a, b, c) - 0).size

  // valid triangle if :
  // - sum of each two sides > one side remaining
  // - Sides cannot all be 0
  def valid: Boolean = a + b > c && b + c > a && c + a > b

  def equilateral: Boolean = valid && uniqueSides == 1
  // the '<' accomodates more incase it is '1' ad therefore equilateral
  def isosceles: Boolean = valid && uniqueSides <= 2
  def scalene: Boolean = valid && uniqueSides == 3
}