package example
import cats.effect.IO

object CatzApp extends App {
  
  val main = for {
      _ <- IO("Hello, world!")
      newValue <- IO(println("Success"))
  } yield newValue
    
  main.unsafeRunAsync {
    case Right(value) => println(value)
    case Left(error) => println(error)
  }
}