package example
import scalaz._, Scalaz._

object Name {
  sealed trait NameTag
  type Name = String @@ NameTag
  implicit def nameToValue(name: Name): String = Tag.unwrap(name)
  implicit def nameFromValue(name: String): Name = Name(name)
  def apply(n: String): Name = Tag[String, NameTag](n)
}