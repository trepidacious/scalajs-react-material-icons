
package org.rebeam.icons

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

object AccessibilityNew {

  @JSImport("@material-ui/icons/AccessibilityNew", JSImport.Default)
  @js.native
  object AccessibilityNewJS extends js.Object

  val jsFnComponent = JsFnComponent[Null, Children.None](AccessibilityNewJS)
  
  def apply() = jsFnComponent()

}
    