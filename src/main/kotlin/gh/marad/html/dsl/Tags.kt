@file:Suppress("unused", "SpellCheckingInspection")

package gh.marad.html.dsl

fun Html.a(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("a", attrs = attrs, content = content)  
fun Html.a(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("a", classes = classes, attrs = attrs, content)  
fun Html.a(vararg attrs: Pair<String, Any>) =  
    tag("a", attrs = attrs)  
fun Html.a(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("a", classes = classes, attrs = attrs)  

fun Html.abbr(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("abbr", attrs = attrs, content = content)  
fun Html.abbr(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("abbr", classes = classes, attrs = attrs, content)  
fun Html.abbr(vararg attrs: Pair<String, Any>) =  
    tag("abbr", attrs = attrs)  
fun Html.abbr(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("abbr", classes = classes, attrs = attrs)  

fun Html.address(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("address", attrs = attrs, content = content)  
fun Html.address(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("address", classes = classes, attrs = attrs, content)  
fun Html.address(vararg attrs: Pair<String, Any>) =  
    tag("address", attrs = attrs)  
fun Html.address(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("address", classes = classes, attrs = attrs)  

fun Html.area(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("area", attrs = attrs, content = content)  
fun Html.area(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("area", classes = classes, attrs = attrs, content)  
fun Html.area(vararg attrs: Pair<String, Any>) =  
    tag("area", attrs = attrs)  
fun Html.area(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("area", classes = classes, attrs = attrs)  

fun Html.article(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("article", attrs = attrs, content = content)  
fun Html.article(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("article", classes = classes, attrs = attrs, content)  
fun Html.article(vararg attrs: Pair<String, Any>) =  
    tag("article", attrs = attrs)  
fun Html.article(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("article", classes = classes, attrs = attrs)  

fun Html.aside(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("aside", attrs = attrs, content = content)  
fun Html.aside(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("aside", classes = classes, attrs = attrs, content)  
fun Html.aside(vararg attrs: Pair<String, Any>) =  
    tag("aside", attrs = attrs)  
fun Html.aside(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("aside", classes = classes, attrs = attrs)  

fun Html.audio(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("audio", attrs = attrs, content = content)  
fun Html.audio(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("audio", classes = classes, attrs = attrs, content)  
fun Html.audio(vararg attrs: Pair<String, Any>) =  
    tag("audio", attrs = attrs)  
fun Html.audio(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("audio", classes = classes, attrs = attrs)  

fun Html.b(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("b", attrs = attrs, content = content)  
fun Html.b(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("b", classes = classes, attrs = attrs, content)  
fun Html.b(vararg attrs: Pair<String, Any>) =  
    tag("b", attrs = attrs)  
fun Html.b(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("b", classes = classes, attrs = attrs)  

fun Html.base(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("base", attrs = attrs, content = content)  
fun Html.base(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("base", classes = classes, attrs = attrs, content)  
fun Html.base(vararg attrs: Pair<String, Any>) =  
    tag("base", attrs = attrs)  
fun Html.base(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("base", classes = classes, attrs = attrs)  

fun Html.bdi(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("bdi", attrs = attrs, content = content)  
fun Html.bdi(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("bdi", classes = classes, attrs = attrs, content)  
fun Html.bdi(vararg attrs: Pair<String, Any>) =  
    tag("bdi", attrs = attrs)  
fun Html.bdi(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("bdi", classes = classes, attrs = attrs)  

fun Html.bdo(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("bdo", attrs = attrs, content = content)  
fun Html.bdo(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("bdo", classes = classes, attrs = attrs, content)  
fun Html.bdo(vararg attrs: Pair<String, Any>) =  
    tag("bdo", attrs = attrs)  
fun Html.bdo(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("bdo", classes = classes, attrs = attrs)  

fun Html.blockquote(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("blockquote", attrs = attrs, content = content)  
fun Html.blockquote(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("blockquote", classes = classes, attrs = attrs, content)  
fun Html.blockquote(vararg attrs: Pair<String, Any>) =  
    tag("blockquote", attrs = attrs)  
fun Html.blockquote(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("blockquote", classes = classes, attrs = attrs)  

fun Html.body(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("body", attrs = attrs, content = content)  
fun Html.body(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("body", classes = classes, attrs = attrs, content)  
fun Html.body(vararg attrs: Pair<String, Any>) =  
    tag("body", attrs = attrs)  
fun Html.body(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("body", classes = classes, attrs = attrs)  

fun Html.br(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("br", attrs = attrs, content = content)  
fun Html.br(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("br", classes = classes, attrs = attrs, content)  
fun Html.br(vararg attrs: Pair<String, Any>) =  
    tag("br", attrs = attrs)  
fun Html.br(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("br", classes = classes, attrs = attrs)  

fun Html.button(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("button", attrs = attrs, content = content)  
fun Html.button(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("button", classes = classes, attrs = attrs, content)  
fun Html.button(vararg attrs: Pair<String, Any>) =  
    tag("button", attrs = attrs)  
fun Html.button(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("button", classes = classes, attrs = attrs)  

fun Html.canvas(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("canvas", attrs = attrs, content = content)  
fun Html.canvas(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("canvas", classes = classes, attrs = attrs, content)  
fun Html.canvas(vararg attrs: Pair<String, Any>) =  
    tag("canvas", attrs = attrs)  
fun Html.canvas(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("canvas", classes = classes, attrs = attrs)  

fun Html.caption(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("caption", attrs = attrs, content = content)  
fun Html.caption(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("caption", classes = classes, attrs = attrs, content)  
fun Html.caption(vararg attrs: Pair<String, Any>) =  
    tag("caption", attrs = attrs)  
fun Html.caption(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("caption", classes = classes, attrs = attrs)  

fun Html.cite(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("cite", attrs = attrs, content = content)  
fun Html.cite(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("cite", classes = classes, attrs = attrs, content)  
fun Html.cite(vararg attrs: Pair<String, Any>) =  
    tag("cite", attrs = attrs)  
fun Html.cite(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("cite", classes = classes, attrs = attrs)  

fun Html.code(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("code", attrs = attrs, content = content)  
fun Html.code(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("code", classes = classes, attrs = attrs, content)  
fun Html.code(vararg attrs: Pair<String, Any>) =  
    tag("code", attrs = attrs)  
fun Html.code(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("code", classes = classes, attrs = attrs)  

fun Html.col(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("col", attrs = attrs, content = content)  
fun Html.col(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("col", classes = classes, attrs = attrs, content)  
fun Html.col(vararg attrs: Pair<String, Any>) =  
    tag("col", attrs = attrs)  
fun Html.col(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("col", classes = classes, attrs = attrs)  

fun Html.colgroup(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("colgroup", attrs = attrs, content = content)  
fun Html.colgroup(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("colgroup", classes = classes, attrs = attrs, content)  
fun Html.colgroup(vararg attrs: Pair<String, Any>) =  
    tag("colgroup", attrs = attrs)  
fun Html.colgroup(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("colgroup", classes = classes, attrs = attrs)  

fun Html.data(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("data", attrs = attrs, content = content)  
fun Html.data(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("data", classes = classes, attrs = attrs, content)  
fun Html.data(vararg attrs: Pair<String, Any>) =  
    tag("data", attrs = attrs)  
fun Html.data(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("data", classes = classes, attrs = attrs)  

fun Html.datalist(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("datalist", attrs = attrs, content = content)  
fun Html.datalist(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("datalist", classes = classes, attrs = attrs, content)  
fun Html.datalist(vararg attrs: Pair<String, Any>) =  
    tag("datalist", attrs = attrs)  
fun Html.datalist(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("datalist", classes = classes, attrs = attrs)  

fun Html.dd(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("dd", attrs = attrs, content = content)  
fun Html.dd(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("dd", classes = classes, attrs = attrs, content)  
fun Html.dd(vararg attrs: Pair<String, Any>) =  
    tag("dd", attrs = attrs)  
fun Html.dd(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("dd", classes = classes, attrs = attrs)  

fun Html.del(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("del", attrs = attrs, content = content)  
fun Html.del(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("del", classes = classes, attrs = attrs, content)  
fun Html.del(vararg attrs: Pair<String, Any>) =  
    tag("del", attrs = attrs)  
fun Html.del(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("del", classes = classes, attrs = attrs)  

fun Html.details(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("details", attrs = attrs, content = content)  
fun Html.details(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("details", classes = classes, attrs = attrs, content)  
fun Html.details(vararg attrs: Pair<String, Any>) =  
    tag("details", attrs = attrs)  
fun Html.details(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("details", classes = classes, attrs = attrs)  

fun Html.dfn(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("dfn", attrs = attrs, content = content)  
fun Html.dfn(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("dfn", classes = classes, attrs = attrs, content)  
fun Html.dfn(vararg attrs: Pair<String, Any>) =  
    tag("dfn", attrs = attrs)  
fun Html.dfn(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("dfn", classes = classes, attrs = attrs)  

fun Html.dialog(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("dialog", attrs = attrs, content = content)  
fun Html.dialog(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("dialog", classes = classes, attrs = attrs, content)  
fun Html.dialog(vararg attrs: Pair<String, Any>) =  
    tag("dialog", attrs = attrs)  
fun Html.dialog(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("dialog", classes = classes, attrs = attrs)  

fun Html.div(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("div", attrs = attrs, content = content)  
fun Html.div(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("div", classes = classes, attrs = attrs, content)  
fun Html.div(vararg attrs: Pair<String, Any>) =  
    tag("div", attrs = attrs)  
fun Html.div(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("div", classes = classes, attrs = attrs)  

fun Html.dl(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("dl", attrs = attrs, content = content)  
fun Html.dl(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("dl", classes = classes, attrs = attrs, content)  
fun Html.dl(vararg attrs: Pair<String, Any>) =  
    tag("dl", attrs = attrs)  
fun Html.dl(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("dl", classes = classes, attrs = attrs)  

fun Html.dt(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("dt", attrs = attrs, content = content)  
fun Html.dt(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("dt", classes = classes, attrs = attrs, content)  
fun Html.dt(vararg attrs: Pair<String, Any>) =  
    tag("dt", attrs = attrs)  
fun Html.dt(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("dt", classes = classes, attrs = attrs)  

fun Html.em(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("em", attrs = attrs, content = content)  
fun Html.em(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("em", classes = classes, attrs = attrs, content)  
fun Html.em(vararg attrs: Pair<String, Any>) =  
    tag("em", attrs = attrs)  
fun Html.em(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("em", classes = classes, attrs = attrs)  

fun Html.embed(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("embed", attrs = attrs, content = content)  
fun Html.embed(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("embed", classes = classes, attrs = attrs, content)  
fun Html.embed(vararg attrs: Pair<String, Any>) =  
    tag("embed", attrs = attrs)  
fun Html.embed(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("embed", classes = classes, attrs = attrs)  

fun Html.fieldset(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("fieldset", attrs = attrs, content = content)  
fun Html.fieldset(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("fieldset", classes = classes, attrs = attrs, content)  
fun Html.fieldset(vararg attrs: Pair<String, Any>) =  
    tag("fieldset", attrs = attrs)  
fun Html.fieldset(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("fieldset", classes = classes, attrs = attrs)  

fun Html.figcaption(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("figcaption", attrs = attrs, content = content)  
fun Html.figcaption(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("figcaption", classes = classes, attrs = attrs, content)  
fun Html.figcaption(vararg attrs: Pair<String, Any>) =  
    tag("figcaption", attrs = attrs)  
fun Html.figcaption(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("figcaption", classes = classes, attrs = attrs)  

fun Html.figure(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("figure", attrs = attrs, content = content)  
fun Html.figure(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("figure", classes = classes, attrs = attrs, content)  
fun Html.figure(vararg attrs: Pair<String, Any>) =  
    tag("figure", attrs = attrs)  
fun Html.figure(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("figure", classes = classes, attrs = attrs)  

fun Html.footer(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("footer", attrs = attrs, content = content)  
fun Html.footer(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("footer", classes = classes, attrs = attrs, content)  
fun Html.footer(vararg attrs: Pair<String, Any>) =  
    tag("footer", attrs = attrs)  
fun Html.footer(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("footer", classes = classes, attrs = attrs)  

fun Html.form(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("form", attrs = attrs, content = content)  
fun Html.form(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("form", classes = classes, attrs = attrs, content)  
fun Html.form(vararg attrs: Pair<String, Any>) =  
    tag("form", attrs = attrs)  
fun Html.form(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("form", classes = classes, attrs = attrs)  

fun Html.h1(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("h1", attrs = attrs, content = content)  
fun Html.h1(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("h1", classes = classes, attrs = attrs, content)  
fun Html.h1(vararg attrs: Pair<String, Any>) =  
    tag("h1", attrs = attrs)  
fun Html.h1(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("h1", classes = classes, attrs = attrs)  

fun Html.h2(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("h2", attrs = attrs, content = content)  
fun Html.h2(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("h2", classes = classes, attrs = attrs, content)  
fun Html.h2(vararg attrs: Pair<String, Any>) =  
    tag("h2", attrs = attrs)  
fun Html.h2(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("h2", classes = classes, attrs = attrs)  

fun Html.h3(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("h3", attrs = attrs, content = content)  
fun Html.h3(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("h3", classes = classes, attrs = attrs, content)  
fun Html.h3(vararg attrs: Pair<String, Any>) =  
    tag("h3", attrs = attrs)  
fun Html.h3(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("h3", classes = classes, attrs = attrs)  

fun Html.h4(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("h4", attrs = attrs, content = content)  
fun Html.h4(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("h4", classes = classes, attrs = attrs, content)  
fun Html.h4(vararg attrs: Pair<String, Any>) =  
    tag("h4", attrs = attrs)  
fun Html.h4(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("h4", classes = classes, attrs = attrs)  

fun Html.h5(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("h5", attrs = attrs, content = content)  
fun Html.h5(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("h5", classes = classes, attrs = attrs, content)  
fun Html.h5(vararg attrs: Pair<String, Any>) =  
    tag("h5", attrs = attrs)  
fun Html.h5(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("h5", classes = classes, attrs = attrs)  

fun Html.h6(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("h6", attrs = attrs, content = content)  
fun Html.h6(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("h6", classes = classes, attrs = attrs, content)  
fun Html.h6(vararg attrs: Pair<String, Any>) =  
    tag("h6", attrs = attrs)  
fun Html.h6(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("h6", classes = classes, attrs = attrs)  

fun Html.head(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("head", attrs = attrs, content = content)  
fun Html.head(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("head", classes = classes, attrs = attrs, content)  
fun Html.head(vararg attrs: Pair<String, Any>) =  
    tag("head", attrs = attrs)  
fun Html.head(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("head", classes = classes, attrs = attrs)  

fun Html.header(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("header", attrs = attrs, content = content)  
fun Html.header(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("header", classes = classes, attrs = attrs, content)  
fun Html.header(vararg attrs: Pair<String, Any>) =  
    tag("header", attrs = attrs)  
fun Html.header(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("header", classes = classes, attrs = attrs)  

fun Html.hgroup(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("hgroup", attrs = attrs, content = content)  
fun Html.hgroup(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("hgroup", classes = classes, attrs = attrs, content)  
fun Html.hgroup(vararg attrs: Pair<String, Any>) =  
    tag("hgroup", attrs = attrs)  
fun Html.hgroup(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("hgroup", classes = classes, attrs = attrs)  

fun Html.hr(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("hr", attrs = attrs, content = content)  
fun Html.hr(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("hr", classes = classes, attrs = attrs, content)  
fun Html.hr(vararg attrs: Pair<String, Any>) =  
    tag("hr", attrs = attrs)  
fun Html.hr(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("hr", classes = classes, attrs = attrs)  

fun Html.html(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("html", attrs = attrs, content = content)  
fun Html.html(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("html", classes = classes, attrs = attrs, content)  
fun Html.html(vararg attrs: Pair<String, Any>) =  
    tag("html", attrs = attrs)  
fun Html.html(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("html", classes = classes, attrs = attrs)  

fun Html.i(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("i", attrs = attrs, content = content)  
fun Html.i(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("i", classes = classes, attrs = attrs, content)  
fun Html.i(vararg attrs: Pair<String, Any>) =  
    tag("i", attrs = attrs)  
fun Html.i(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("i", classes = classes, attrs = attrs)  

fun Html.iframe(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("iframe", attrs = attrs, content = content)  
fun Html.iframe(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("iframe", classes = classes, attrs = attrs, content)  
fun Html.iframe(vararg attrs: Pair<String, Any>) =  
    tag("iframe", attrs = attrs)  
fun Html.iframe(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("iframe", classes = classes, attrs = attrs)  

fun Html.img(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("img", attrs = attrs, content = content)  
fun Html.img(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("img", classes = classes, attrs = attrs, content)  
fun Html.img(vararg attrs: Pair<String, Any>) =  
    tag("img", attrs = attrs)  
fun Html.img(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("img", classes = classes, attrs = attrs)  

fun Html.input(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("input", attrs = attrs, content = content)  
fun Html.input(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("input", classes = classes, attrs = attrs, content)  
fun Html.input(vararg attrs: Pair<String, Any>) =  
    tag("input", attrs = attrs)  
fun Html.input(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("input", classes = classes, attrs = attrs)  

fun Html.ins(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("ins", attrs = attrs, content = content)  
fun Html.ins(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("ins", classes = classes, attrs = attrs, content)  
fun Html.ins(vararg attrs: Pair<String, Any>) =  
    tag("ins", attrs = attrs)  
fun Html.ins(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("ins", classes = classes, attrs = attrs)  

fun Html.kbd(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("kbd", attrs = attrs, content = content)  
fun Html.kbd(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("kbd", classes = classes, attrs = attrs, content)  
fun Html.kbd(vararg attrs: Pair<String, Any>) =  
    tag("kbd", attrs = attrs)  
fun Html.kbd(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("kbd", classes = classes, attrs = attrs)  

fun Html.label(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("label", attrs = attrs, content = content)  
fun Html.label(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("label", classes = classes, attrs = attrs, content)  
fun Html.label(vararg attrs: Pair<String, Any>) =  
    tag("label", attrs = attrs)  
fun Html.label(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("label", classes = classes, attrs = attrs)  

fun Html.legend(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("legend", attrs = attrs, content = content)  
fun Html.legend(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("legend", classes = classes, attrs = attrs, content)  
fun Html.legend(vararg attrs: Pair<String, Any>) =  
    tag("legend", attrs = attrs)  
fun Html.legend(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("legend", classes = classes, attrs = attrs)  

fun Html.li(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("li", attrs = attrs, content = content)  
fun Html.li(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("li", classes = classes, attrs = attrs, content)  
fun Html.li(vararg attrs: Pair<String, Any>) =  
    tag("li", attrs = attrs)  
fun Html.li(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("li", classes = classes, attrs = attrs)  

fun Html.link(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("link", attrs = attrs, content = content)  
fun Html.link(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("link", classes = classes, attrs = attrs, content)  
fun Html.link(vararg attrs: Pair<String, Any>) =  
    tag("link", attrs = attrs)  
fun Html.link(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("link", classes = classes, attrs = attrs)  

fun Html.main(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("main", attrs = attrs, content = content)  
fun Html.main(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("main", classes = classes, attrs = attrs, content)  
fun Html.main(vararg attrs: Pair<String, Any>) =  
    tag("main", attrs = attrs)  
fun Html.main(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("main", classes = classes, attrs = attrs)  

fun Html.map(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("map", attrs = attrs, content = content)  
fun Html.map(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("map", classes = classes, attrs = attrs, content)  
fun Html.map(vararg attrs: Pair<String, Any>) =  
    tag("map", attrs = attrs)  
fun Html.map(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("map", classes = classes, attrs = attrs)  

fun Html.mark(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("mark", attrs = attrs, content = content)  
fun Html.mark(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("mark", classes = classes, attrs = attrs, content)  
fun Html.mark(vararg attrs: Pair<String, Any>) =  
    tag("mark", attrs = attrs)  
fun Html.mark(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("mark", classes = classes, attrs = attrs)  

fun Html.meta(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("meta", attrs = attrs, content = content)  
fun Html.meta(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("meta", classes = classes, attrs = attrs, content)  
fun Html.meta(vararg attrs: Pair<String, Any>) =  
    tag("meta", attrs = attrs)  
fun Html.meta(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("meta", classes = classes, attrs = attrs)  

fun Html.meter(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("meter", attrs = attrs, content = content)  
fun Html.meter(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("meter", classes = classes, attrs = attrs, content)  
fun Html.meter(vararg attrs: Pair<String, Any>) =  
    tag("meter", attrs = attrs)  
fun Html.meter(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("meter", classes = classes, attrs = attrs)  

fun Html.nav(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("nav", attrs = attrs, content = content)  
fun Html.nav(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("nav", classes = classes, attrs = attrs, content)  
fun Html.nav(vararg attrs: Pair<String, Any>) =  
    tag("nav", attrs = attrs)  
fun Html.nav(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("nav", classes = classes, attrs = attrs)  

fun Html.noscript(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("noscript", attrs = attrs, content = content)  
fun Html.noscript(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("noscript", classes = classes, attrs = attrs, content)  
fun Html.noscript(vararg attrs: Pair<String, Any>) =  
    tag("noscript", attrs = attrs)  
fun Html.noscript(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("noscript", classes = classes, attrs = attrs)  

fun Html.`object`(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("object", attrs = attrs, content = content)  
fun Html.`object`(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("object", classes = classes, attrs = attrs, content)  
fun Html.`object`(vararg attrs: Pair<String, Any>) =  
    tag("object", attrs = attrs)  
fun Html.`object`(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("object", classes = classes, attrs = attrs)  

fun Html.ol(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("ol", attrs = attrs, content = content)  
fun Html.ol(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("ol", classes = classes, attrs = attrs, content)  
fun Html.ol(vararg attrs: Pair<String, Any>) =  
    tag("ol", attrs = attrs)  
fun Html.ol(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("ol", classes = classes, attrs = attrs)  

fun Html.optgroup(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("optgroup", attrs = attrs, content = content)  
fun Html.optgroup(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("optgroup", classes = classes, attrs = attrs, content)  
fun Html.optgroup(vararg attrs: Pair<String, Any>) =  
    tag("optgroup", attrs = attrs)  
fun Html.optgroup(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("optgroup", classes = classes, attrs = attrs)  

fun Html.option(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("option", attrs = attrs, content = content)  
fun Html.option(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("option", classes = classes, attrs = attrs, content)  
fun Html.option(vararg attrs: Pair<String, Any>) =  
    tag("option", attrs = attrs)  
fun Html.option(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("option", classes = classes, attrs = attrs)  

fun Html.output(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("output", attrs = attrs, content = content)  
fun Html.output(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("output", classes = classes, attrs = attrs, content)  
fun Html.output(vararg attrs: Pair<String, Any>) =  
    tag("output", attrs = attrs)  
fun Html.output(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("output", classes = classes, attrs = attrs)  

fun Html.p(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("p", attrs = attrs, content = content)  
fun Html.p(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("p", classes = classes, attrs = attrs, content)  
fun Html.p(vararg attrs: Pair<String, Any>) =  
    tag("p", attrs = attrs)  
fun Html.p(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("p", classes = classes, attrs = attrs)  

fun Html.param(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("param", attrs = attrs, content = content)  
fun Html.param(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("param", classes = classes, attrs = attrs, content)  
fun Html.param(vararg attrs: Pair<String, Any>) =  
    tag("param", attrs = attrs)  
fun Html.param(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("param", classes = classes, attrs = attrs)  

fun Html.picture(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("picture", attrs = attrs, content = content)  
fun Html.picture(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("picture", classes = classes, attrs = attrs, content)  
fun Html.picture(vararg attrs: Pair<String, Any>) =  
    tag("picture", attrs = attrs)  
fun Html.picture(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("picture", classes = classes, attrs = attrs)  

fun Html.pre(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("pre", attrs = attrs, content = content)  
fun Html.pre(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("pre", classes = classes, attrs = attrs, content)  
fun Html.pre(vararg attrs: Pair<String, Any>) =  
    tag("pre", attrs = attrs)  
fun Html.pre(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("pre", classes = classes, attrs = attrs)  

fun Html.progress(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("progress", attrs = attrs, content = content)  
fun Html.progress(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("progress", classes = classes, attrs = attrs, content)  
fun Html.progress(vararg attrs: Pair<String, Any>) =  
    tag("progress", attrs = attrs)  
fun Html.progress(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("progress", classes = classes, attrs = attrs)  

fun Html.q(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("q", attrs = attrs, content = content)  
fun Html.q(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("q", classes = classes, attrs = attrs, content)  
fun Html.q(vararg attrs: Pair<String, Any>) =  
    tag("q", attrs = attrs)  
fun Html.q(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("q", classes = classes, attrs = attrs)  

fun Html.rb(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("rb", attrs = attrs, content = content)  
fun Html.rb(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("rb", classes = classes, attrs = attrs, content)  
fun Html.rb(vararg attrs: Pair<String, Any>) =  
    tag("rb", attrs = attrs)  
fun Html.rb(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("rb", classes = classes, attrs = attrs)  

fun Html.rp(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("rp", attrs = attrs, content = content)  
fun Html.rp(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("rp", classes = classes, attrs = attrs, content)  
fun Html.rp(vararg attrs: Pair<String, Any>) =  
    tag("rp", attrs = attrs)  
fun Html.rp(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("rp", classes = classes, attrs = attrs)  

fun Html.rt(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("rt", attrs = attrs, content = content)  
fun Html.rt(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("rt", classes = classes, attrs = attrs, content)  
fun Html.rt(vararg attrs: Pair<String, Any>) =  
    tag("rt", attrs = attrs)  
fun Html.rt(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("rt", classes = classes, attrs = attrs)  

fun Html.rtc(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("rtc", attrs = attrs, content = content)  
fun Html.rtc(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("rtc", classes = classes, attrs = attrs, content)  
fun Html.rtc(vararg attrs: Pair<String, Any>) =  
    tag("rtc", attrs = attrs)  
fun Html.rtc(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("rtc", classes = classes, attrs = attrs)  

fun Html.ruby(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("ruby", attrs = attrs, content = content)  
fun Html.ruby(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("ruby", classes = classes, attrs = attrs, content)  
fun Html.ruby(vararg attrs: Pair<String, Any>) =  
    tag("ruby", attrs = attrs)  
fun Html.ruby(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("ruby", classes = classes, attrs = attrs)  

fun Html.s(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("s", attrs = attrs, content = content)  
fun Html.s(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("s", classes = classes, attrs = attrs, content)  
fun Html.s(vararg attrs: Pair<String, Any>) =  
    tag("s", attrs = attrs)  
fun Html.s(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("s", classes = classes, attrs = attrs)  

fun Html.samp(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("samp", attrs = attrs, content = content)  
fun Html.samp(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("samp", classes = classes, attrs = attrs, content)  
fun Html.samp(vararg attrs: Pair<String, Any>) =  
    tag("samp", attrs = attrs)  
fun Html.samp(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("samp", classes = classes, attrs = attrs)  

fun Html.script(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("script", attrs = attrs, content = content)  
fun Html.script(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("script", classes = classes, attrs = attrs, content)  
fun Html.script(vararg attrs: Pair<String, Any>) =  
    tag("script", attrs = attrs)  
fun Html.script(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("script", classes = classes, attrs = attrs)  

fun Html.section(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("section", attrs = attrs, content = content)  
fun Html.section(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("section", classes = classes, attrs = attrs, content)  
fun Html.section(vararg attrs: Pair<String, Any>) =  
    tag("section", attrs = attrs)  
fun Html.section(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("section", classes = classes, attrs = attrs)  

fun Html.select(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("select", attrs = attrs, content = content)  
fun Html.select(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("select", classes = classes, attrs = attrs, content)  
fun Html.select(vararg attrs: Pair<String, Any>) =  
    tag("select", attrs = attrs)  
fun Html.select(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("select", classes = classes, attrs = attrs)  

fun Html.slot(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("slot", attrs = attrs, content = content)  
fun Html.slot(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("slot", classes = classes, attrs = attrs, content)  
fun Html.slot(vararg attrs: Pair<String, Any>) =  
    tag("slot", attrs = attrs)  
fun Html.slot(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("slot", classes = classes, attrs = attrs)  

fun Html.small(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("small", attrs = attrs, content = content)  
fun Html.small(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("small", classes = classes, attrs = attrs, content)  
fun Html.small(vararg attrs: Pair<String, Any>) =  
    tag("small", attrs = attrs)  
fun Html.small(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("small", classes = classes, attrs = attrs)  

fun Html.source(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("source", attrs = attrs, content = content)  
fun Html.source(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("source", classes = classes, attrs = attrs, content)  
fun Html.source(vararg attrs: Pair<String, Any>) =  
    tag("source", attrs = attrs)  
fun Html.source(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("source", classes = classes, attrs = attrs)  

fun Html.span(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("span", attrs = attrs, content = content)  
fun Html.span(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("span", classes = classes, attrs = attrs, content)  
fun Html.span(vararg attrs: Pair<String, Any>) =  
    tag("span", attrs = attrs)  
fun Html.span(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("span", classes = classes, attrs = attrs)  

fun Html.strong(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("strong", attrs = attrs, content = content)  
fun Html.strong(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("strong", classes = classes, attrs = attrs, content)  
fun Html.strong(vararg attrs: Pair<String, Any>) =  
    tag("strong", attrs = attrs)  
fun Html.strong(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("strong", classes = classes, attrs = attrs)  

fun Html.style(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("style", attrs = attrs, content = content)  
fun Html.style(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("style", classes = classes, attrs = attrs, content)  
fun Html.style(vararg attrs: Pair<String, Any>) =  
    tag("style", attrs = attrs)  
fun Html.style(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("style", classes = classes, attrs = attrs)  

fun Html.sub(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("sub", attrs = attrs, content = content)  
fun Html.sub(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("sub", classes = classes, attrs = attrs, content)  
fun Html.sub(vararg attrs: Pair<String, Any>) =  
    tag("sub", attrs = attrs)  
fun Html.sub(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("sub", classes = classes, attrs = attrs)  

fun Html.summary(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("summary", attrs = attrs, content = content)  
fun Html.summary(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("summary", classes = classes, attrs = attrs, content)  
fun Html.summary(vararg attrs: Pair<String, Any>) =  
    tag("summary", attrs = attrs)  
fun Html.summary(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("summary", classes = classes, attrs = attrs)  

fun Html.sup(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("sup", attrs = attrs, content = content)  
fun Html.sup(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("sup", classes = classes, attrs = attrs, content)  
fun Html.sup(vararg attrs: Pair<String, Any>) =  
    tag("sup", attrs = attrs)  
fun Html.sup(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("sup", classes = classes, attrs = attrs)  

fun Html.svg(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("svg", attrs = attrs, content = content)  
fun Html.svg(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("svg", classes = classes, attrs = attrs, content)  
fun Html.svg(vararg attrs: Pair<String, Any>) =  
    tag("svg", attrs = attrs)  
fun Html.svg(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("svg", classes = classes, attrs = attrs)  

fun Html.table(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("table", attrs = attrs, content = content)  
fun Html.table(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("table", classes = classes, attrs = attrs, content)  
fun Html.table(vararg attrs: Pair<String, Any>) =  
    tag("table", attrs = attrs)  
fun Html.table(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("table", classes = classes, attrs = attrs)  

fun Html.tbody(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("tbody", attrs = attrs, content = content)  
fun Html.tbody(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("tbody", classes = classes, attrs = attrs, content)  
fun Html.tbody(vararg attrs: Pair<String, Any>) =  
    tag("tbody", attrs = attrs)  
fun Html.tbody(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("tbody", classes = classes, attrs = attrs)  

fun Html.td(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("td", attrs = attrs, content = content)  
fun Html.td(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("td", classes = classes, attrs = attrs, content)  
fun Html.td(vararg attrs: Pair<String, Any>) =  
    tag("td", attrs = attrs)  
fun Html.td(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("td", classes = classes, attrs = attrs)  

fun Html.template(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("template", attrs = attrs, content = content)  
fun Html.template(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("template", classes = classes, attrs = attrs, content)  
fun Html.template(vararg attrs: Pair<String, Any>) =  
    tag("template", attrs = attrs)  
fun Html.template(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("template", classes = classes, attrs = attrs)  

fun Html.textarea(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("textarea", attrs = attrs, content = content)  
fun Html.textarea(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("textarea", classes = classes, attrs = attrs, content)  
fun Html.textarea(vararg attrs: Pair<String, Any>) =  
    tag("textarea", attrs = attrs)  
fun Html.textarea(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("textarea", classes = classes, attrs = attrs)  

fun Html.tfoot(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("tfoot", attrs = attrs, content = content)  
fun Html.tfoot(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("tfoot", classes = classes, attrs = attrs, content)  
fun Html.tfoot(vararg attrs: Pair<String, Any>) =  
    tag("tfoot", attrs = attrs)  
fun Html.tfoot(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("tfoot", classes = classes, attrs = attrs)  

fun Html.th(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("th", attrs = attrs, content = content)  
fun Html.th(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("th", classes = classes, attrs = attrs, content)  
fun Html.th(vararg attrs: Pair<String, Any>) =  
    tag("th", attrs = attrs)  
fun Html.th(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("th", classes = classes, attrs = attrs)  

fun Html.thead(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("thead", attrs = attrs, content = content)  
fun Html.thead(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("thead", classes = classes, attrs = attrs, content)  
fun Html.thead(vararg attrs: Pair<String, Any>) =  
    tag("thead", attrs = attrs)  
fun Html.thead(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("thead", classes = classes, attrs = attrs)  

fun Html.time(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("time", attrs = attrs, content = content)  
fun Html.time(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("time", classes = classes, attrs = attrs, content)  
fun Html.time(vararg attrs: Pair<String, Any>) =  
    tag("time", attrs = attrs)  
fun Html.time(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("time", classes = classes, attrs = attrs)  

fun Html.title(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("title", attrs = attrs, content = content)  
fun Html.title(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("title", classes = classes, attrs = attrs, content)  
fun Html.title(vararg attrs: Pair<String, Any>) =  
    tag("title", attrs = attrs)  
fun Html.title(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("title", classes = classes, attrs = attrs)  

fun Html.tr(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("tr", attrs = attrs, content = content)  
fun Html.tr(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("tr", classes = classes, attrs = attrs, content)  
fun Html.tr(vararg attrs: Pair<String, Any>) =  
    tag("tr", attrs = attrs)  
fun Html.tr(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("tr", classes = classes, attrs = attrs)  

fun Html.track(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("track", attrs = attrs, content = content)  
fun Html.track(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("track", classes = classes, attrs = attrs, content)  
fun Html.track(vararg attrs: Pair<String, Any>) =  
    tag("track", attrs = attrs)  
fun Html.track(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("track", classes = classes, attrs = attrs)  

fun Html.u(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("u", attrs = attrs, content = content)  
fun Html.u(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("u", classes = classes, attrs = attrs, content)  
fun Html.u(vararg attrs: Pair<String, Any>) =  
    tag("u", attrs = attrs)  
fun Html.u(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("u", classes = classes, attrs = attrs)  

fun Html.ul(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("ul", attrs = attrs, content = content)  
fun Html.ul(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("ul", classes = classes, attrs = attrs, content)  
fun Html.ul(vararg attrs: Pair<String, Any>) =  
    tag("ul", attrs = attrs)  
fun Html.ul(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("ul", classes = classes, attrs = attrs)  

fun Html.`var`(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("var", attrs = attrs, content = content)  
fun Html.`var`(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("var", classes = classes, attrs = attrs, content)  
fun Html.`var`(vararg attrs: Pair<String, Any>) =  
    tag("var", attrs = attrs)  
fun Html.`var`(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("var", classes = classes, attrs = attrs)  

fun Html.video(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("video", attrs = attrs, content = content)  
fun Html.video(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("video", classes = classes, attrs = attrs, content)  
fun Html.video(vararg attrs: Pair<String, Any>) =  
    tag("video", attrs = attrs)  
fun Html.video(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("video", classes = classes, attrs = attrs)  

fun Html.wbr(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("wbr", attrs = attrs, content = content)  
fun Html.wbr(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
    tag("wbr", classes = classes, attrs = attrs, content)  
fun Html.wbr(vararg attrs: Pair<String, Any>) =  
    tag("wbr", attrs = attrs)  
fun Html.wbr(classes: String? = null, vararg attrs: Pair<String, Any>) =  
    tag("wbr", classes = classes, attrs = attrs)  

