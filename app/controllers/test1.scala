package controllers

import play.api.mvc._
import javax.inject._

@Singleton
class test1 @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def test = Action {
    val tasks =  List("abc","xyz","dkfj")
    Ok(views.html.test1(tasks))

  }

  def acount(username :String, pass :String, id : Int) = Action{
    Ok(s"Id : $id, username : $username, pass : $pass")
  }
}
