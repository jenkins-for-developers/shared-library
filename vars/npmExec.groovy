void call(Map config = [:]) {
    env.NODE_HOME="${tool 'Node 17.4.0'}"
    env.PATH="${env.NODE_HOME}/bin:${env.PATH}"
    sh 'npm -version'
    sh 'npm install'
    sh 'npm run build' 
}
