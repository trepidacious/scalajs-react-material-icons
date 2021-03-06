
package org.rebeam.icons

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

object Menu {

  @JSImport("@material-ui/icons/Menu", JSImport.Default)
  @js.native
  object MenuJS extends js.Object

  val jsFnComponent = JsFnComponent[Null, Children.None](MenuJS)
  
  def apply() = jsFnComponent()

}
    