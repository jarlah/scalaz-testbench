package example
import scalaz._, Scalaz._, effect._, IO._

object ScalazApp extends App {
  
  val main = for {
     _ <- IO("Hello, world!")
     newValue <- IO(println("Success"))
  } yield newValue
  
  main.unsafePerformIO
}