package example
import scalaz._, Scalaz._

object Hello extends App {
  
  import Id._
  import Name._
  import Score._
  
  def read(name: Name, id: Id): String = {
    s"Hello $name with Id ${id * 2L}"
  }
    
  val score2: Int = Score(2)
  
  val score = Score(1) |+| Score(2) |+| score2
    
  println(score)
 
  println(read(Name(("DD" |+| "dsdd")), Id(1)))
}