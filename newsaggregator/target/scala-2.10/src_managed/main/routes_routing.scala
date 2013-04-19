// @SOURCE:/home/aswin/new-work/rssreader/conf/routes
// @HASH:1cff9ea5de5efa67eb5fe7e9603545c6082c9396
// @DATE:Thu Apr 18 17:57:04 IST 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:10
private[this] lazy val controllers_Application_refresh1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("refresh"))))
        

// @LINE:14
private[this] lazy val controllers_Application_techmeme2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("techmeme"))))
        

// @LINE:16
private[this] lazy val controllers_Application_hindu3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("hindu"))))
        

// @LINE:18
private[this] lazy val controllers_Application_toi4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("toi"))))
        

// @LINE:20
private[this] lazy val controllers_Application_bbc5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bbc"))))
        

// @LINE:23
private[this] lazy val controllers_Assets_at6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index(news:String ?= "http://www.techmeme.com/feed.xml", source:String ?= "Tech Meme")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """refresh""","""controllers.Application.refresh()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """techmeme""","""controllers.Application.techmeme()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """hindu""","""controllers.Application.hindu()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """toi""","""controllers.Application.toi()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bbc""","""controllers.Application.bbc()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
       
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call(params.fromQuery[String]("news", Some("http://www.techmeme.com/feed.xml")), params.fromQuery[String]("source", Some("Tech Meme"))) { (news, source) =>
        invokeHandler(controllers.Application.index(news, source), HandlerDef(this, "controllers.Application", "index", Seq(classOf[String], classOf[String]),"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:10
case controllers_Application_refresh1(params) => {
   call { 
        invokeHandler(controllers.Application.refresh(), HandlerDef(this, "controllers.Application", "refresh", Nil,"GET", """""", Routes.prefix + """refresh"""))
   }
}
        

// @LINE:14
case controllers_Application_techmeme2(params) => {
   call { 
        invokeHandler(controllers.Application.techmeme(), HandlerDef(this, "controllers.Application", "techmeme", Nil,"GET", """""", Routes.prefix + """techmeme"""))
   }
}
        

// @LINE:16
case controllers_Application_hindu3(params) => {
   call { 
        invokeHandler(controllers.Application.hindu(), HandlerDef(this, "controllers.Application", "hindu", Nil,"GET", """""", Routes.prefix + """hindu"""))
   }
}
        

// @LINE:18
case controllers_Application_toi4(params) => {
   call { 
        invokeHandler(controllers.Application.toi(), HandlerDef(this, "controllers.Application", "toi", Nil,"GET", """""", Routes.prefix + """toi"""))
   }
}
        

// @LINE:20
case controllers_Application_bbc5(params) => {
   call { 
        invokeHandler(controllers.Application.bbc(), HandlerDef(this, "controllers.Application", "bbc", Nil,"GET", """""", Routes.prefix + """bbc"""))
   }
}
        

// @LINE:23
case controllers_Assets_at6(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}
    
}
        