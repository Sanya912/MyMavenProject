pipeline {
    agent any

    stages {
        stage('Build Assets') {
            agent any
            steps {
                echo 'Building Assets...'
            }
        }
        stage('Test') {
            agent any
            steps {
                echo 'Testing stuff...'
            }
        }
        stage('Run job Test3') {
                build job: 'Test3'
        }
    }
}