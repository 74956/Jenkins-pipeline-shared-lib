def call(String gitUrl) {
    echo "Clone repository from ${gitUrl}"
    git "${gitUrl}"
}
