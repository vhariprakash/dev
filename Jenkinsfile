pipeline {
  agent any
  stages {
    stage('one') {
      agent {
        node {
          label 'node1'
        }

      }
      steps {
        build 'blue'
      }
    }
  }
}