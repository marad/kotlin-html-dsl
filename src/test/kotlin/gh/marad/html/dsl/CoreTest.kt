package gh.marad.html.dsl

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class CoreTest {
    @Test
    fun `simple html document generation`() {
        html {} shouldBe """
            <!DOCTYPE html>
            <html></html>
        """.trimIndent()
    }

    @Test
    fun `generate part with custom top level tag`() {
        tag("custom") {} shouldBe "<custom></custom>"
    }

    @Test
    fun `should define element class`() {
        div("some-class") {} shouldBe
                "<div class=\"some-class\"></div>"
    }

    @Test
    fun `class argument overwrites class from attributes`() {
        div("class-a", "class" to "class-b") { } shouldBe
                "<div class=\"class-a\"></div>"
    }

    @Test
    fun `add tag attributes`() {
        div("a" to "1", "b" to "2") { } shouldBe
                "<div a=\"1\" b=\"2\"></div>"
    }

    @Test
    fun `set inner tag text`() {
        div { text("inner text") } shouldBe
                "<div>inner text</div>"
    }

    @Test
    fun `should allow nesting tags`() {
        div { span {} } shouldBe
                "<div><span></span></div>"
    }
}