

 object ArmstrongNumbers {
    def isArmstrongNumber(num: Int): Boolean = {
      var totalDigits = num.toString.split("").length
      var sum: Double = 0
      for (e<-num.toString.split("")) {
        sum = sum + math.pow(e.toDouble, totalDigits)
      }
      if (sum == num.toDouble) true else false
    }
  }

