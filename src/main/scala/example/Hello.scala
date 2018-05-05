package example
import scalaz._, Scalaz._

object Hello extends App {
  
  import Id._
  import Name._
  import Score._
  
  val score2: Int = Score(2)

  val f2 = ((x: Int) => x * 2) map (_ * 4)


  println(f2(4))
  val score = Score(1) |+| Score(2) |+| score2


  println(score.toDouble)

  def read(name: String, id: Id): String = {
    s"Hello $name with Id ${id * 2L}"
  }

  println(read(Name("Jarl"), Id(1)))
 
}