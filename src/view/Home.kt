package com.kotlinshowcase.view

import com.kotlinshowcase.style
import com.kotlinshowcase.view.bootstrap_extension.card
import com.kotlinshowcase.view.bootstrap_extension.container
import com.kotlinshowcase.view.bootstrap_extension.jumbotron
import kotlinx.html.*
import io.ktor.html.*
import kotlinx.css.LinearDimension

class Home : Template<FlowContent>{
    override fun FlowContent.apply() {
        jumbotron("bg-light"){
            container("text-center"){
                h1("display-3 text-dark"){
                    +"HOME"
                }
                p("lead text-dark"){
                    +"Welcome to this landing Page"
                    br()
                    +"this landing page is maked by Kotlin HTML DSL with Bootstrap UI"
                }
            }
        }
        container ("text-center"){
            for(j in 0..2){
                div("card-deck"){
                    style {
                        marginTop = LinearDimension("30px")
                    }
                    for ( i in 0..2){
                        card {
                            style {
                                width = LinearDimension("18rem")
                            }
                            img("image","/static/firewatch.jpg","card-image"){
                                height = "200px"
                                style {
                                    backgroundSize = "cover"
                                }
                            }
                            div("card-body"){
                                h5("card-title"){
                                    +"CARD TITLE"
                                }
                                p("card-text text-dark"){
                                    +"Some quick example text to build on the card title and make up the bulk of the card's content."
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}


fun FlowContent.contentBgImage(){
    div("bg-dark text-dark text-center align-middle"){
        img("img", "https://ak6.picdn.net/shutterstock/videos/21633346/thumb/1.jpg", "card-img"){
            width = "100vps"
        }
        div("card-img-overlay"){
            h1("display-4 card-title"){
                style {
                    marginTop = LinearDimension("50px")
                }
                +"CARD TITLE"
            }
            p("card-text text-dark"){
                +"Some quick example text to build on the card title and make up the bulk of the card's content."
            }
        }
    }
}