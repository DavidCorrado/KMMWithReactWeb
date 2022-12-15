import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.useState

external interface WelcomeProps : Props {
    var name: String
}

val Welcome = FC<WelcomeProps> { props ->
    val name by useState(props.name)
    div {
        +"Hello, $name"
    }
}