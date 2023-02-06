import module1.threads.{Thread1, ToyFuture, getRatesLocation1, getRatesLocation2, getRatesLocation3, getRatesLocation4, getRatesLocation5, getRatesLocation6, printRunningTime}
import module1.{functions, future, list, opt, promise, type_system}
import module2.implicits.{implicit_conversions, implicit_scopes}
import module3.functional_effects
import functional_effects.functionalProgram.declarativeEncoding
import functional_effects.functionalProgram.executableEncoding

import scala.util.Try

object Main{


  def main(args: Array[String]): Unit = {


    val opt1 = opt.Option("value1")
    opt1.printIfAny()

    //val opt2 = opt.Option(123).filter(v => v == 124)
    val opt2 = opt.Option.None.filter(v => v == 124)
    opt2.printIfAny()

    println("-----")
    val opt3 = opt.Option.zip(opt.Option.None, opt.Option("value"))
    opt3.printIfAny()

    println("-----")
    val list1 = list.List(2, 3, 4)
    println(list1)
    println(list1.mkString("->"))
    val list2 = list1.::(1)
    println(list2)
    println(list.List.Nil.::("value123"))
    println("-----")
    println(list2.reverse())
    println(list.List(1))
    println(list.List.Nil)

    println("-----")
    val list3: list.List[String] = list2.map(x => x + "abcd")
    println(list3)

    println("-----")
    println(list2.filter(x => x >= 3))
    println(list.List.Nil)

    println("-----")
    println(list.List.shoutList(list3))
    println(list.List.intList(list2))




    //    val t1 = new Thread1
//    val t2 = new Thread1
//    t1.start()
//    t1.join()
//    t2.start()

//    def rates = {
//
//      getRatesLocation5.onComplete{ i1 =>
//        getRatesLocation6.onComplete{ i2 =>
//          println(i1 + i2)
//        }
//      }
//
//      for{
//        i1 <- getRatesLocation5
//        i2 <- getRatesLocation6
//
//      } yield i1 + i2
//
//    }
//
//    printRunningTime(rates)
    import scala.concurrent.ExecutionContext.Implicits.global

//    def rates = for{
//      r1 <- future.getRatesLocation1
//      r2 <- future.getRatesLocation2
//    } yield  r1 + r2
//
//    def rates2 = future.getRatesLocation1.flatMap(
//      r1 => future.getRatesLocation2.map(r2 => r1 + r2)
//    )

    //future.printRunningTime(rates)

//    future.f8.foreach{
//      println(_)
//    }

//    println(promise.p1.isCompleted)
//    println(promise.f1.isCompleted)
//    promise.p1.complete(Try(10))
//    println(promise.p1.isCompleted)
//    println(promise.f1.isCompleted)
//    promise.f1.foreach(println(_))
//
//    Thread.sleep(4000)


    //implicit_conversions.res
    // implicit_scopes.result
  //  println(s"Hello, from ${Thread.currentThread().getName}")

   // val r: executableEncoding.Console[Unit] = executableEncoding.p3
    //val r2: declarativeEncoding.Console[Unit] = declarativeEncoding.p2
    //declarativeEncoding.interpret(r2)
  }

}