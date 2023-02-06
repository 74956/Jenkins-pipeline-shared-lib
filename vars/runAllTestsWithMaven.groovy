def call(String str) {
    sh "mvn -Dmaven.test.failure.ignore=true clean package"
}
