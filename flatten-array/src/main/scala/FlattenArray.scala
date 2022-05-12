
object FlattenArray{

  def flatten(l: List[Any]): List[Any] = {
    def _flatten(result: List[Any], remainingList: List[Any]):List[Any] =

      remainingList match {

        // if the remainingList is empty, return the result
        case Nil => result

        // if the first element in the given list is a list, and is comprised of no tail, we pass that list into the _flatten
        case (h:List[_])::Nil => _flatten(result, h)

        // if the first element in the given list is a list, and there is a tail of other elements following the initial/head list element,
        // _flatten is called on the result + flattened head, and given the tail to later traverse and complete
        // by parsing 'result:::flatten(h)', we keep the Int's extracted and can work out the kinks in any further nests
        case (h:List[_])::tail => _flatten(result:::flatten(h), tail)

        // if the first element is not a list of something and also not null, append it to result (used concatenation instead)
        // otherwise just give the recursive call the tail
        case h::tail => if (h != null )_flatten(result:::List(h), tail) else (_flatten(result, tail))
      }
    _flatten(List(), l)
  }

  flatten(List(1,2,3, List(9,9,9)))
}