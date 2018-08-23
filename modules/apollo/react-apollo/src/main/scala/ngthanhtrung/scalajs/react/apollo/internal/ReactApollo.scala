package ngthanhtrung.scalajs.react.apollo.internal

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

// scalastyle:off underscore.import
import japgolly.scalajs.react.raw._
// scalastyle:on underscore.import

@JSImport("react-apollo", JSImport.Namespace, "ReactApollo")
@js.native
object ReactApollo extends js.Object {

  def graphql[Variables <: js.Object, Data <: js.Object](
    query: Query[Variables, Data]
  ): HigherOrderComponent[Variables, ApolloQueryProps[Data]] = js.native

  def getDataFromTree(component: React.Element): js.Promise[Void] = js.native
  def renderToStringWithData(component: React.Element): js.Promise[String] = js.native
}
