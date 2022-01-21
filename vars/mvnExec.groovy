void call(Map config = [:]) {
    echo "Provede mvn build. Mapa by měla obsahovat mvn verzi, jdk verzi a mvn goals"
        withMaven(jdk: config.get("jdkVersion"), maven: config.get("mvnVersion")) {
          sh "mvn $config.get("mvnGoals")"
        }
}
