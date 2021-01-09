package com.github.ekrmh.intellijplatformdemoplugin.services

import com.intellij.openapi.project.Project
import com.github.ekrmh.intellijplatformdemoplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
