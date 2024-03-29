// @SOURCE:/home/aswin/new-work/twitteroauth/conf/routes
// @HASH:9d2cd8ac75cd1a94c2f3482a962d61e3739043e6
// @DATE:Fri Apr 19 22:27:41 IST 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._
import java.net.URLEncoder

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:11
// @LINE:8
// @LINE:6
package controllers {

// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(queryTerm:String = "googlecantfind"): Call = {
   Call("GET", _prefix + queryString(List(if(queryTerm == "googlecantfind") None else Some(implicitly[QueryStringBindable[String]].unbind("queryTerm", queryTerm)))))
}
                                                

// @LINE:8
def search(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "search")
}
                                                
    
}
                          

// @LINE:11
class ReverseAssets {
    

// @LINE:11
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          
}
                  


// @LINE:11
// @LINE:8
// @LINE:6
package controllers.javascript {

// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function(queryTerm) {
      return _wA({method:"GET", url:"""" + _prefix + """" + _qS([(queryTerm == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("queryTerm", queryTerm))])})
      }
   """
)
                        

// @LINE:8
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.search",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
      }
   """
)
                        
    
}
              

// @LINE:11
class ReverseAssets {
    

// @LINE:11
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
        


// @LINE:11
// @LINE:8
// @LINE:6
package controllers.ref {

// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(queryTerm:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(queryTerm), HandlerDef(this, "controllers.Application", "index", Seq(classOf[String]), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:8
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.search(), HandlerDef(this, "controllers.Application", "search", Seq(), "GET", """""", _prefix + """search""")
)
                      
    
}
                          

// @LINE:11
class ReverseAssets {
    

// @LINE:11
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          
}
                  
      