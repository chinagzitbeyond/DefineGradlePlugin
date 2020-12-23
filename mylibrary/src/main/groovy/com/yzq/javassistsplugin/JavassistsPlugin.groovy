package com.yzq.javassistsplugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class JavassistsTestPlugin implements   Plugin<Project> {

    @Override
    void apply(Project project) {
        println("yzq plugin")
        for(int i = 0; i < 3; i++){
            if(i == 0){
                println("初始化插件")
            }
            if(i == 1){
                println("开始加载插件内容........")
            }
            if(i == 2){
                println("加载插件完成.........")

            }

        }

    }
}