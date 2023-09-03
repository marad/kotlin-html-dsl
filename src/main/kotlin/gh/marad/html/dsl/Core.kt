@file:Suppress("unused")

package gh.marad.html.dsl

class Html {
    val sb = StringBuilder()

    companion object {
        fun create(content: Html.() -> Unit): String {
            val html = Html()
            html.content()
            return html.sb.toString()
        }
    }
}

fun tag(name: String, vararg attrs: Pair<String, Any>, content: Html.() -> Unit): String =
    tag(name = name, classes = null, attrs = attrs, content)
fun tag(name: String, classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit): String {
    return Html.create {
        tag(name = name, classes = classes, attrs = attrs, content)
    }
}

fun html(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit): String {
    return Html.create {
        sb.appendLine("<!DOCTYPE html>")
        html(classes = classes, attrs = attrs, content)
    }
}

fun div(vararg attrs: Pair<String, Any>, content: Html.() -> Unit): String =
    div(classes = null, attrs = attrs, content)
fun div(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit): String {
    return Html.create {
        div(classes = classes, attrs = attrs, content)
    }
}

fun Html.tag(name: String, classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit) {
    sb.append("<$name")
    if (classes != null) {
        attrs.toMap().plus("class" to classes)
    } else {
        attrs.toMap()
    }.forEach { (key, value) ->
        sb.append(" $key=\"$value\"")
    }
    sb.append(">")
    content()
    sb.append("</$name>")
}

fun Html.tag(name: String, vararg attrs: Pair<String, Any>) =
    tag(name = name, classes = null, attrs = attrs)
fun Html.tag(name: String, classes: String? = null, vararg attrs: Pair<String, Any>) {
    sb.append("<$name")
    if (classes != null) {
        attrs.toMap().plus("class" to classes)
    } else {
        attrs.toMap()
    }.forEach { (key, value) ->
        sb.append(" $key=\"$value\"")
    }
    sb.append(">")
    sb.append("</$name>")
}

fun Html.text(text: String) {
    sb.append(text)
}