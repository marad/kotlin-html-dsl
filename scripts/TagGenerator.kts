import java.nio.file.Files
import java.nio.file.Paths

val tags = listOf(
    "a", "abbr", "address", "area", "article", "aside", "audio", "b", "base", "bdi", "bdo",
    "blockquote", "body", "br", "button", "canvas", "caption", "cite", "code", "col", "colgroup",
    "data", "datalist", "dd", "del", "details", "dfn", "dialog", "div", "dl", "dt", "em", "embed",
    "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6",
    "head", "header", "hgroup", "hr", "html", "i", "iframe", "img", "input", "ins", "kbd",
    "label", "legend", "li", "link", "main", "map", "mark", "meta", "meter", "nav", "noscript",
    "object", "ol", "optgroup", "option", "output", "p", "param", "picture", "pre", "progress",
    "q", "rb", "rp", "rt", "rtc", "ruby", "s", "samp", "script", "section", "select", "slot",
    "small", "source", "span", "strong", "style", "sub", "summary", "sup", "svg", "table",
    "tbody", "td", "template", "textarea", "tfoot", "th", "thead", "time", "title", "tr", "track",
    "u", "ul", "var", "video", "wbr"
)

val keywords = listOf("object", "var")

fun createTag(name: String): String {
    val funcName = escapeKeyword(name)

    return """  
fun Html.$funcName(vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("$name", attrs = attrs.toMap(), content = content)  
fun Html.$funcName(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) =  
tag("$name", classes, attrs.toMap(), content)  
fun Html.$funcName(vararg attrs: Pair<String, Any>) =  
tag("$name", attrs = attrs.toMap())  
fun Html.$funcName(classes: String? = null, vararg attrs: Pair<String, Any>) =  
tag("$name", classes, attrs.toMap())  
""".trimIndent()
}

fun escapeKeyword(name: String): String =
    if (name in keywords) "`$name`"
    else name


val sb = StringBuilder()

sb.appendLine("package gh.marad.html.dsl")
sb.appendLine()
tags.forEach {
    sb.appendLine(createTag(it))
    sb.appendLine()
}

Files.write(
    Paths.get("../src/main/kotlin/gh/marad/html/dsl/Tags.kt"),
    sb.toString().toByteArray()
)