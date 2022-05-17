import scala.annotation.tailrec

object Grains {
  def square(squareNumRequested: Int): Option[Int] = {
    if (squareNumRequested < 1) None
    @tailrec
    def doubleCurrentGrains(totalGrains: Int, currentSquare: Int): Option[Int] = {
      if (currentSquare == squareNumRequested) return Some(totalGrains)
      else doubleCurrentGrains(totalGrains * 2, currentSquare + 1)
    }
    doubleCurrentGrains(1, 1)
  }

  val total = square(64)
}