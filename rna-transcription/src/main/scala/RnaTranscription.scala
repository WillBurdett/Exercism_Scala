object RnaTranscription {
  def toRna(enteredRna: String): Option[String] = {

    if (enteredRna.isEmpty) return None

    // val validRna: String = enteredRna.getOrElse(None)

    val mapOfTranscribedRnas: Map[String, String] = Map("G" -> "C", "C" -> "G", "T" -> "A", "A" -> "U")

    // val arrayOfEnteredRna: Array[String] = for(letter <- validRna.split("")) yield mapOfTranscribedRnas.get(letter)


    // val transcribedString = arrayOfEnteredRna.mkString("")

    Some(mapOfTranscribedRnas(enteredRna))

  }
}