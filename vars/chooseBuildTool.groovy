def call(Map config = [:]) {
    tools {
         sh "${config.type} "${config.name}""
    }
}
