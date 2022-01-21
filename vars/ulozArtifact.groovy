void call(Map config = [:]) {
    archiveArtifacts artifacts: 'target/*.jar'
}
