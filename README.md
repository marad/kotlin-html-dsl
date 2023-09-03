# Kotlin HTML DSL

Pretty simple and extensible library to generate HTML with HTML-like 
DSL in kotlin. It supports all the HTML5 tags and lets you easily 
define new tags and custom components.

Aim of this project is to make it simple to generate HTML and its parts 
for usage with [HTMX](https://htmx.org/) and I strongly believe that it'll 
be of help in many cases where you simply need to generate HTML.

#### Why not just use kotlinx.html?
It's surprisingly complicated. Each time I wanted to do anything 
I inevitably landed on Stack Overflow. It shouldn't be like that.

kotlinx.html library makes it especially hard to create reusable parts of HTML
which is something I'm especially interested in :)

With that said - kotlinx.html works with `org.w3c.dom.Document` interface 
while my library generates HTML string. Keep that in mind while 
looking for a library to use!

## Usage

Define your dependency:

```kotlin
implementation("gh.marad:kotlin-html-dsl:<VERSION>")
```

And you are good to go! There are currently 3 top-level functions that will 
get you going: 

- `html` - this will start the full HTML document
- `div` - this will generate only single div with contents. It's useful for 
  defining custom components within your functions.
- `tag` - that one is a bit special because it lets you define any tag.

### Examples

To kick things of lets generate a page with link to Google:

```kotlin
import gh.marad.html.dsl.*

val result: String = html {
    head {
        title { text("My Page Title") }
    }
    body {
        div("container") {
            a("button", "href" to "https://google.com/") {
                text("This is a link to google")
            }
        }
    }
}
```

You can pass **classes** as a first argument to all the functions (`container`
and `button` in the example above). 
**Attributes** are passed as pairs later, but you can also skip the class and go
straight to attributes.

If you want to simply create a part of the HTML you'll probably want to 
use `div` for that:

```kotlin
import gh.marad.html.dsl.*

val result: String = div {
    text("Hello World!")
}
```

And finally - you can enclose some parts of your HTML for later use with 
custom functions:

```kotlin
import gh.marad.html.dsl.*

fun Html.hello(name: String) = div {
    text("Hello $name!")
}

val result: String = html {
    body {
        hello("World")
    }
}
```

It might prove useful for defining parts of your UI and reuse them across the 
whole codebase.

#### "I'm a hacker and I need more control"
I hear you. I've made this library to be as feature complete as possible, but
I don't know every use case so here is a secret: this DSL is pretty thin 
wrapper around `StringBuilder`. It's exposed in every function as `sb` so
you can basically append anything there:

```kotlin
fun Html.htmlInjection() = div {
    sb.append("</div><div>") // look mom! two divs!
}
```

# I need your help!
It's important to me that the library is easy to use for developers. If you 
find anything inconsistent, illogical, not easy or straight up annoying
please let me know. You can do that by creating an issue and we'll talk.

Remember that developer experience don't end with code. It also includes the 
documentation so if you find yourself struggling with it - also let me know!