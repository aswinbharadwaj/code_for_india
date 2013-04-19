
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Feed,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(feed: Feed, source: String):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.30*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("News Feed")/*5.19*/ {_display_(Seq[Any](format.raw/*5.21*/("""
    	
	<h1>"""),_display_(Seq[Any](/*7.7*/source)),format.raw/*7.13*/(""": """),_display_(Seq[Any](/*7.16*/feed/*7.20*/.getMessages().size())),format.raw/*7.41*/(""" News Articles</h1>
	
	<h3> Hit refresh to randomize </h3>
	<hr></hr>
	<br/>	
	"""),_display_(Seq[Any](/*12.3*/form(routes.Application.refresh())/*12.37*/{_display_(Seq[Any](format.raw/*12.38*/("""
		<input type="submit" value="Refresh News">
	""")))})),format.raw/*14.3*/("""
	
	<hr></hr>
	<br/>	
	<h3> Hit news buttons to change feed </h3>	
	<hr></hr>
	<br/>
	"""),_display_(Seq[Any](/*21.3*/form(routes.Application.techmeme())/*21.38*/{_display_(Seq[Any](format.raw/*21.39*/("""
		<input type="submit" value="Tech Meme">
	""")))})),format.raw/*23.3*/("""
	"""),_display_(Seq[Any](/*24.3*/form(routes.Application.hindu())/*24.35*/{_display_(Seq[Any](format.raw/*24.36*/("""
		<input type="submit" value="Hindu News Update">
	""")))})),format.raw/*26.3*/("""
	"""),_display_(Seq[Any](/*27.3*/form(routes.Application.toi())/*27.33*/{_display_(Seq[Any](format.raw/*27.34*/("""
		<input type="submit" value="Times of India">
	""")))})),format.raw/*29.3*/("""
	"""),_display_(Seq[Any](/*30.3*/form(routes.Application.bbc())/*30.33*/{_display_(Seq[Any](format.raw/*30.34*/("""
		<input type="submit" value="BBC Top Stories">
	""")))})),format.raw/*32.3*/("""
	<hr></hr>
	<br/>	
	<h2>"""),_display_(Seq[Any](/*35.7*/source)),format.raw/*35.13*/(""": Feed Details</h2>
		<ul>
		<li>Title&nbsp;&gt;&gt;&nbsp;&nbsp;"""),_display_(Seq[Any](/*37.39*/feed/*37.43*/.getTitle())),format.raw/*37.54*/("""</li>
		<li>From&nbsp;&gt;&gt;&nbsp;&nbsp;"""),_display_(Seq[Any](/*38.38*/feed/*38.42*/.getLink())),format.raw/*38.52*/("""</li>
		<li>Description&nbsp;&gt;&gt;&nbsp;&nbsp;"""),_display_(Seq[Any](/*39.45*/Html(feed.getDescription()))),format.raw/*39.72*/("""</li>
		<li>Language&nbsp;&gt;&gt;&nbsp;&nbsp;"""),_display_(Seq[Any](/*40.42*/feed/*40.46*/.getLanguage())),format.raw/*40.60*/("""</li>
		<li>Copyright&nbsp;&gt;&gt;&nbsp;&nbsp;"""),_display_(Seq[Any](/*41.43*/feed/*41.47*/.getCopyright())),format.raw/*41.62*/("""</li>
		</li>Date&nbsp;&gt;&gt;&nbsp;&nbsp;"""),_display_(Seq[Any](/*42.39*/feed/*42.43*/.getPubDate())),format.raw/*42.56*/("""</li>
		</ul>
	<hr></hr>
	<br/>	
	<hr></hr>
	
	<ol>
		"""),_display_(Seq[Any](/*49.4*/for(feedMessage <- feed.getMessages()) yield /*49.42*/{_display_(Seq[Any](format.raw/*49.43*/("""
			<li>
				<ul>
					<li>Title&nbsp;&gt;&gt;&nbsp;&nbsp;"""),_display_(Seq[Any](/*52.42*/feedMessage/*52.53*/.getTitle())),format.raw/*52.64*/("""</li>
					<li>From&nbsp;&gt;&gt;&nbsp;&nbsp;"""),_display_(Seq[Any](/*53.41*/feedMessage/*53.52*/.getLink())),format.raw/*53.62*/("""</li>
					<li>Description&nbsp;&gt;&gt;&nbsp;&nbsp;"""),_display_(Seq[Any](/*54.48*/Html(feedMessage.getDescription()))),format.raw/*54.82*/("""</li>
					<li>Author&nbsp;&gt;&gt;&nbsp;&nbsp;"""),_display_(Seq[Any](/*55.43*/feedMessage/*55.54*/.getAuthor())),format.raw/*55.66*/("""</li>
					<li>Guid&nbsp;&gt;&gt;&nbsp;&nbsp;"""),_display_(Seq[Any](/*56.41*/feedMessage/*56.52*/.getGuid())),format.raw/*56.62*/("""</li>
				</ul>
			</li>
		""")))})),format.raw/*59.4*/("""
	</ol>
    
""")))})),format.raw/*62.2*/("""
"""))}
    }
    
    def render(feed:Feed,source:String): play.api.templates.Html = apply(feed,source)
    
    def f:((Feed,String) => play.api.templates.Html) = (feed,source) => apply(feed,source)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 18 18:04:06 IST 2013
                    SOURCE: /home/aswin/new-work/rssreader/app/views/index.scala.html
                    HASH: 8ca882ebfab1f1df110504bbfd31941a7238f167
                    MATRIX: 728->1|849->29|877->48|913->50|938->67|977->69|1024->82|1051->88|1089->91|1101->95|1143->116|1258->196|1301->230|1340->231|1419->279|1541->366|1585->401|1624->402|1700->447|1738->450|1779->482|1818->483|1902->536|1940->539|1979->569|2018->570|2099->620|2137->623|2176->653|2215->654|2297->705|2358->731|2386->737|2487->802|2500->806|2533->817|2612->860|2625->864|2657->874|2743->924|2792->951|2875->998|2888->1002|2924->1016|3008->1064|3021->1068|3058->1083|3138->1127|3151->1131|3186->1144|3276->1199|3330->1237|3369->1238|3464->1297|3484->1308|3517->1319|3599->1365|3619->1376|3651->1386|3740->1439|3796->1473|3880->1521|3900->1532|3934->1544|4016->1590|4036->1601|4068->1611|4127->1639|4172->1653
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|35->7|35->7|40->12|40->12|40->12|42->14|49->21|49->21|49->21|51->23|52->24|52->24|52->24|54->26|55->27|55->27|55->27|57->29|58->30|58->30|58->30|60->32|63->35|63->35|65->37|65->37|65->37|66->38|66->38|66->38|67->39|67->39|68->40|68->40|68->40|69->41|69->41|69->41|70->42|70->42|70->42|77->49|77->49|77->49|80->52|80->52|80->52|81->53|81->53|81->53|82->54|82->54|83->55|83->55|83->55|84->56|84->56|84->56|87->59|90->62
                    -- GENERATED --
                */
            