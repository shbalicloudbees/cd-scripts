def Project = getPlugin(pluginName: "EC-Helm").projectName
def ConfigLocation = getProperty(propertyName: "ec_config/configLocation", projectName: Project).value
//println "config location is " + ConfigLocation
def Configs = getProperties(propertyName: ConfigLocation, projectName: Project).property
Configs.each { Config ->
    //println Config
    if (Config.name == "test5"){
        println "config name - " + Config.name + " exists";
    }
}





