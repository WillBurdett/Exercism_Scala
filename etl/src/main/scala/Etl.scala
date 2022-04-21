object Etl extends App {

  def transform(legacyMap: Map[Int, Seq[String]]): Map[String, Int] = {

    // map to save new values to
    var result: Map[String, Int] = Map()

    // iterate over maps getting keys and values
    for((k, v) <- legacyMap){
      println(v)
        for (letter <- v.indices){
          result += (v(letter).toString.toLowerCase -> k)
        }
      }
    result
  }
}