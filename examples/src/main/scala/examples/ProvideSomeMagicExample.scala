//package examples
//
//import zio._
//import zio.magic._
//
//private object ProvideSomeMagicExample extends App {
//  override def run(args: List[String]): URIO[ZEnv, ExitCode] = {
//    val program: URIO[Has[Int] with Has[String] with Has[Boolean], Unit] = ZIO.service[Int].map { println(_) }
//    val provided: ZLayer[Any, Nothing, Has[Int]]                         = ZLayer.succeed(1)
//
//    def manual: ZIO[Has[String], Nothing, Unit] =
//      program.provideSomeLayer[Has[String]](ZLayer.succeed(1) ++ ZLayer.succeed(true))
//
//    val magic = program.provideSomeMagicLayer[Has[String]](ZLayer.succeed(1), ZLayer.succeed(true))
//
//    UIO(1).exitCode
//  }
//}
