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
