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

fun tag(name: String, classes: String? = null, attrs: Map<String, Any> = emptyMap(), content: Html.() -> Unit): String {
    return Html.create {
        tag(name, classes, attrs, content)
    }
}

fun html(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit): String {
    return Html.create {
        html(classes = classes, attrs = attrs, content)
    }
}

fun div(classes: String? = null, vararg attrs: Pair<String, Any>, content: Html.() -> Unit): String {
    return Html.create {
        div(classes = classes, attrs = attrs, content)
    }
}

fun Html.tag(name: String, classes: String? = null, attrs: Map<String, Any> = emptyMap(), content: Html.() -> Unit) {
    sb.append("<$name")
    if (classes != null) {
        attrs.plus("class" to classes)
    } else {
        attrs
    }.forEach { (key, value) ->
        sb.append(" $key=\"$value\"")
    }
    sb.append(">")
    content()
    sb.append("</$name>")
}

fun Html.tag(name: String, classes: String? = null, attrs: Map<String, Any> = emptyMap()) {
    sb.append("<$name")
    if (classes != null) {
        attrs.plus("class" to classes)
    } else {
        attrs
    }.forEach { (key, value) ->
        sb.append(" $key=\"$value\"")
    }
    sb.append(">")
    sb.append("</$name>")
}

fun Html.text(text: String) {
    sb.append(text)
}