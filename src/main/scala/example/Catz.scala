package example
import cats.effect.IO
import cats.effect.{Effect => CatsEffect}

object Catz extends App {
  
  val someTask = IO("Hello you")

  val main = CatsEffect[IO]
    .runAsync(someTask) {
      case Right(value) => IO(println(value))
      case Left(error) => IO(println(error))
    }.flatMap((e) => IO("Success"))
    
  main.unsafeRunAsync(_ match {
    case Right(value) => println(value)
    case Left(error) => println(error)
  })
}