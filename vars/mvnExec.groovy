void call(Map config = [:]) {
    echo "Provede mvn build. Mapa by měla obsahovat mvn verzi, jdk verzi a mvn goals"
        withMaven(jdk: config.get("jdk.version"), maven: config.get("mvn.version")) {
          sh "mvn $config.get("mvn.goals")
        }
}
