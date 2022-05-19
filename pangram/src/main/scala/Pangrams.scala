object Pangrams {

  def isPangram(input: String): Boolean = {
    val formattedInput = input.replaceAll("\\s", "").toLowerCase.filter(_.isLetter)
    val arrayOfFormattedInput = formattedInput.split("")

    var filteredToLettersOccuringOnce: List[String] = List()

    for(letter <- arrayOfFormattedInput){
      if (!filteredToLettersOccuringOnce.contains(letter)){
        filteredToLettersOccuringOnce = filteredToLettersOccuringOnce :+ letter
      }
    }
    val result = filteredToLettersOccuringOnce.length == 26

   return  result
  }

}


