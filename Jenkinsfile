pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Compilando el proyecto...'
                sh 'mvn clean install'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Desplegando la aplicación...'
                sh 'java -jar target/*.jar'
            }
        }
    }
}