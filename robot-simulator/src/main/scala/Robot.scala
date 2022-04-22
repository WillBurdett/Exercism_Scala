
import Bearing._
case class Robot(bearing: Bearing, coordinates: (Int, Int)) {
  def simulate(steps: String): Robot = steps
    .toCharArray
    .foldLeft(this) { (robot: Robot, operation: Char) =>
      operation match {
        case 'L' => robot.turnLeft
        case 'R' => robot.turnRight
        case 'A' => robot.advance
        case _ => throw new IllegalAccessError("Unknown step type")
      }
    }
  def turnRight: Robot = copy(bearing = bearing.right)
  def turnLeft: Robot = copy(bearing = bearing.left)
  def advance: Robot = {
    val newCoordinates = bearing match {
      case North => coordinates.copy(_2 = coordinates._2 + 1)
      case South => coordinates.copy(_2 = coordinates._2 - 1)
      case East => coordinates.copy(_1 = coordinates._1 + 1)
      case West => coordinates.copy(_1 = coordinates._1 - 1)
    }
    copy(coordinates = newCoordinates)
  }
}
case class Coordinate(x: Int, y: Int)
sealed trait Bearing {
  def left: Bearing
  def right: Bearing
}
object Bearing {
  case object North extends Bearing {
    override def left: Bearing = West
    override def right: Bearing = East
  }
  case object South extends Bearing {
    override def left: Bearing = East
    override def right: Bearing = West
  }
  case object East extends Bearing {
    override def left: Bearing = North
    override def right: Bearing = South
  }
  case object West extends Bearing {
    override def left: Bearing = South
    override def right: Bearing = North
  }
}