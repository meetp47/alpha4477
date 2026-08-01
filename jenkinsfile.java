pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                bat 'javac index.java'
            }
        }  
stages('Run'){
  steps{
    bat 'java index'
    }
}
