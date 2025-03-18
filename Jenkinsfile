pipeline {
    agent any

    stages{

       stage('Checkout'){
         steps{
            git branch: 'main',url:'https://github.com/tusharjadhav2386/SpringbootTesting.git'
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

        stage('Build docker image')
        {
        steps{
          script{
          sh 'docker build -t app .'
          }
        }
        }

        stage('Push Docker Image')
        {
          steps{

          script{

          sh 'docker login -u tusharjadhav2386 -p tushar@2386'
          sh 'docker push tusharjadhav2386/dockerimagejenkine:app'



              }
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
