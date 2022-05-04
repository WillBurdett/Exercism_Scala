object Strain {

  def keep[T](elements: Iterable[T], predicate: T => Boolean): Iterable[T] = {
    for (element <- elements if predicate(element)) yield element
  }

  def discard[T](elements: Iterable[T], predicate: T => Boolean): Iterable[T] = {
    for (element <- elements if !predicate(element)) yield element
  }

}