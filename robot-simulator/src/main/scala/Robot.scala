
// import 'Bearing._' here likely due to hoisting
// we create the Bearing object in the params
import Bearing._
//---------------------------------------------
// creating a Robot takes a 'Bearing' object and a tuple e.g. (Int, Int)
case class Robot(bearing: Bearing, coordinates: (Int, Int)) {

  // is called to pass in instructions
  // the 'steps' String is passed in,
  def simulate(steps: String): Robot = steps

    // split to char array
    .toCharArray

    // something about applying a function to 'this' robot instance (RESEARCH)
    .foldLeft(this) { (robot: Robot, operation: Char) =>

      // matches the char to the appropriate robot method
      operation match {
        case 'L' => robot.turnLeft
        case 'R' => robot.turnRight
        case 'A' => robot.advance
        case _ => throw new IllegalAccessError("Unknown step type")
      }
    }

  // if function is called, the method copies (what the method is called on I believe) and only alters the bearing
  // to alter the bearing, a bearing method is called - either left or right.

  // 'left' and 'right' were initially sealed traits (methods), that any objects extending them must implement

  def turnRight: Robot = copy(bearing = bearing.right)
  def turnLeft: Robot = copy(bearing = bearing.left)

  // is called on the robot(this) object when char 'A' is present
  def advance: Robot = {
    // coordinates are updated by creating a placeholder
    // the bearing of the robot is then checked and the coordinates are updated appropriately
    val newCoordinates = bearing match {
      case North => coordinates.copy(_2 = coordinates._2 + 1)
      case South => coordinates.copy(_2 = coordinates._2 - 1)
      case East => coordinates.copy(_1 = coordinates._1 + 1)
      case West => coordinates.copy(_1 = coordinates._1 - 1)
    }
    // a copy of the robot is copied, with the coordinates changed to the updated ones
    // this is then returned
    copy(coordinates = newCoordinates)
  }
}
//---------------------------------------------
// case class created so coordinates can be saved as a Coordinates Object
case class Coordinate(x: Int, y: Int)
//---------------------------------------------
// Bearing is a sealed trait (acts much like an intereface)
// anything extending this trait must implement these methods
// the sealed trait must be called the same thing as the object extending them
sealed trait Bearing {
  def left: Bearing
  def right: Bearing
}
//---------------------------------------------
// a new object called Bearing is created
object Bearing {

  // a case object is created inside the main object - 'Bearing' - for each compass directions
  // each of these then extend Bearing and implement 'left' and 'right' methods
  // these act like subfolders within Bearing

  case object North extends Bearing {
    // 'this' Robot's bearing then updates
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