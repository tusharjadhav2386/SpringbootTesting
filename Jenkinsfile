pipeline {
    agent any

    stages{
       stage('Checkout'){
         steps{
            git 'https://github.com/tusharjadhav2386/SpringbootTesting.git'
          }
         }
       stage('Bulid'){
        steps{
          sh 'mvn clean install'
        }
          }
        stage('Test')
        {
        steps{
          sh 'mvn test'
        }
        }
        stage('package')
        {
        steps{
        sh 'mvn package'
        }
        }
        stage('Deploy')
        {
        steps
        {
         deploy adapters: [tomcat9(credentialsId: 'publicrepo', path: '', url: 'http://localhost:8080/')], contextPath: null, war: '**/*.war'
        }
        }

         }

         post {
                 success {
                     echo 'Build successful'
                 }
                 failure {
                     echo 'Build failed'
                 }
             }
    }
