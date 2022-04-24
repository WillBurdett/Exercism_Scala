case class Triangle (a: Any, b: Any, c: Any){
  def equilateral(): Boolean = if (a == b && b == c && a != 0) true else false
  def isosceles(): Boolean = if ((a == b && b == c && a != 0) || (a == b || b == c | a == c)) true else false
  def scalene(): Boolean = if (a == b && b == c) false else true
}