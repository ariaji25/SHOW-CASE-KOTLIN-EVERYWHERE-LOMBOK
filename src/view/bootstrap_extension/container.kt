package com.kotlinshowcase.view.bootstrap_extension

import kotlinx.html.*

fun FlowContent.container(additoinClase:String?=null, init : DIV.() -> Unit){
    div("container ${additoinClase}", init)
}