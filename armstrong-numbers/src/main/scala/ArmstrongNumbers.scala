
 object ArmstrongNumbers {
    def isArmstrongNumber(num: Int): Boolean = {
      var numArr = num.toString.split("")
      if (numArr.map(e => math.pow(e.toDouble, (numArr.length))).sum == num.toDouble) true else false
    }
  }

