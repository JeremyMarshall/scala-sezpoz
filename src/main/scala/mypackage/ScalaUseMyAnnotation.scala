package mypackage

import scala.beans.BeanProperty

object ScalaUseMyAnnotations {
  @MyAnnotation
  class Inner extends MyBase(){

    @BeanProperty
    val value: Int = 9
  }
}

class ScalaUseMyAnnotations
(@BeanProperty val name: String) extends MyBase(){

}