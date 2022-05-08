case class Clock(var hours: Int, var minutes: Int) {

  // must be able to calculate minutes within one day
  private val MINUTES_IN_DAY = 1440

  // hours must be less than 24
  private val validatedHours = hours % 24

  // minutes must be contextualised within a 24-hour cycle
  private val validatedMinutes = minutes % MINUTES_IN_DAY

  // must incorporate hours, so hours * 60. Plus the minutes we already validated. Once again, % minutes in a day
  private val validMinutesPlusValidHours = (validatedHours * 60 + validatedMinutes) % MINUTES_IN_DAY

  // this is to fix negative hours
  private val finalSumOfMinutes = (MINUTES_IN_DAY + validMinutesPlusValidHours) % MINUTES_IN_DAY

  // hours are total minutes / 60
  hours = finalSumOfMinutes / 60

  // minutes are total minutes % 60
  minutes = finalSumOfMinutes % 60

  // args are parsed in as a sum of the 'this' instance and the new args
  def +(that: Clock) = Clock(this.hours + that.hours, this.minutes + that.minutes)
  def -(that: Clock) = Clock(this.hours - that.hours, this.minutes - that.minutes)
}
object Clock {
  // deals with the sums as tests only pass in minutes
  def apply(minutes: Int): Clock = {
    this.apply(0, minutes)
  }
}
