#!/usr/bin/env groovy
def call(){
    echo "building docker image"
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t venkataramanaiahnagella/demo-app:java-maven-app-2.0 .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push venkataramanaiahnagella/demo-app:java-maven-app-2.0'
    }
}