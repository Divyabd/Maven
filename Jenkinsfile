pipeline{
  agent {
    docker {
      image 'maven:3-alpine'
      args '-v /root/.m2:/root/.m2'
    }
  }
  stages {
    stage('Build'){
      steps{
       echo "hii"
      }
     }
    stage('Test'){
      steps{
        sh 'mvn test'
      }
      
  }
  }
}
