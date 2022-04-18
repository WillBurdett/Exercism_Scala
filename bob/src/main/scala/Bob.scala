object Bob {
  def response(statement: String): String = {
    var inputToArr = statement.replaceAll(" ", "").split("")
    if(isAllCaps(statement) && inputToArr(inputToArr.length - 1) == "?"){
      "Calm down, I know what I'm doing!"
    } else if (isAllCaps(statement) && inputToArr(inputToArr.length - 1) == "!"){
      "Whoa, chill out!"
    } else if (statement.replaceAll(" ", "") == ""){
      "Fine. Be that way!"
    } else if (inputToArr(inputToArr.length - 1) == "?"){
      "Sure."
    } else "Whatever."
  }

  def isAllCaps(input: String): Boolean = {
    if (input.toUpperCase == input) true else false
  }
}
