def call(Map config = [:]) {
    sh "${config.type} ${config.name}"
}
