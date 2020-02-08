pipeline {
    agent {
        docker {
            image 'openjdk/openjdk:11.0.6-slim'
        }
    }
    stages {
        stage('Run tests') {
            steps {
                sh 'gradle +x gradlew'
                sh './gradlew cleanTest test'
            }
        }
        stage('Build JAR') {
            steps {
                sh './gradlew build'
            }
        }
    }
}
