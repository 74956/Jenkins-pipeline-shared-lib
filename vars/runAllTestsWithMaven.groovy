def call(String str) {
    git "${str}"
    sh "mvn -Dmaven.test.failure.ignore=true clean package"
}
