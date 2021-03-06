class School {

  type DB = Map[Int, Seq[String]]

  var db: DB = Map()

  def add(name: String, g: Int) = {
     if (!db.contains(g)) {
       db += (g -> Seq(name))
       println(db(g))
     }else {
       // todo -- Refactor when properly learned Maps and Lists in Scala
       println("name before adding: " + name)
       println("value before adding: " + db(g))
       var both = (g, db(g) ++ Seq(name))
       db = db + both
       println("map after adding: " + db)
     }
  }

  def grade(g: Int): Seq[String] = if (!db.contains(g)) Seq() else db(g)

  def sorted(): DB = {
    var sortedKeys = db.keys.toList.sorted
    var result: DB = Map()

    for (key <- sortedKeys) {
      result += (key -> db(key).sorted)
    }
    result
  }
}

