pipeline{
    agent any
    stages{
        stage("build"){
            steps{
        echo'building'
        /*sh 'mvn clean compile'*/
            }
        }
        stage("test"){
            steps{
        echo'testing'
        /*Sonarqube*/
            }
        }
        stage("deploy"){
            steps{
        echo'deploying'
            }
        }
    }
    
}