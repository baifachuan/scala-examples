package com.fcbai.graphql.example

import java.util.concurrent.Executors
import scala.concurrent.ExecutionContext

class GrapHqlExample {

}

object GrapHqlExample {
  import sangria.schema._
  import sangria.execution._
  import sangria.macros._

  implicit val ec = ExecutionContext
    .fromExecutor(Executors.newFixedThreadPool(10))

  def main(args: Array[String]): Unit = {
    val QueryType = ObjectType("Query", fields[Unit, Unit](
      Field("hello", StringType, resolve = _ ⇒ "Hello world!")
    ))

    val schema = Schema(QueryType)

    val query = graphql"{ hello }"

    Executor.execute(schema, query) map println
  }
}
