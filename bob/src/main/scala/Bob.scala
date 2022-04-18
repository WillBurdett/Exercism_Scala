import scala.util.matching.Regex

object Bob extends App{
  def response(statement: String): String = {
    var inputToArr = statement.replaceAll(" ", "").split("")
    if(isAllCaps(statement) && containsLetters(statement) && inputToArr(inputToArr.length - 1) == "?"){
      "Calm down, I know what I'm doing!"
    } else if (isAllCaps(statement) && containsLetters(statement)){
      "Whoa, chill out!"
    } else if (statement.trim == ""){
      "Fine. Be that way!"
    } else if (inputToArr(inputToArr.length - 1) == "?"){
      "Sure."
    } else "Whatever."
  }

  def isAllCaps(input: String): Boolean = {
    if (input.toUpperCase == input) true else false
  }
  def containsLetters(input: String): Boolean ={
    val letterPattern: Regex = "[a-zA-Z]".r
    val isMatch = letterPattern findFirstIn input
    if (isMatch == None) false else true
  }
}

