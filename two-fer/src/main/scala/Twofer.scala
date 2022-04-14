object Twofer {
  // "you" is the default value if nothing is passed in.
  // s"This is the $syntax"
  def twofer(name: String = "you"): String = s"One for $name, one for me."

  // Same thing but longer
  // def twofer(name: String = "you"): String = if (name == "") "One for you, one for me." else "One for " + name + ", one for me."
}
