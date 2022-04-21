
object Hamming extends App {

  // in functional programming 'null' returns are avoided
  // so what do we do instead? We use Option/Some/None
  def distance(a: String, b: String): Option[Int] = {
    if (a.trim.length != b.trim.length) {
      return None
    }
    var totalDifferences: Int = 0;
    for (i <- a.split("").indices) if (a.split("")(i) != b.split("")(i)) totalDifferences+=1
    Some(totalDifferences)
  }
}

  // aaylward's solution!
  object Hamming2 {
    def distance2(first: String, second: String): Option[Int] = {
      if (first.length != second.length) {
        return None
      }
      // zip creates a tuple out of first and second.
      // p._1 is referring to the first first element of the tuple - not a partial function!
      Some(first zip second count (p => p._1 != p._2))
    }
  }