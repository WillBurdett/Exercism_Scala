class School {

  type DB = Map[Int, Seq[String]]


  var db: DB = Map()

  def add(name: String, g: Int) = {
     if (!db.contains(g)) {
       db += (g -> Seq(name))
       println(db(g))
     }else {
       println("name before adding: " + name)
       println("value before adding: " + db(g))
       var both = (g, db(g) ++ Seq(name))
       db = db + both
       println("map after adding: " + db)
     }

  }

  def grade(g: Int): Seq[String] = db(g)

  def sorted: DB =
//    var sortedKeys = db.keys.toList.sorted
//    var result = Map()
  db

}

