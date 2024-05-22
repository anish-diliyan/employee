package controllers

import javax.inject._
import play.api.mvc._

@Singleton
class HeartBeatController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def heartBeat(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    Ok("Play Scala App Is Running....")
  }
}
