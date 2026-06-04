pipeline {
    agent any

    stages {

        stage('Build Maven') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t abhinav654/myapp .'
            }
        }

        stage('Docker Login') {

            steps {

                withCredentials([
                    usernamePassword(
                        credentialsId: 'dockerhub',
                        usernameVariable: 'DOCKER_USER',
                        passwordVariable: 'DOCKER_PASS'
                    )
                ]) {

                    bat 'docker login -u %DOCKER_USER% -p %DOCKER_PASS%'

                }
            }
        }


        stage('Push Image') {
            steps {
                bat 'docker push abhinav654/myapp'
            }
        }
    }
}