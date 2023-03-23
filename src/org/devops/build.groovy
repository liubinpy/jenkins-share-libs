package org.devops

// 构建类型
def Build(buildType, buildShell){
  def buildTools = ["mvn":"m3", "npm":"node"]
  println("当前选择的构建类型为 ${buildType}")
  buildHome = tool buildTools[buildType]
  
  sh "${buildHome}/bin/${buildType}  ${buildShell}"
   
}
