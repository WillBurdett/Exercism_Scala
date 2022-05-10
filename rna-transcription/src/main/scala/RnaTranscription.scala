object RnaTranscription {
  def toRna(enteredRna: String): Option[String] = {

    if (enteredRna.isEmpty) return None

    val mapOfTranscribedRnas: Map[String, String] = Map("G" -> "C", "C" -> "G", "T" -> "A", "A" -> "U")

    Some(enteredRna.split("").map(e => mapOfTranscribedRnas(e)).mkString(""))

  }
}