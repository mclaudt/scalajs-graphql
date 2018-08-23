package ngthanhtrung.scalajs.react.apollo.internal

import japgolly.scalajs.react.raw.React

import scala.scalajs.js

@js.native
trait HigherOrderComponent[Props <: js.Object, ChildProps <: js.Object] extends js.Object {

  def apply[Extra <: js.Any](
    component: js.Any // Cannot make it more type-safe
  ): React.ComponentClass[ChildProps with Extra, Null] = js.native
}
