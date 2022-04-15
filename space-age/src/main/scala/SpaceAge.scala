object SpaceAge {
  def onEarth(age: Double):   Double = age/31557600.0
  def onMercury(age: Double): Double = (age/31557600.0) / 0.2408467
  def onVenus(age: Double):   Double = (age/31557600.0) / 0.61519726
  def onMars(age: Double):    Double = (age/31557600.0)/ 1.8808158
  def onJupiter(age: Double): Double = (age/31557600.0)/ 11.862615
  def onSaturn(age: Double):  Double = (age/31557600.0) / 29.447498
  def onUranus(age: Double):  Double = (age/31557600.0)  / 84.016846
  def onNeptune(age: Double): Double = (age/31557600.0) / 164.79132
}


