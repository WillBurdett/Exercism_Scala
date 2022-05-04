import scala.annotation.tailrec

object BeerSong {
  def recite(startingBottles: Int, totalVersesRequested: Int): String = {
    var requestedVerses = ""

    @tailrec
    def verseWriter(currentBottleNum: Int, versesRemainingToWrite: Int):Unit = {
      if (versesRemainingToWrite == 0) return
      else {
        if (requestedVerses != "") requestedVerses += "\n"
        currentBottleNum match {
          case 0 => requestedVerses += "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n"
          case 1 => requestedVerses += "1 bottle of beer on the wall, 1 bottle of beer.\nTake it down and pass it around, no more bottles of beer on the wall.\n"
          case 2 => requestedVerses += "2 bottles of beer on the wall, 2 bottles of beer.\nTake one down and pass it around, 1 bottle of beer on the wall.\n"
          case _ => requestedVerses += s"$currentBottleNum bottles of beer on the wall, $currentBottleNum bottles of beer.\nTake one down and pass it around, ${currentBottleNum - 1} bottles of beer on the wall.\n"
        }
        verseWriter(currentBottleNum - 1, versesRemainingToWrite - 1)
      }
    }
    verseWriter(startingBottles, totalVersesRequested)
    println(requestedVerses)
    requestedVerses
  }
}