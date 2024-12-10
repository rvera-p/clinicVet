pipeline {
    agent any
    tools {
        maven 'Maven'
        jdk 'JDK17'
    }

    stages {
        stage('Clone Repository') {
            steps {
                git url: 'https://github.com/rvera-p/clinicVet.git', branch: 'master'
            }
        }
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
