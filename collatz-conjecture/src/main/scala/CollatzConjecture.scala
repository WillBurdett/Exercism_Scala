import scala.annotation.tailrec

object CollatzConjecture{
  def steps(num: Int): Option[Int] = {
    if (num <= 0) return None
    @tailrec
    def calculator(calcInput: Int, calcIteration: Int): Option[Int] = {
      calcInput match {
        case 1 => Some(calcIteration)
        case _ => if (isEven(calcInput)) calculator(calcInput / 2, calcIteration + 1) else calculator((calcInput * 3) + 1, calcIteration + 1)
      }
    }
    calculator(num, 0)
  }
  def isEven(num: Int): Boolean = if (num % 2 == 0) true else false
}