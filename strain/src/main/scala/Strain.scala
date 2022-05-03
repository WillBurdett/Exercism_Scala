object Strain {

  def keep[T](input: Iterable[T], predicate: T => Boolean): Iterable[T] = {
    for (element <- input if predicate(element)) yield element
  }

  def discard[T](input: Iterable[T], predicate: T => Boolean): Iterable[T] = {
    for (element <- input if !predicate(element)) yield element
  }

}