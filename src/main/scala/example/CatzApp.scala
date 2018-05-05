package example
import cats.effect.IO

object CatzApp extends App {
  
  val main = for {
      _ <- IO("Hello, world!")
      newValue <- IO(println("Success"))
  } yield newValue
    
  main.unsafeRunAsync(_ match {
    case Right(value) => println(value)
    case Left(error) => println(error)
  })
}