import scala.util.matching.Regex

object Hamming extends App {
  def distance(a: String, b: String): Some[Int] = {

    var totalDifferences: Int = 0;
    for (i <- a.split("").indices) if (a.split("")(i) != b.split("")(i)) totalDifferences+=1
    Some(totalDifferences)
  }
}