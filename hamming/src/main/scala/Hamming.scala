
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