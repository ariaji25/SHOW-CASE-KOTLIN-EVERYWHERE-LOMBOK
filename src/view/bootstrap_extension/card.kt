package com.kotlinshowcase.view.bootstrap_extension

import kotlinx.html.*

fun FlowContent.card(additionClasses:String?=null, init:DIV.() -> Unit){
    div("card ${additionClasses}", init)
}