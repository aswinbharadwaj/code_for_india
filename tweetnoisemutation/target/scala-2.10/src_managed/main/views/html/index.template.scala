
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[String],String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(tweets: List[String], term: String):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.38*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Search Tweets (" + term + ")")/*5.38*/ {_display_(Seq[Any](format.raw/*5.40*/("""
    
	<h1>Twitter Search by query (Try boston, delhi, ilovepepsiiplbecause ...</h1>
	
	<h3> Enter query term and hit search </h3>
	<hr></hr>
	<br/>	
	"""),_display_(Seq[Any](/*12.3*/form(routes.Application.search())/*12.36*/{_display_(Seq[Any](format.raw/*12.37*/("""
		<input type="text" name="query">
		<input type="submit" value="Search">
	""")))})),format.raw/*15.3*/("""
	
	<hr></hr>
	<br/>	
	<h2> """),_display_(Seq[Any](/*19.8*/term)),format.raw/*19.12*/(""" </h2>
	<ol>
		"""),_display_(Seq[Any](/*21.4*/for(tweet <- tweets) yield /*21.24*/{_display_(Seq[Any](format.raw/*21.25*/("""
			<li>
				"""),_display_(Seq[Any](/*23.6*/tweet)),format.raw/*23.11*/("""
	
			</li>
		""")))})),format.raw/*26.4*/("""
	</ol>
	
    
""")))})),format.raw/*30.2*/("""
"""))}
    }
    
    def render(tweets:List[String],term:String): play.api.templates.Html = apply(tweets,term)
    
    def f:((List[String],String) => play.api.templates.Html) = (tweets,term) => apply(tweets,term)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Apr 19 22:27:41 IST 2013
                    SOURCE: /home/aswin/new-work/twitteroauth/app/views/index.scala.html
                    HASH: 59743f0831ed71471006abfd35c985796b0cc382
                    MATRIX: 736->1|865->37|893->56|929->58|973->94|1012->96|1199->248|1241->281|1280->282|1388->359|1452->388|1478->392|1529->408|1565->428|1604->429|1653->443|1680->448|1726->463|1773->479
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|40->12|40->12|40->12|43->15|47->19|47->19|49->21|49->21|49->21|51->23|51->23|54->26|58->30
                    -- GENERATED --
                */
            