object Etl extends App {

  def transform(legacyMap: Map[Int, Seq[String]]): Map[String, Int] = {

    // map to save new values to
    var result: Map[String, Int] = Map()

    // iterate over maps getting keys and values
    for((k, v) <- legacyMap){

        // iterate over the Seq[String] found in the Map for each key(Int)
        // indices provides the index
        for (letter <- v.indices){
          // append the result to the existing map
          // WARNING: this will replace any value with the same key
          // However, that did not matter in this instance
          result += (v(letter).toString.toLowerCase -> k)
        }
      }
    // return the Map each of the new key/value pairs have been added
    result
  }
}