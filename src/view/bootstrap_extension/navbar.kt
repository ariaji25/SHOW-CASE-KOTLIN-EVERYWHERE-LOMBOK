package com.kotlinshowcase.view.bootstrap_extension

import kotlinx.html.*


fun FlowContent.navbar(additionClass : String?){
    div("navbar ${additionClass}"){
        div("collapse navbar-collapse text-center"){
            id="navigationBar"
            ul("navbar-nav justify-content-center mr-auto"){
                li("nav-item"){
                    a(classes = "nav-link", href = "#"){
                        +"HOME"
                    }
                }
                li("nav-item"){
                    a(classes = "nav-link", href = "#"){
                        +"PROFIL"
                    }
                }
                li("nav-item"){
                    a(classes = "nav-link", href = "#"){
                        +"CONTACT"
                    }
                }
            }
        }
    }
}

fun FlowContent.centerNav(){
    ul("nav justify-content-center mr-auto bg-dark"){
        li("nav-item"){
            a(classes = "nav-link text-light", href = "#"){
                +"HOME"
            }
        }
        li("nav-item"){
            a(classes = "nav-link text-light", href = "#"){
                +"PROFIL"
            }
        }
        li("nav-item"){
            a(classes = "nav-link text-light", href = "#"){
                +"CONTACT"
            }
        }
    }
}