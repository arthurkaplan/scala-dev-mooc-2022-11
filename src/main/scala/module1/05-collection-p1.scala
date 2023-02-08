package module1
import scala.util.Random

case class BallsExperiment(basket: List[Boolean]) {

  //isFirstBlackSecondWhite
  def getResult(): Boolean = {

    val (x, y) = basket.splitAt(Random.nextInt(5))
    val first = y.head

    val (_, w) = (x ++ y.tail).splitAt(Random.nextInt(4))
    val second = w.head

    //println(first + " " + second)
    first && !second
  }
}

object BallsTest {
  def main(args: Array[String]): Unit = {

    val a = for (_ <- 1 to 3; color <- List(true, false)) yield color
    val count = 30000
    val baskets = for (_ <- 1 to count) yield BallsExperiment(a.toList)

    val results = baskets.map(x => x.getResult())
    val positive: Float = results.count(_ == true)
    println(positive / count)
  }
}