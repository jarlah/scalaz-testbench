package example
import scalaz._

object Score {
  sealed trait ScoreTag
  type Score = Int @@ ScoreTag
  def apply(score: Int): Score = Tag[Int, ScoreTag](score)
  implicit def scoreToValue(score: Score): Int = Tag.unwrap(score)
  implicit def scoreFromValue(score: Int): Score = Score(score)
  implicit object ScoreMonoid extends Monoid[Score] {
    def zero: Score = Score(0)
    def append(v1: Score, v2: => Score): Score = Score(v1 + v2)
  }
}