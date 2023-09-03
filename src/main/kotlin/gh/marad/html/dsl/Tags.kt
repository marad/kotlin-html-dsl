@file:Suppress("unused")

package gh.marad.html.dsl

fun Html.a(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("a", attrs = attrs.toMap(), content = content)  
fun Html.a(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("a", classes, attrs.toMap(), content)  
fun Html.a(vararg attrs: Pair<String, Any>) =  
tag("a", attrs = attrs.toMap())  
fun Html.a(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("a", classes, attrs.toMap())  

fun Html.abbr(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("abbr", attrs = attrs.toMap(), content = content)  
fun Html.abbr(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("abbr", classes, attrs.toMap(), content)  
fun Html.abbr(vararg attrs: Pair<String, Any>) =  
tag("abbr", attrs = attrs.toMap())  
fun Html.abbr(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("abbr", classes, attrs.toMap())  

fun Html.address(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("address", attrs = attrs.toMap(), content = content)  
fun Html.address(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("address", classes, attrs.toMap(), content)  
fun Html.address(vararg attrs: Pair<String, Any>) =  
tag("address", attrs = attrs.toMap())  
fun Html.address(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("address", classes, attrs.toMap())  

fun Html.area(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("area", attrs = attrs.toMap(), content = content)  
fun Html.area(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("area", classes, attrs.toMap(), content)  
fun Html.area(vararg attrs: Pair<String, Any>) =  
tag("area", attrs = attrs.toMap())  
fun Html.area(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("area", classes, attrs.toMap())  

fun Html.article(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("article", attrs = attrs.toMap(), content = content)  
fun Html.article(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("article", classes, attrs.toMap(), content)  
fun Html.article(vararg attrs: Pair<String, Any>) =  
tag("article", attrs = attrs.toMap())  
fun Html.article(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("article", classes, attrs.toMap())  

fun Html.aside(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("aside", attrs = attrs.toMap(), content = content)  
fun Html.aside(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("aside", classes, attrs.toMap(), content)  
fun Html.aside(vararg attrs: Pair<String, Any>) =  
tag("aside", attrs = attrs.toMap())  
fun Html.aside(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("aside", classes, attrs.toMap())  

fun Html.audio(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("audio", attrs = attrs.toMap(), content = content)  
fun Html.audio(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("audio", classes, attrs.toMap(), content)  
fun Html.audio(vararg attrs: Pair<String, Any>) =  
tag("audio", attrs = attrs.toMap())  
fun Html.audio(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("audio", classes, attrs.toMap())  

fun Html.b(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("b", attrs = attrs.toMap(), content = content)  
fun Html.b(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("b", classes, attrs.toMap(), content)  
fun Html.b(vararg attrs: Pair<String, Any>) =  
tag("b", attrs = attrs.toMap())  
fun Html.b(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("b", classes, attrs.toMap())  

fun Html.base(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("base", attrs = attrs.toMap(), content = content)  
fun Html.base(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("base", classes, attrs.toMap(), content)  
fun Html.base(vararg attrs: Pair<String, Any>) =  
tag("base", attrs = attrs.toMap())  
fun Html.base(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("base", classes, attrs.toMap())  

fun Html.bdi(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("bdi", attrs = attrs.toMap(), content = content)  
fun Html.bdi(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("bdi", classes, attrs.toMap(), content)  
fun Html.bdi(vararg attrs: Pair<String, Any>) =  
tag("bdi", attrs = attrs.toMap())  
fun Html.bdi(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("bdi", classes, attrs.toMap())  

fun Html.bdo(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("bdo", attrs = attrs.toMap(), content = content)  
fun Html.bdo(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("bdo", classes, attrs.toMap(), content)  
fun Html.bdo(vararg attrs: Pair<String, Any>) =  
tag("bdo", attrs = attrs.toMap())  
fun Html.bdo(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("bdo", classes, attrs.toMap())  

fun Html.blockquote(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("blockquote", attrs = attrs.toMap(), content = content)  
fun Html.blockquote(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("blockquote", classes, attrs.toMap(), content)  
fun Html.blockquote(vararg attrs: Pair<String, Any>) =  
tag("blockquote", attrs = attrs.toMap())  
fun Html.blockquote(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("blockquote", classes, attrs.toMap())  

fun Html.body(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("body", attrs = attrs.toMap(), content = content)  
fun Html.body(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("body", classes, attrs.toMap(), content)  
fun Html.body(vararg attrs: Pair<String, Any>) =  
tag("body", attrs = attrs.toMap())  
fun Html.body(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("body", classes, attrs.toMap())  

fun Html.br(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("br", attrs = attrs.toMap(), content = content)  
fun Html.br(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("br", classes, attrs.toMap(), content)  
fun Html.br(vararg attrs: Pair<String, Any>) =  
tag("br", attrs = attrs.toMap())  
fun Html.br(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("br", classes, attrs.toMap())  

fun Html.button(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("button", attrs = attrs.toMap(), content = content)  
fun Html.button(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("button", classes, attrs.toMap(), content)  
fun Html.button(vararg attrs: Pair<String, Any>) =  
tag("button", attrs = attrs.toMap())  
fun Html.button(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("button", classes, attrs.toMap())  

fun Html.canvas(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("canvas", attrs = attrs.toMap(), content = content)  
fun Html.canvas(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("canvas", classes, attrs.toMap(), content)  
fun Html.canvas(vararg attrs: Pair<String, Any>) =  
tag("canvas", attrs = attrs.toMap())  
fun Html.canvas(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("canvas", classes, attrs.toMap())  

fun Html.caption(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("caption", attrs = attrs.toMap(), content = content)  
fun Html.caption(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("caption", classes, attrs.toMap(), content)  
fun Html.caption(vararg attrs: Pair<String, Any>) =  
tag("caption", attrs = attrs.toMap())  
fun Html.caption(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("caption", classes, attrs.toMap())  

fun Html.cite(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("cite", attrs = attrs.toMap(), content = content)  
fun Html.cite(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("cite", classes, attrs.toMap(), content)  
fun Html.cite(vararg attrs: Pair<String, Any>) =  
tag("cite", attrs = attrs.toMap())  
fun Html.cite(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("cite", classes, attrs.toMap())  

fun Html.code(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("code", attrs = attrs.toMap(), content = content)  
fun Html.code(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("code", classes, attrs.toMap(), content)  
fun Html.code(vararg attrs: Pair<String, Any>) =  
tag("code", attrs = attrs.toMap())  
fun Html.code(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("code", classes, attrs.toMap())  

fun Html.col(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("col", attrs = attrs.toMap(), content = content)  
fun Html.col(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("col", classes, attrs.toMap(), content)  
fun Html.col(vararg attrs: Pair<String, Any>) =  
tag("col", attrs = attrs.toMap())  
fun Html.col(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("col", classes, attrs.toMap())  

fun Html.colgroup(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("colgroup", attrs = attrs.toMap(), content = content)  
fun Html.colgroup(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("colgroup", classes, attrs.toMap(), content)  
fun Html.colgroup(vararg attrs: Pair<String, Any>) =  
tag("colgroup", attrs = attrs.toMap())  
fun Html.colgroup(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("colgroup", classes, attrs.toMap())  

fun Html.data(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("data", attrs = attrs.toMap(), content = content)  
fun Html.data(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("data", classes, attrs.toMap(), content)  
fun Html.data(vararg attrs: Pair<String, Any>) =  
tag("data", attrs = attrs.toMap())  
fun Html.data(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("data", classes, attrs.toMap())  

fun Html.datalist(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("datalist", attrs = attrs.toMap(), content = content)  
fun Html.datalist(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("datalist", classes, attrs.toMap(), content)  
fun Html.datalist(vararg attrs: Pair<String, Any>) =  
tag("datalist", attrs = attrs.toMap())  
fun Html.datalist(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("datalist", classes, attrs.toMap())  

fun Html.dd(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("dd", attrs = attrs.toMap(), content = content)  
fun Html.dd(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("dd", classes, attrs.toMap(), content)  
fun Html.dd(vararg attrs: Pair<String, Any>) =  
tag("dd", attrs = attrs.toMap())  
fun Html.dd(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("dd", classes, attrs.toMap())  

fun Html.del(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("del", attrs = attrs.toMap(), content = content)  
fun Html.del(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("del", classes, attrs.toMap(), content)  
fun Html.del(vararg attrs: Pair<String, Any>) =  
tag("del", attrs = attrs.toMap())  
fun Html.del(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("del", classes, attrs.toMap())  

fun Html.details(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("details", attrs = attrs.toMap(), content = content)  
fun Html.details(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("details", classes, attrs.toMap(), content)  
fun Html.details(vararg attrs: Pair<String, Any>) =  
tag("details", attrs = attrs.toMap())  
fun Html.details(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("details", classes, attrs.toMap())  

fun Html.dfn(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("dfn", attrs = attrs.toMap(), content = content)  
fun Html.dfn(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("dfn", classes, attrs.toMap(), content)  
fun Html.dfn(vararg attrs: Pair<String, Any>) =  
tag("dfn", attrs = attrs.toMap())  
fun Html.dfn(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("dfn", classes, attrs.toMap())  

fun Html.dialog(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("dialog", attrs = attrs.toMap(), content = content)  
fun Html.dialog(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("dialog", classes, attrs.toMap(), content)  
fun Html.dialog(vararg attrs: Pair<String, Any>) =  
tag("dialog", attrs = attrs.toMap())  
fun Html.dialog(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("dialog", classes, attrs.toMap())  

fun Html.div(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("div", attrs = attrs.toMap(), content = content)  
fun Html.div(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("div", classes, attrs.toMap(), content)  
fun Html.div(vararg attrs: Pair<String, Any>) =  
tag("div", attrs = attrs.toMap())  
fun Html.div(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("div", classes, attrs.toMap())  

fun Html.dl(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("dl", attrs = attrs.toMap(), content = content)  
fun Html.dl(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("dl", classes, attrs.toMap(), content)  
fun Html.dl(vararg attrs: Pair<String, Any>) =  
tag("dl", attrs = attrs.toMap())  
fun Html.dl(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("dl", classes, attrs.toMap())  

fun Html.dt(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("dt", attrs = attrs.toMap(), content = content)  
fun Html.dt(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("dt", classes, attrs.toMap(), content)  
fun Html.dt(vararg attrs: Pair<String, Any>) =  
tag("dt", attrs = attrs.toMap())  
fun Html.dt(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("dt", classes, attrs.toMap())  

fun Html.em(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("em", attrs = attrs.toMap(), content = content)  
fun Html.em(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("em", classes, attrs.toMap(), content)  
fun Html.em(vararg attrs: Pair<String, Any>) =  
tag("em", attrs = attrs.toMap())  
fun Html.em(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("em", classes, attrs.toMap())  

fun Html.embed(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("embed", attrs = attrs.toMap(), content = content)  
fun Html.embed(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("embed", classes, attrs.toMap(), content)  
fun Html.embed(vararg attrs: Pair<String, Any>) =  
tag("embed", attrs = attrs.toMap())  
fun Html.embed(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("embed", classes, attrs.toMap())  

fun Html.fieldset(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("fieldset", attrs = attrs.toMap(), content = content)  
fun Html.fieldset(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("fieldset", classes, attrs.toMap(), content)  
fun Html.fieldset(vararg attrs: Pair<String, Any>) =  
tag("fieldset", attrs = attrs.toMap())  
fun Html.fieldset(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("fieldset", classes, attrs.toMap())  

fun Html.figcaption(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("figcaption", attrs = attrs.toMap(), content = content)  
fun Html.figcaption(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("figcaption", classes, attrs.toMap(), content)  
fun Html.figcaption(vararg attrs: Pair<String, Any>) =  
tag("figcaption", attrs = attrs.toMap())  
fun Html.figcaption(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("figcaption", classes, attrs.toMap())  

fun Html.figure(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("figure", attrs = attrs.toMap(), content = content)  
fun Html.figure(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("figure", classes, attrs.toMap(), content)  
fun Html.figure(vararg attrs: Pair<String, Any>) =  
tag("figure", attrs = attrs.toMap())  
fun Html.figure(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("figure", classes, attrs.toMap())  

fun Html.footer(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("footer", attrs = attrs.toMap(), content = content)  
fun Html.footer(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("footer", classes, attrs.toMap(), content)  
fun Html.footer(vararg attrs: Pair<String, Any>) =  
tag("footer", attrs = attrs.toMap())  
fun Html.footer(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("footer", classes, attrs.toMap())  

fun Html.form(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("form", attrs = attrs.toMap(), content = content)  
fun Html.form(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("form", classes, attrs.toMap(), content)  
fun Html.form(vararg attrs: Pair<String, Any>) =  
tag("form", attrs = attrs.toMap())  
fun Html.form(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("form", classes, attrs.toMap())  

fun Html.h1(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("h1", attrs = attrs.toMap(), content = content)  
fun Html.h1(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("h1", classes, attrs.toMap(), content)  
fun Html.h1(vararg attrs: Pair<String, Any>) =  
tag("h1", attrs = attrs.toMap())  
fun Html.h1(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("h1", classes, attrs.toMap())  

fun Html.h2(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("h2", attrs = attrs.toMap(), content = content)  
fun Html.h2(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("h2", classes, attrs.toMap(), content)  
fun Html.h2(vararg attrs: Pair<String, Any>) =  
tag("h2", attrs = attrs.toMap())  
fun Html.h2(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("h2", classes, attrs.toMap())  

fun Html.h3(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("h3", attrs = attrs.toMap(), content = content)  
fun Html.h3(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("h3", classes, attrs.toMap(), content)  
fun Html.h3(vararg attrs: Pair<String, Any>) =  
tag("h3", attrs = attrs.toMap())  
fun Html.h3(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("h3", classes, attrs.toMap())  

fun Html.h4(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("h4", attrs = attrs.toMap(), content = content)  
fun Html.h4(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("h4", classes, attrs.toMap(), content)  
fun Html.h4(vararg attrs: Pair<String, Any>) =  
tag("h4", attrs = attrs.toMap())  
fun Html.h4(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("h4", classes, attrs.toMap())  

fun Html.h5(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("h5", attrs = attrs.toMap(), content = content)  
fun Html.h5(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("h5", classes, attrs.toMap(), content)  
fun Html.h5(vararg attrs: Pair<String, Any>) =  
tag("h5", attrs = attrs.toMap())  
fun Html.h5(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("h5", classes, attrs.toMap())  

fun Html.h6(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("h6", attrs = attrs.toMap(), content = content)  
fun Html.h6(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("h6", classes, attrs.toMap(), content)  
fun Html.h6(vararg attrs: Pair<String, Any>) =  
tag("h6", attrs = attrs.toMap())  
fun Html.h6(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("h6", classes, attrs.toMap())  

fun Html.head(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("head", attrs = attrs.toMap(), content = content)  
fun Html.head(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("head", classes, attrs.toMap(), content)  
fun Html.head(vararg attrs: Pair<String, Any>) =  
tag("head", attrs = attrs.toMap())  
fun Html.head(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("head", classes, attrs.toMap())  

fun Html.header(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("header", attrs = attrs.toMap(), content = content)  
fun Html.header(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("header", classes, attrs.toMap(), content)  
fun Html.header(vararg attrs: Pair<String, Any>) =  
tag("header", attrs = attrs.toMap())  
fun Html.header(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("header", classes, attrs.toMap())  

fun Html.hgroup(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("hgroup", attrs = attrs.toMap(), content = content)  
fun Html.hgroup(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("hgroup", classes, attrs.toMap(), content)  
fun Html.hgroup(vararg attrs: Pair<String, Any>) =  
tag("hgroup", attrs = attrs.toMap())  
fun Html.hgroup(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("hgroup", classes, attrs.toMap())  

fun Html.hr(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("hr", attrs = attrs.toMap(), content = content)  
fun Html.hr(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("hr", classes, attrs.toMap(), content)  
fun Html.hr(vararg attrs: Pair<String, Any>) =  
tag("hr", attrs = attrs.toMap())  
fun Html.hr(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("hr", classes, attrs.toMap())  

fun Html.html(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("html", attrs = attrs.toMap(), content = content)  
fun Html.html(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("html", classes, attrs.toMap(), content)  
fun Html.html(vararg attrs: Pair<String, Any>) =  
tag("html", attrs = attrs.toMap())  
fun Html.html(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("html", classes, attrs.toMap())  

fun Html.i(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("i", attrs = attrs.toMap(), content = content)  
fun Html.i(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("i", classes, attrs.toMap(), content)  
fun Html.i(vararg attrs: Pair<String, Any>) =  
tag("i", attrs = attrs.toMap())  
fun Html.i(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("i", classes, attrs.toMap())  

fun Html.iframe(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("iframe", attrs = attrs.toMap(), content = content)  
fun Html.iframe(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("iframe", classes, attrs.toMap(), content)  
fun Html.iframe(vararg attrs: Pair<String, Any>) =  
tag("iframe", attrs = attrs.toMap())  
fun Html.iframe(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("iframe", classes, attrs.toMap())  

fun Html.img(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("img", attrs = attrs.toMap(), content = content)  
fun Html.img(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("img", classes, attrs.toMap(), content)  
fun Html.img(vararg attrs: Pair<String, Any>) =  
tag("img", attrs = attrs.toMap())  
fun Html.img(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("img", classes, attrs.toMap())  

fun Html.input(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("input", attrs = attrs.toMap(), content = content)  
fun Html.input(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("input", classes, attrs.toMap(), content)  
fun Html.input(vararg attrs: Pair<String, Any>) =  
tag("input", attrs = attrs.toMap())  
fun Html.input(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("input", classes, attrs.toMap())  

fun Html.ins(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("ins", attrs = attrs.toMap(), content = content)  
fun Html.ins(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("ins", classes, attrs.toMap(), content)  
fun Html.ins(vararg attrs: Pair<String, Any>) =  
tag("ins", attrs = attrs.toMap())  
fun Html.ins(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("ins", classes, attrs.toMap())  

fun Html.kbd(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("kbd", attrs = attrs.toMap(), content = content)  
fun Html.kbd(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("kbd", classes, attrs.toMap(), content)  
fun Html.kbd(vararg attrs: Pair<String, Any>) =  
tag("kbd", attrs = attrs.toMap())  
fun Html.kbd(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("kbd", classes, attrs.toMap())  

fun Html.label(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("label", attrs = attrs.toMap(), content = content)  
fun Html.label(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("label", classes, attrs.toMap(), content)  
fun Html.label(vararg attrs: Pair<String, Any>) =  
tag("label", attrs = attrs.toMap())  
fun Html.label(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("label", classes, attrs.toMap())  

fun Html.legend(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("legend", attrs = attrs.toMap(), content = content)  
fun Html.legend(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("legend", classes, attrs.toMap(), content)  
fun Html.legend(vararg attrs: Pair<String, Any>) =  
tag("legend", attrs = attrs.toMap())  
fun Html.legend(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("legend", classes, attrs.toMap())  

fun Html.li(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("li", attrs = attrs.toMap(), content = content)  
fun Html.li(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("li", classes, attrs.toMap(), content)  
fun Html.li(vararg attrs: Pair<String, Any>) =  
tag("li", attrs = attrs.toMap())  
fun Html.li(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("li", classes, attrs.toMap())  

fun Html.link(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("link", attrs = attrs.toMap(), content = content)  
fun Html.link(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("link", classes, attrs.toMap(), content)  
fun Html.link(vararg attrs: Pair<String, Any>) =  
tag("link", attrs = attrs.toMap())  
fun Html.link(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("link", classes, attrs.toMap())  

fun Html.main(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("main", attrs = attrs.toMap(), content = content)  
fun Html.main(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("main", classes, attrs.toMap(), content)  
fun Html.main(vararg attrs: Pair<String, Any>) =  
tag("main", attrs = attrs.toMap())  
fun Html.main(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("main", classes, attrs.toMap())  

fun Html.map(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("map", attrs = attrs.toMap(), content = content)  
fun Html.map(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("map", classes, attrs.toMap(), content)  
fun Html.map(vararg attrs: Pair<String, Any>) =  
tag("map", attrs = attrs.toMap())  
fun Html.map(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("map", classes, attrs.toMap())  

fun Html.mark(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("mark", attrs = attrs.toMap(), content = content)  
fun Html.mark(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("mark", classes, attrs.toMap(), content)  
fun Html.mark(vararg attrs: Pair<String, Any>) =  
tag("mark", attrs = attrs.toMap())  
fun Html.mark(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("mark", classes, attrs.toMap())  

fun Html.meta(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("meta", attrs = attrs.toMap(), content = content)  
fun Html.meta(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("meta", classes, attrs.toMap(), content)  
fun Html.meta(vararg attrs: Pair<String, Any>) =  
tag("meta", attrs = attrs.toMap())  
fun Html.meta(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("meta", classes, attrs.toMap())  

fun Html.meter(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("meter", attrs = attrs.toMap(), content = content)  
fun Html.meter(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("meter", classes, attrs.toMap(), content)  
fun Html.meter(vararg attrs: Pair<String, Any>) =  
tag("meter", attrs = attrs.toMap())  
fun Html.meter(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("meter", classes, attrs.toMap())  

fun Html.nav(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("nav", attrs = attrs.toMap(), content = content)  
fun Html.nav(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("nav", classes, attrs.toMap(), content)  
fun Html.nav(vararg attrs: Pair<String, Any>) =  
tag("nav", attrs = attrs.toMap())  
fun Html.nav(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("nav", classes, attrs.toMap())  

fun Html.noscript(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("noscript", attrs = attrs.toMap(), content = content)  
fun Html.noscript(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("noscript", classes, attrs.toMap(), content)  
fun Html.noscript(vararg attrs: Pair<String, Any>) =  
tag("noscript", attrs = attrs.toMap())  
fun Html.noscript(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("noscript", classes, attrs.toMap())  

fun Html.`object`(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("object", attrs = attrs.toMap(), content = content)  
fun Html.`object`(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("object", classes, attrs.toMap(), content)  
fun Html.`object`(vararg attrs: Pair<String, Any>) =  
tag("object", attrs = attrs.toMap())  
fun Html.`object`(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("object", classes, attrs.toMap())  

fun Html.ol(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("ol", attrs = attrs.toMap(), content = content)  
fun Html.ol(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("ol", classes, attrs.toMap(), content)  
fun Html.ol(vararg attrs: Pair<String, Any>) =  
tag("ol", attrs = attrs.toMap())  
fun Html.ol(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("ol", classes, attrs.toMap())  

fun Html.optgroup(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("optgroup", attrs = attrs.toMap(), content = content)  
fun Html.optgroup(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("optgroup", classes, attrs.toMap(), content)  
fun Html.optgroup(vararg attrs: Pair<String, Any>) =  
tag("optgroup", attrs = attrs.toMap())  
fun Html.optgroup(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("optgroup", classes, attrs.toMap())  

fun Html.option(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("option", attrs = attrs.toMap(), content = content)  
fun Html.option(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("option", classes, attrs.toMap(), content)  
fun Html.option(vararg attrs: Pair<String, Any>) =  
tag("option", attrs = attrs.toMap())  
fun Html.option(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("option", classes, attrs.toMap())  

fun Html.output(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("output", attrs = attrs.toMap(), content = content)  
fun Html.output(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("output", classes, attrs.toMap(), content)  
fun Html.output(vararg attrs: Pair<String, Any>) =  
tag("output", attrs = attrs.toMap())  
fun Html.output(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("output", classes, attrs.toMap())  

fun Html.p(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("p", attrs = attrs.toMap(), content = content)  
fun Html.p(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("p", classes, attrs.toMap(), content)  
fun Html.p(vararg attrs: Pair<String, Any>) =  
tag("p", attrs = attrs.toMap())  
fun Html.p(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("p", classes, attrs.toMap())  

fun Html.param(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("param", attrs = attrs.toMap(), content = content)  
fun Html.param(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("param", classes, attrs.toMap(), content)  
fun Html.param(vararg attrs: Pair<String, Any>) =  
tag("param", attrs = attrs.toMap())  
fun Html.param(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("param", classes, attrs.toMap())  

fun Html.picture(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("picture", attrs = attrs.toMap(), content = content)  
fun Html.picture(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("picture", classes, attrs.toMap(), content)  
fun Html.picture(vararg attrs: Pair<String, Any>) =  
tag("picture", attrs = attrs.toMap())  
fun Html.picture(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("picture", classes, attrs.toMap())  

fun Html.pre(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("pre", attrs = attrs.toMap(), content = content)  
fun Html.pre(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("pre", classes, attrs.toMap(), content)  
fun Html.pre(vararg attrs: Pair<String, Any>) =  
tag("pre", attrs = attrs.toMap())  
fun Html.pre(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("pre", classes, attrs.toMap())  

fun Html.progress(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("progress", attrs = attrs.toMap(), content = content)  
fun Html.progress(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("progress", classes, attrs.toMap(), content)  
fun Html.progress(vararg attrs: Pair<String, Any>) =  
tag("progress", attrs = attrs.toMap())  
fun Html.progress(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("progress", classes, attrs.toMap())  

fun Html.q(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("q", attrs = attrs.toMap(), content = content)  
fun Html.q(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("q", classes, attrs.toMap(), content)  
fun Html.q(vararg attrs: Pair<String, Any>) =  
tag("q", attrs = attrs.toMap())  
fun Html.q(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("q", classes, attrs.toMap())  

fun Html.rb(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("rb", attrs = attrs.toMap(), content = content)  
fun Html.rb(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("rb", classes, attrs.toMap(), content)  
fun Html.rb(vararg attrs: Pair<String, Any>) =  
tag("rb", attrs = attrs.toMap())  
fun Html.rb(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("rb", classes, attrs.toMap())  

fun Html.rp(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("rp", attrs = attrs.toMap(), content = content)  
fun Html.rp(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("rp", classes, attrs.toMap(), content)  
fun Html.rp(vararg attrs: Pair<String, Any>) =  
tag("rp", attrs = attrs.toMap())  
fun Html.rp(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("rp", classes, attrs.toMap())  

fun Html.rt(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("rt", attrs = attrs.toMap(), content = content)  
fun Html.rt(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("rt", classes, attrs.toMap(), content)  
fun Html.rt(vararg attrs: Pair<String, Any>) =  
tag("rt", attrs = attrs.toMap())  
fun Html.rt(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("rt", classes, attrs.toMap())  

fun Html.rtc(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("rtc", attrs = attrs.toMap(), content = content)  
fun Html.rtc(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("rtc", classes, attrs.toMap(), content)  
fun Html.rtc(vararg attrs: Pair<String, Any>) =  
tag("rtc", attrs = attrs.toMap())  
fun Html.rtc(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("rtc", classes, attrs.toMap())  

fun Html.ruby(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("ruby", attrs = attrs.toMap(), content = content)  
fun Html.ruby(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("ruby", classes, attrs.toMap(), content)  
fun Html.ruby(vararg attrs: Pair<String, Any>) =  
tag("ruby", attrs = attrs.toMap())  
fun Html.ruby(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("ruby", classes, attrs.toMap())  

fun Html.s(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("s", attrs = attrs.toMap(), content = content)  
fun Html.s(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("s", classes, attrs.toMap(), content)  
fun Html.s(vararg attrs: Pair<String, Any>) =  
tag("s", attrs = attrs.toMap())  
fun Html.s(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("s", classes, attrs.toMap())  

fun Html.samp(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("samp", attrs = attrs.toMap(), content = content)  
fun Html.samp(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("samp", classes, attrs.toMap(), content)  
fun Html.samp(vararg attrs: Pair<String, Any>) =  
tag("samp", attrs = attrs.toMap())  
fun Html.samp(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("samp", classes, attrs.toMap())  

fun Html.script(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("script", attrs = attrs.toMap(), content = content)  
fun Html.script(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("script", classes, attrs.toMap(), content)  
fun Html.script(vararg attrs: Pair<String, Any>) =  
tag("script", attrs = attrs.toMap())  
fun Html.script(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("script", classes, attrs.toMap())  

fun Html.section(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("section", attrs = attrs.toMap(), content = content)  
fun Html.section(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("section", classes, attrs.toMap(), content)  
fun Html.section(vararg attrs: Pair<String, Any>) =  
tag("section", attrs = attrs.toMap())  
fun Html.section(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("section", classes, attrs.toMap())  

fun Html.select(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("select", attrs = attrs.toMap(), content = content)  
fun Html.select(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("select", classes, attrs.toMap(), content)  
fun Html.select(vararg attrs: Pair<String, Any>) =  
tag("select", attrs = attrs.toMap())  
fun Html.select(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("select", classes, attrs.toMap())  

fun Html.slot(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("slot", attrs = attrs.toMap(), content = content)  
fun Html.slot(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("slot", classes, attrs.toMap(), content)  
fun Html.slot(vararg attrs: Pair<String, Any>) =  
tag("slot", attrs = attrs.toMap())  
fun Html.slot(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("slot", classes, attrs.toMap())  

fun Html.small(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("small", attrs = attrs.toMap(), content = content)  
fun Html.small(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("small", classes, attrs.toMap(), content)  
fun Html.small(vararg attrs: Pair<String, Any>) =  
tag("small", attrs = attrs.toMap())  
fun Html.small(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("small", classes, attrs.toMap())  

fun Html.source(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("source", attrs = attrs.toMap(), content = content)  
fun Html.source(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("source", classes, attrs.toMap(), content)  
fun Html.source(vararg attrs: Pair<String, Any>) =  
tag("source", attrs = attrs.toMap())  
fun Html.source(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("source", classes, attrs.toMap())  

fun Html.span(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("span", attrs = attrs.toMap(), content = content)  
fun Html.span(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("span", classes, attrs.toMap(), content)  
fun Html.span(vararg attrs: Pair<String, Any>) =  
tag("span", attrs = attrs.toMap())  
fun Html.span(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("span", classes, attrs.toMap())  

fun Html.strong(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("strong", attrs = attrs.toMap(), content = content)  
fun Html.strong(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("strong", classes, attrs.toMap(), content)  
fun Html.strong(vararg attrs: Pair<String, Any>) =  
tag("strong", attrs = attrs.toMap())  
fun Html.strong(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("strong", classes, attrs.toMap())  

fun Html.style(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("style", attrs = attrs.toMap(), content = content)  
fun Html.style(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("style", classes, attrs.toMap(), content)  
fun Html.style(vararg attrs: Pair<String, Any>) =  
tag("style", attrs = attrs.toMap())  
fun Html.style(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("style", classes, attrs.toMap())  

fun Html.sub(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("sub", attrs = attrs.toMap(), content = content)  
fun Html.sub(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("sub", classes, attrs.toMap(), content)  
fun Html.sub(vararg attrs: Pair<String, Any>) =  
tag("sub", attrs = attrs.toMap())  
fun Html.sub(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("sub", classes, attrs.toMap())  

fun Html.summary(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("summary", attrs = attrs.toMap(), content = content)  
fun Html.summary(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("summary", classes, attrs.toMap(), content)  
fun Html.summary(vararg attrs: Pair<String, Any>) =  
tag("summary", attrs = attrs.toMap())  
fun Html.summary(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("summary", classes, attrs.toMap())  

fun Html.sup(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("sup", attrs = attrs.toMap(), content = content)  
fun Html.sup(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("sup", classes, attrs.toMap(), content)  
fun Html.sup(vararg attrs: Pair<String, Any>) =  
tag("sup", attrs = attrs.toMap())  
fun Html.sup(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("sup", classes, attrs.toMap())  

fun Html.svg(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("svg", attrs = attrs.toMap(), content = content)  
fun Html.svg(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("svg", classes, attrs.toMap(), content)  
fun Html.svg(vararg attrs: Pair<String, Any>) =  
tag("svg", attrs = attrs.toMap())  
fun Html.svg(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("svg", classes, attrs.toMap())  

fun Html.table(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("table", attrs = attrs.toMap(), content = content)  
fun Html.table(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("table", classes, attrs.toMap(), content)  
fun Html.table(vararg attrs: Pair<String, Any>) =  
tag("table", attrs = attrs.toMap())  
fun Html.table(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("table", classes, attrs.toMap())  

fun Html.tbody(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("tbody", attrs = attrs.toMap(), content = content)  
fun Html.tbody(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("tbody", classes, attrs.toMap(), content)  
fun Html.tbody(vararg attrs: Pair<String, Any>) =  
tag("tbody", attrs = attrs.toMap())  
fun Html.tbody(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("tbody", classes, attrs.toMap())  

fun Html.td(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("td", attrs = attrs.toMap(), content = content)  
fun Html.td(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("td", classes, attrs.toMap(), content)  
fun Html.td(vararg attrs: Pair<String, Any>) =  
tag("td", attrs = attrs.toMap())  
fun Html.td(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("td", classes, attrs.toMap())  

fun Html.template(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("template", attrs = attrs.toMap(), content = content)  
fun Html.template(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("template", classes, attrs.toMap(), content)  
fun Html.template(vararg attrs: Pair<String, Any>) =  
tag("template", attrs = attrs.toMap())  
fun Html.template(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("template", classes, attrs.toMap())  

fun Html.textarea(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("textarea", attrs = attrs.toMap(), content = content)  
fun Html.textarea(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("textarea", classes, attrs.toMap(), content)  
fun Html.textarea(vararg attrs: Pair<String, Any>) =  
tag("textarea", attrs = attrs.toMap())  
fun Html.textarea(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("textarea", classes, attrs.toMap())  

fun Html.tfoot(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("tfoot", attrs = attrs.toMap(), content = content)  
fun Html.tfoot(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("tfoot", classes, attrs.toMap(), content)  
fun Html.tfoot(vararg attrs: Pair<String, Any>) =  
tag("tfoot", attrs = attrs.toMap())  
fun Html.tfoot(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("tfoot", classes, attrs.toMap())  

fun Html.th(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("th", attrs = attrs.toMap(), content = content)  
fun Html.th(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("th", classes, attrs.toMap(), content)  
fun Html.th(vararg attrs: Pair<String, Any>) =  
tag("th", attrs = attrs.toMap())  
fun Html.th(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("th", classes, attrs.toMap())  

fun Html.thead(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("thead", attrs = attrs.toMap(), content = content)  
fun Html.thead(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("thead", classes, attrs.toMap(), content)  
fun Html.thead(vararg attrs: Pair<String, Any>) =  
tag("thead", attrs = attrs.toMap())  
fun Html.thead(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("thead", classes, attrs.toMap())  

fun Html.time(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("time", attrs = attrs.toMap(), content = content)  
fun Html.time(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("time", classes, attrs.toMap(), content)  
fun Html.time(vararg attrs: Pair<String, Any>) =  
tag("time", attrs = attrs.toMap())  
fun Html.time(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("time", classes, attrs.toMap())  

fun Html.title(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("title", attrs = attrs.toMap(), content = content)  
fun Html.title(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("title", classes, attrs.toMap(), content)  
fun Html.title(vararg attrs: Pair<String, Any>) =  
tag("title", attrs = attrs.toMap())  
fun Html.title(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("title", classes, attrs.toMap())  

fun Html.tr(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("tr", attrs = attrs.toMap(), content = content)  
fun Html.tr(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("tr", classes, attrs.toMap(), content)  
fun Html.tr(vararg attrs: Pair<String, Any>) =  
tag("tr", attrs = attrs.toMap())  
fun Html.tr(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("tr", classes, attrs.toMap())  

fun Html.track(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("track", attrs = attrs.toMap(), content = content)  
fun Html.track(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("track", classes, attrs.toMap(), content)  
fun Html.track(vararg attrs: Pair<String, Any>) =  
tag("track", attrs = attrs.toMap())  
fun Html.track(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("track", classes, attrs.toMap())  

fun Html.u(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("u", attrs = attrs.toMap(), content = content)  
fun Html.u(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("u", classes, attrs.toMap(), content)  
fun Html.u(vararg attrs: Pair<String, Any>) =  
tag("u", attrs = attrs.toMap())  
fun Html.u(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("u", classes, attrs.toMap())  

fun Html.ul(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("ul", attrs = attrs.toMap(), content = content)  
fun Html.ul(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("ul", classes, attrs.toMap(), content)  
fun Html.ul(vararg attrs: Pair<String, Any>) =  
tag("ul", attrs = attrs.toMap())  
fun Html.ul(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("ul", classes, attrs.toMap())  

fun Html.`var`(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("var", attrs = attrs.toMap(), content = content)  
fun Html.`var`(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("var", classes, attrs.toMap(), content)  
fun Html.`var`(vararg attrs: Pair<String, Any>) =  
tag("var", attrs = attrs.toMap())  
fun Html.`var`(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("var", classes, attrs.toMap())  

fun Html.video(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("video", attrs = attrs.toMap(), content = content)  
fun Html.video(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("video", classes, attrs.toMap(), content)  
fun Html.video(vararg attrs: Pair<String, Any>) =  
tag("video", attrs = attrs.toMap())  
fun Html.video(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("video", classes, attrs.toMap())  

fun Html.wbr(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("wbr", attrs = attrs.toMap(), content = content)  
fun Html.wbr(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("wbr", classes, attrs.toMap(), content)  
fun Html.wbr(vararg attrs: Pair<String, Any>) =  
tag("wbr", attrs = attrs.toMap())  
fun Html.wbr(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("wbr", classes, attrs.toMap())  

