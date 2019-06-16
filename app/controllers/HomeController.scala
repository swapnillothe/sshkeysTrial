package controllers

import javax.inject._
import play.api._
import play.api.libs.json.Json
import play.api.mvc._

@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(Json.toJson("[]")
  }

  def greet() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index("Good Morning"))
  }

  def greetafternoon() = Action { implicit  request : Request[AnyContent]=>
    Ok(views.html.index("Good Afternoon"))
  }
}
