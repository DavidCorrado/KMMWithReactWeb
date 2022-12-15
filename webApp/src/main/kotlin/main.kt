import browser.document
import com.corradodev.kmmwithreactweb.getPlatform
import react.create
import react.dom.client.createRoot

fun main() {
    console.log(getPlatform().name)
    val container = document.createElement("div")
    document.body.appendChild(container)

    val welcome = Welcome.create {
        name = getPlatform().name
    }
    createRoot(container).render(welcome)
}