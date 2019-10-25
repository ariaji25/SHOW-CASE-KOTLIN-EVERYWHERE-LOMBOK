package com.kotlinshowcase.view

import com.kotlinshowcase.style
import com.kotlinshowcase.view.bootstrap_extension.centerNav
import com.kotlinshowcase.view.bootstrap_extension.navbar
import io.ktor.html.*
import kotlinx.css.LinearDimension
import kotlinx.html.*

class Main : Template<HTML>{
    val home = TemplatePlaceholder<Home>()
    override fun HTML.apply() {
        head{
            title = "KOTLIN SHOWCASE"
            link("/static/bootstrap/css/bootstrap.min.css", "stylesheet")
        }
        body{
            centerNav()
            section{
                id="HOME"
                insert(Home(), home)
            }
        }
    }
}