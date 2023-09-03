package gh.marad.html.dsl

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class CustomComponentTest {
    fun Html.MyComponent() =
        div { text("My Component") }

    @Test
    fun `should insert custom component in html`() {
        html {
            MyComponent()
        } shouldBe """
            <!DOCTYPE html>
            <html><div>My Component</div></html>
        """.trimIndent()
    }
}