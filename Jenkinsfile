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
          sh 'docker build -t springboottesting1 .'
          }
        }
        }



        stage('Push Docker Image')
        {
          steps{

          script{

          sh 'docker login -u tusharjadhav2386 -p tushar@2386'
          sh 'docker tag springboottesting1 tusharjadhav2386/testingdocker:springboottesting1'
          sh 'docker push tusharjadhav2386/testingdocker:springboottesting1'



              }
            }

         }

          stage('RunDocr image')
        {
         steps{
         script{
         sh 'docker run -p 9090:8081 springboottesting1 '
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
