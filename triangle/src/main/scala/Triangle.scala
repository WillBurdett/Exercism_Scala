case class Triangle (a: Any, b: Any, c: Any){
  def equilateral(): Boolean = if (a == b && b == c) true else false
  def isosceles(): Boolean = if (a == b && b == c) true else false
  def scalene(): Boolean = if (a == b && b == c) false else true
}