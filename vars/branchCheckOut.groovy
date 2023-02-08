def call(String branch, String gitUrl) {
checkout scmGit(
    branches: [[name: "${branch}"]],
    userRemoteConfigs: [[url: "${gitUrl}"]])
    }
