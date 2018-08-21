package ngthanhtrung.scalajs.react.apollo.internal

import japgolly.scalajs.react.raw.React

import scala.scalajs.js
//not found: type ReactClass
//При переводе на версию 1.2.3 с 1.1.1 перестала видеть reactClass
//import japgolly.scalajs.react.raw.ReactClass

  //надо почитать про миграцию

//Из диффа следует, что он просто переименовался в React.ComponentClass

@js.native
trait HigherOrderComponent[Props <: js.Object, ChildProps <: js.Object] extends js.Object {

  def apply[Extra <: js.Any](
    component: js.Any // Cannot make it more type-safe
  ): React.ComponentClass[ChildProps with Extra, Null] = js.native
}
