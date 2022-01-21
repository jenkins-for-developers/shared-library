void call(Map config = [:]) {
    echo "Provede mvn build. Mapa by měla obsahovat mvn verzi, jdk verzi a mvn goals"
    
        echo config.get("jdkVersion")
        echo config.get("mvnVersion")
        echo config.get("mvnGoals")
        withMaven(jdk: config.get("jdkVersion"), maven: config.get("mvnVersion")) {
          sh "mvn $config.get("mvnGoals")"
        }
}
