// @SOURCE:/home/aswin/new-work/rssreader/conf/routes
// @HASH:1cff9ea5de5efa67eb5fe7e9603545c6082c9396
// @DATE:Thu Apr 18 17:57:04 IST 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._
import java.net.URLEncoder

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:23
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
// @LINE:10
// @LINE:6
package controllers {

// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
// @LINE:10
// @LINE:6
class ReverseApplication {
    

// @LINE:16
def hindu(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "hindu")
}
                                                

// @LINE:18
def toi(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "toi")
}
                                                

// @LINE:10
def refresh(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "refresh")
}
                                                

// @LINE:14
def techmeme(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "techmeme")
}
                                                

// @LINE:6
def index(news:String = "http://www.techmeme.com/feed.xml", source:String = "Tech Meme"): Call = {
   Call("GET", _prefix + queryString(List(if(news == "http://www.techmeme.com/feed.xml") None else Some(implicitly[QueryStringBindable[String]].unbind("news", news)), if(source == "Tech Meme") None else Some(implicitly[QueryStringBindable[String]].unbind("source", source)))))
}
                                                

// @LINE:20
def bbc(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "bbc")
}
                                                
    
}
                          

// @LINE:23
class ReverseAssets {
    

// @LINE:23
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          
}
                  


// @LINE:23
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
// @LINE:10
// @LINE:6
package controllers.javascript {

// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
// @LINE:10
// @LINE:6
class ReverseApplication {
    

// @LINE:16
def hindu : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.hindu",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hindu"})
      }
   """
)
                        

// @LINE:18
def toi : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.toi",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "toi"})
      }
   """
)
                        

// @LINE:10
def refresh : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.refresh",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "refresh"})
      }
   """
)
                        

// @LINE:14
def techmeme : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.techmeme",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "techmeme"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function(news,source) {
      return _wA({method:"GET", url:"""" + _prefix + """" + _qS([(news == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("news", news)), (source == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("source", source))])})
      }
   """
)
                        

// @LINE:20
def bbc : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.bbc",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bbc"})
      }
   """
)
                        
    
}
              

// @LINE:23
class ReverseAssets {
    

// @LINE:23
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:23
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
// @LINE:10
// @LINE:6
package controllers.ref {

// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
// @LINE:10
// @LINE:6
class ReverseApplication {
    

// @LINE:16
def hindu(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.hindu(), HandlerDef(this, "controllers.Application", "hindu", Seq(), "GET", """""", _prefix + """hindu""")
)
                      

// @LINE:18
def toi(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.toi(), HandlerDef(this, "controllers.Application", "toi", Seq(), "GET", """""", _prefix + """toi""")
)
                      

// @LINE:10
def refresh(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.refresh(), HandlerDef(this, "controllers.Application", "refresh", Seq(), "GET", """""", _prefix + """refresh""")
)
                      

// @LINE:14
def techmeme(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.techmeme(), HandlerDef(this, "controllers.Application", "techmeme", Seq(), "GET", """""", _prefix + """techmeme""")
)
                      

// @LINE:6
def index(news:String, source:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(news, source), HandlerDef(this, "controllers.Application", "index", Seq(classOf[String], classOf[String]), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:20
def bbc(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.bbc(), HandlerDef(this, "controllers.Application", "bbc", Seq(), "GET", """""", _prefix + """bbc""")
)
                      
    
}
                          

// @LINE:23
class ReverseAssets {
    

// @LINE:23
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          
}
                  
      