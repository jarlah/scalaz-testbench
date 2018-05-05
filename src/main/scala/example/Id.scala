package example
import scalaz._

object Id {
  sealed trait IdTag
  type Id = Long @@ IdTag
  implicit def idToValue(id: Id): Long = Tag.unwrap(id)
  implicit def idFromValue(id: Long): Id = Id(id)
  def apply(n: Long): Id = Tag[Long, IdTag](n)
}