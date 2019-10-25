package com.kotlinshowcase.view.bootstrap_extension

import kotlinx.html.*

fun FlowContent.jumbotron(additionClasses : String? = null, init : DIV.() -> Unit){
    div("jumbotron ${additionClasses}", init)
}